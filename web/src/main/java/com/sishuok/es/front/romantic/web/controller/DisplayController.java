package com.sishuok.es.front.romantic.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.common.collect.Maps;
import com.sishuok.es.basedata.entity.ArtistInfo;
import com.sishuok.es.basedata.entity.ArtistTypeEnum;
import com.sishuok.es.basedata.entity.ArtistWorksInfo;
import com.sishuok.es.basedata.service.ArtistService;
import com.sishuok.es.basedata.service.ArtistWorksService;
import com.sishuok.es.common.entity.search.Searchable;
import com.sishuok.es.common.repository.Specification.CriteriaCustom;
import com.sishuok.es.common.repository.Specification.RestrictionUtil;
import com.sishuok.es.core.common.DataStatusEnum;

@Controller
@RequestMapping(value = "/front")
public class DisplayController {
	private static Logger logger = LoggerFactory.getLogger(DisplayController.class);

	//	@Autowired
	//	private WeddingParamService weddingParamService;
	//	@Autowired
	//	private AttachmentImageService attachmentImageService;
	//	@Autowired
	//	private PhotoerService photoerService;
	//	@Autowired
	//	private PhotoerWorksService photoerWorksService;
	//	@Autowired
	//	private MakeupMakeerService makeupMakeerService;
	//	@Autowired
	//	private MakeupWorksService makeupWorksService;
	//	@Autowired
	//	private DressService dressService;

	@Autowired
	private ArtistService<ArtistInfo> artistService;
	@Autowired
	private ArtistWorksService<ArtistWorksInfo> artistWorksService;

	private PageHandler getArtistList(Model model, Integer pageid, ArtistTypeEnum artistType) {
		PageHandler pageHandler = new PageHandler();
		pageHandler.setCurPageIndex(pageid);
		if (pageHandler.getCurPageIndex() < 1) {
			return null;
		}
		PageRequest pageable = new PageRequest(pageHandler.getCurPageIndex() - 1, pageHandler.getPerPageSize(), new Sort(Direction.ASC, "priority"));
		Map<String, Object> searchParams = Maps.newHashMap();
		searchParams.put("artistType_eq", artistType.name());
		searchParams.put("dataStatus_eq", DataStatusEnum.enable.name());
		Searchable searchable = Searchable.newSearchable(searchParams);
		searchable.setPage(pageable);
		Page<ArtistInfo> pageResult = artistService.findAll(searchable);

		pageHandler.setTotalRecordCount(pageResult.getTotalElements());
		pageHandler.setCurPageResultList(pageResult.getContent());
		pageHandler.processModel(model);
		return pageHandler;
	}

	private PageHandler getArtistWorksList(Model model, Integer pageid, Long artistID, ArtistTypeEnum artistType) {
		PageHandler pageHandler = new PageHandler();
		pageHandler.setCurPageIndex(pageid);
		if (pageHandler.getCurPageIndex() < 1) {
			return null;
		}

		PageRequest pageable = new PageRequest(pageHandler.getCurPageIndex() - 1, pageHandler.getPerPageSize(), new Sort(Direction.ASC, "seq"));

		Page<ArtistWorksInfo> pageResult = null;
//		try {
//			Map<String, Object> searchParams = Maps.newHashMap();
//			searchParams.put("artist.artistType_eq", artistType.name());
//			searchParams.put("artist.dataStatus_eq", DataStatusEnum.enable.name());
//			searchParams.put("artist.id_eq", artistID);
//			Searchable searchable = Searchable.newSearchable(searchParams);
//			searchable.setPage(pageable);
//			//		searchable.markConverted();
//			pageResult = artistWorksService.findAll(searchable);
//			System.out.println(pageResult.getTotalElements());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("======================================");
		try {
			pageResult = artistWorksService.findAllByArtist(artistID, artistType, pageable);
			System.out.println(pageResult.getTotalElements());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("======================================");
		try {
			CriteriaCustom<ArtistWorksInfo> c = new CriteriaCustom<ArtistWorksInfo>();
			c.add(RestrictionUtil.eq("artist.artistType", artistType, true));
			c.add(RestrictionUtil.eq("artist.dataStatus", DataStatusEnum.enable, true));
			c.add(RestrictionUtil.eq("artist.id", artistID, true));

			pageResult = artistWorksService.findAll(c, pageable);
			System.out.println(pageResult.getTotalElements());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("======================================");
		pageHandler.setTotalRecordCount(pageResult.getTotalElements());
		pageHandler.setCurPageResultList(pageResult.getContent());
		pageHandler.processModel(model);
		if (!pageResult.getContent().isEmpty()) {
			model.addAttribute("artistInfo", pageResult.getContent().get(0).getArtist());
		} else {
			model.addAttribute("artistInfo", artistService.findOne(artistID));
		}
		return pageHandler;
	}

	@RequestMapping(value = "/makeupMakeer.do")
	public String makeupMakeer(@RequestParam("page") Integer pageid, Model model) {
		try {
			PageHandler pageHandler = getArtistList(model, pageid, ArtistTypeEnum.makeup);
			if (pageHandler == null) {
				return null;
			}
			return "front/romantic/makeup_makeer";
		} catch (Exception e) {
			e.printStackTrace();
			return "front/romantic/404";
		}
	}

	@RequestMapping(value = "/makeupWorks.do")
	public String makeupWorks(HttpServletRequest req, @RequestParam("page") Integer pageid, @RequestParam("artistID") Long artistID, Model model) {
		try {
			PageHandler pageHandler = getArtistWorksList(model, pageid, artistID, ArtistTypeEnum.makeup);
			if (pageHandler == null) {
				return null;
			}
			return "front/romantic/makeup_works";
		} catch (Exception e) {
			e.printStackTrace();
			return "front/romantic/404";
		}

	}

	@RequestMapping(value = "/photoer.do")
	public String photoer(@RequestParam("page") Integer pageid, Model model) {
		try {
			PageHandler pageHandler = getArtistList(model, pageid, ArtistTypeEnum.photographer);
			if (pageHandler == null) {
				return null;
			}
			return "front/romantic/photoer";
		} catch (Exception e) {
			e.printStackTrace();
			return "front/romantic/404";
		}

	}

	@RequestMapping(value = "/photoerWorks.do")
	public String photoerWorks(HttpServletRequest req, @RequestParam("page") Integer pageid, @RequestParam("artistID") Long artistID, Model model) {
		try {
			PageHandler pageHandler = getArtistWorksList(model, pageid, artistID, ArtistTypeEnum.photographer);
			if (pageHandler == null) {
				return null;
			}
			return "front/romantic/photoer_works";
		} catch (Exception e) {
			e.printStackTrace();
			return "front/romantic/404";
		}

	}

	@RequestMapping(value = "/dress.do")
	public String dress(HttpServletRequest req, @RequestParam("page") Integer pageid, @RequestParam("type") Long type, Model model) {
		try {
			PageHandler pageHandler = getArtistWorksList(model, pageid, type, ArtistTypeEnum.dress);
			if (pageHandler == null) {
				return null;
			}

			model.addAttribute("type", type);
			return "front/romantic/dress_wedding";
		} catch (Exception e) {
			e.printStackTrace();
			return "front/romantic/404";
		}

	}

	@RequestMapping(value = "/clean.do")
	public void clean() {
		System.out.println("clean!");
		//		photoerWorksService.clean();
	}

	@RequestMapping(value = "/romanticFactor.do")
	public String romanticFactor() {
		return "front/romantic/romantic_factor";
	}

	@RequestMapping(value = "/training.do")
	public String training() {
		return "front/romantic/training";
	}

	@RequestMapping(value = "/mealTripInfo.do")
	public String mealTripInfo() {
		return "front/romantic/meal_trip_info";
	}

	@RequestMapping(value = "/mealRecommendLocation.do")
	public String mealRecommendLocation() {
		return "front/romantic/meal_recommend_location";
	}

	@RequestMapping(value = "/mealLeaveWords.do")
	public String mealLeaveWords() {
		return "front/romantic/meal_leave_words";
	}

	@RequestMapping(value = "/mealIntroduce.do")
	public String mealIntroduce() {
		return "front/romantic/meal_introduce";
	}

	@RequestMapping(value = "/brandStory.do")
	public String brandStory() {
		return "front/romantic/brand_story";
	}

	@RequestMapping(value = "/brandPromise.do")
	public String brandPromise() {
		return "front/romantic/brand_promise";
	}

	@RequestMapping(value = "/brandCharacteristic.do")
	public String brandCharacteristic() {
		return "front/romantic/brand_characteristic";
	}

	@RequestMapping(value = "/brandAboutUs.do")
	public String brandAboutUs() {
		return "front/romantic/brand_about_us";
	}

	@RequestMapping(value = "/brandAboutPrivacy.do")
	public String brandAboutPrivacy() {
		return "front/romantic/brand_about_privacy";
	}

	//	@RequestMapping(value = "/initImage.do")
	//	public void initImage(HttpServletRequest req, Model model) {
	//		String realPathStr = FileUploadUtil.getRealPath(req, "");
	//		File rootPath = new File(realPathStr);
	//		attachmentImageService.initImageData(rootPath);
	//		//		FileUploadUtil.getSavePath(req, billType, fileName);
	//		//		return "front/romantic/brand_about_privacy";
	//	}
}