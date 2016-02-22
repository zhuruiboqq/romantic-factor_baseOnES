package com.sishuok.es.front.romantic.web.controller;

import java.util.List;

import org.springframework.ui.Model;

/**
 * 分页处理类
 * @author asus
 *
 */
public class PageHandler {
	private int curPageIndex;//当前请求页序号，以1开始
	private int totalPageSize;//总页数，以1开始
	private int perPageSize = 12;//第页记录数
	private Long totalRecordCount;//总记录数
	private String whereSql;
	private String orderSql;
	private List<?> curPageResultList;
	private List<?> allResultList;

	public int getEndIndex() {
		return getCurPageIndex() * getPerPageSize();
	}

	public int getStartIndex() {
		return (getCurPageIndex() - 1) * getPerPageSize();
	}

	public void processModel(Model model) {
		if (totalPageSize == 0) {
			totalPageSize = (int) (totalRecordCount / perPageSize + (totalRecordCount % perPageSize != 0 ? 1 : 0));
		}
		model.addAttribute("pageHandler", this);
		//		model.addAttribute("curPageResultList", curPageResultList);
		//		model.addAttribute("curPageIndex", curPageIndex);
		//		model.addAttribute("perPageSize", perPageSize);
		//		model.addAttribute("totalRecordCount", totalRecordCount);
		//		model.addAttribute("totalPageSize", totalPageSize);

		//控制按钮是否显示
		model.addAttribute("isShowFirstPage", curPageIndex != 1);//首页
		model.addAttribute("isShowPrePage", curPageIndex != 1);//上一页
		model.addAttribute("isShowNextPage", curPageIndex != 1);//下一页
		model.addAttribute("isShowLastPage", curPageIndex != totalPageSize);//尾页
	}

	private void pageHandle(Model model) {
		if (curPageIndex >= 2 && totalPageSize > 3) {
			model.addAttribute("page_first_ignore", true);
		}

		if (curPageIndex < totalPageSize - 2 && totalPageSize > 3) {
			model.addAttribute("page_last_ignore", true);
		}

		if (totalPageSize == curPageIndex && totalPageSize > 2) {
			model.addAttribute("page", curPageIndex - 2);
			model.addAttribute("page1", curPageIndex - 1);
			model.addAttribute("page2", curPageIndex);
			model.addAttribute("nextPage", curPageIndex);
		} else if (totalPageSize - 1 == curPageIndex && totalPageSize > 2) {
			model.addAttribute("page", curPageIndex - 1);
			model.addAttribute("page1", curPageIndex);
			model.addAttribute("page2", curPageIndex + 1);
			model.addAttribute("nextPage", curPageIndex + 1);
		} else {
			if (totalPageSize == 1) {
				model.addAttribute("page", 1);
				model.addAttribute("page1", 0);
				model.addAttribute("page2", 0);
				model.addAttribute("nextPage", 1);
			} else if (totalPageSize == 2) {
				model.addAttribute("page", 1);
				model.addAttribute("page1", 2);
				model.addAttribute("page2", 0);
				model.addAttribute("nextPage", 2);
			} else {
				model.addAttribute("page", curPageIndex);
				model.addAttribute("page1", curPageIndex + 1);
				model.addAttribute("page2", curPageIndex + 2);
				model.addAttribute("nextPage", curPageIndex + 3);
			}
		}
	}

	public int getCurPageIndex() {
		return curPageIndex;
	}

	public void setCurPageIndex(int curPageIndex) {
		this.curPageIndex = curPageIndex;
	}

	public int getTotalPageSize() {
		return totalPageSize;
	}

	public void setTotalPageSize(int totalPageSize) {
		this.totalPageSize = totalPageSize;
	}

	public int getPerPageSize() {
		return perPageSize;
	}

	public void setPerPageSize(int perPageSize) {
		this.perPageSize = perPageSize;
	}

	public Long getTotalRecordCount() {
		return totalRecordCount;
	}

	public void setTotalRecordCount(Long totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<?> getCurPageResultList() {
		return curPageResultList;
	}

	public void setCurPageResultList(List<?> curPageResultList) {
		this.curPageResultList = curPageResultList;
	}

	public List<?> getAllResultList() {
		return allResultList;
	}

	public void setAllResultList(List<?> allResultList) {
		this.allResultList = allResultList;
	}

}