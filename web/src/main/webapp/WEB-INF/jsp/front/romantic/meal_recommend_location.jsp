<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="/WEB-INF/jsp/front/tpl/taglibs.jsp"%>
<rf:contentHeaderFront />

<header>
	<div class="header_content">
		<%@ include file="/WEB-INF/jsp/front/tpl/head_with_title_img.jsp"%>
	</div>
</header>
<article class="introduce_article meal_recommend_location_article">
	<h1 class="content_top_title">套餐介绍</h1>
	<h2 class="content_top_title_2">SET MEAL</h2>

	<nav class="set_meal_content_nav">
		<ul>
			<li><a href="mealIntroduce.do">
					<div class="nav_link_text">套餐介绍</div>
					<div class="nav_link_line"></div>
			</a></li>
			<li><span>/</span></li>
			<li><a href="mealRecommendLocation.do">
					<div class="nav_link_text text_this">景点推介</div>
					<div class="nav_link_line line_this"></div>
			</a></li>
			<li><span>/</span></li>
			<li><a href="mealTripInfo.do">
					<div class="nav_link_text">旅游情报</div>
					<div class="nav_link_line"></div>
			</a></li>
			<li><span>/</span></li>
			<li><a href="mealLeaveWords.do">
					<div class="nav_link_text">合作留言</div>
					<div class="nav_link_line"></div>
			</a></li>
		</ul>

	</nav>
	<div class="set_meal_across_line"></div>

	<div class="recommend_location_content">
		<div class="content_one">
			<div class="left_number left">1</div>
			<div class="recommend_right_content content_one right">
				<strong style="color: #353535;">广州九龙湖度假区</strong><br />
				<p>
					从小就看《白雪公主》和《灰姑娘》童话故事长大的你，一定有幻想过某一天穿上美丽的婚纱，手挽着你的白马王子，一起步向浪漫的教堂，从此过上幸福美满的生活……这种美好的幻想来到广州九龙湖度假区原来也可以变为现实！<br />
					广州九龙湖度假区是国家AAAA级旅游景区。二万多亩连绵群山，层林叠障，苍翠如黛。度假区内拥有充裕的雨露阳光，滋养着数以千计的植物种类，尤其以荔枝闻名，愈百年而依然茂盛。
					更因为区内生态优越，吸引着二百多种动物繁衍生息，常见白鹤、麻鹤及成群白鹭，掠过湖面山脊，一派唯美景象。密林中，数百条山涧溪流，潺湲轻泻，辗转汇入水潭湖泊。九龙湖水深波平，浩渺而清澈，水质纯净甘冽，是可直接饮用水，如依云般珍贵，令人感怀自然的厚爱。在这里过上一天，身心放松，悠然自得。
				</p>
				<img src="${ctx}/static/images/front/recommend_1.jpg" />
				<p>广州九龙湖度假区内的九龙湖公主酒店，是华南地区独家拥有欧洲小镇风情的生态度假酒店，也是广州花都区首家挂牌五星级酒店，更是第16届广州亚运会指定接待酒店！酒店总占地面积11万平方米，由15栋不同风格的欧式建筑组成了美丽的欧式小镇，红色或白色的石砖外墙、灰色的双坡陡屋面、鲜花点缀的铁艺栏杆、拱门式的长廊，处处流露出别致的哥特式风情，令你恍如置身于浪漫的欧洲小镇中。</p>

			</div>
		</div>
		<div class="set_meal_across_line"></div>

		<div class="content_two">
			<div class="left_number left">2</div>
			<div class="recommend_right_content content_two right">
				<strong style="color: #353535;">广州塔</strong><br />
				<p>
					世界第一高塔“迪拜塔”你一定听说过，幻想着自己登上世界最高点，遥望天际，大地就在脚下的感觉一定很爽吧！但去一趟迪拜至少需要搭乘7、8个小时的飞机，还要支付昂贵的酒店住宿。当然，最大的麻烦还有语言不通，习惯不同啊！怎么办呢？其实，要体验高处不胜寒的感觉，近在咫尺的广州就有啦！<br />
					广州塔是中国第一，世界第三高的旅游观光塔。建筑总高度600米，其中主塔体高450米，天线桅杆高150米，具有结构超高、造型奇特、形体复杂，用钢量最多的特点。它的外框筒由24根钢柱和46个钢椭圆环交叉构成，形成镂空、开放的独特美体，它仿佛在三维空间中扭转变换。作为目前世界上建筑物腰身最细（最小处直径只有30多米），施工难度最大的建筑，建设者们克服了前所未有的工程建筑难度，把一万多个倾斜并且大小规格全部不相同的钢构件，精确安装成挺拔高耸的建筑经典作品，并创造了一系列建筑上的“世界之最”。
				</p>
				<img src="${ctx}/static/images/front/recommend_2.jpg" />
				<p>广州塔采用了当代最优秀工程设计和最新施工技术，依托其得天独厚的旅游资源，创造了488摄影观景平台“Highest Observation Deck世界最高户外观景平台”和极速云霄游乐项目“Highest Thrill
					Ride世界最高惊险之旅”两项吉尼斯世界纪录。凭借其显著的社会影响力，广州塔于2011年加盟“世界高塔联盟”，并于2013年成功创建国家AAAA级旅游景区，作为“羊城新八景”之一，广州塔肩负着传承广州2000多年历史文化底蕴、传扬广州国际化大都市发展轨迹的历史使命，一跃成为城市新地标，成为广州最受游客瞩目的旅游景区。</p>

			</div>
		</div>
		<div class="set_meal_across_line"></div>

		<div class="content_three">
			<div class="left_number left">3</div>
			<div class="recommend_right_content content_three right">
				<strong style="color: #353535;">广州世界大观园</strong><br />
				<p>
					既想去欧洲在浪漫的巴黎铁塔下留下一生回忆，又想去日本京都体验古都风情，想一想美国曼哈顿的紫醉金迷也不错喔！但时间和预算都有限，怎么办呢？不用再纠结了，来广州世界大观可以一次过满足你周游列国的梦想！<br />
					广州世界大观坐落在广州市天河区东圃镇，是一个融合五大洲民间风情、古典建筑、自然景观的大型悠闲娱乐场所。在世界大观园内，你会发现美国时代广场、巴黎歌剧院、古希腊剧场、阿拉伯剧场、英国剧场、日本剧场……一边是和纽约曼哈顿一样的繁华，一边又如京都一样的静谧，令你在一天之间穿越世界各地，领略不同的异国风情！<br />
					在这里，你们携手相伴，领略世界建筑艺术之美的同时，还可以记录着人生最美丽、最重要的时刻！
				</p>
				<img src="${ctx}/static/images/front/recommend_3.jpg" />

			</div>
		</div>
		<div class="set_meal_across_line"></div>

		<div class="content_four">
			<div class="left_number left">4</div>
			<div class="recommend_right_content content_four right">
				<strong style="color: #353535;">鹤山环球影城</strong><br />
				<p>
					环游世界需要80天？错！一天就够了！<br />
					鹤山环球影城占地面积450亩，是全球最大的婚纱摄影基地，分为“爱丽丝城堡”、“生态欧陆文化园区”、“渔人码头区”、“漓江自然风景区”、“地中海风情区”等五个景区。欧陆风、日韩风、中国风，风车、古堡、小屋、树林、蓝天、白云、山水……每一对新人几乎都可以找到自己心目中的浪漫场景。<br />
					爱丽丝城堡为整个基地主要景区，建筑面积达6000平方米。城堡外观金碧辉煌，内部美轮美奂，共有186个各国风情实景，分中国馆、欧洲馆、日韩馆、主题馆及自然风光馆、北欧小镇街景，南美风情街景、东欧古典建筑文化区。在爱丽丝城堡，不用走遍天下，就可以轻松地取到世界各地的美景。<br />
					生态欧陆文化园区有近120个风情各色的实景，如果您有欧陆情结，如果您想在斑驳的阳光下，与心爱的他（她）在如画风景里留下永恒的浪漫回忆，没有比生态欧陆文化园更适合你的地方了。
				</p>
				<img src="${ctx}/static/images/front/recommend_4.jpg" />
				<p>
					渔人码头区是一个具有丰厚海洋历史文化底蕴的主题区，代表的是一种欧陆怀旧式的休闲，一种港埠特有的市井文化，一种平民化的欢娱，一种带着丝丝回忆的人文风情。渔人码头区35个景，充满了“海洋文化”和“渔文化”风味，在码头放眼望去，清澈的湖水碧波荡漾，游艇、快艇、威尼斯水城木船、农家小艇随处可见，还有露天西餐吧，在这里记录人生最美丽的瞬间，别有一番风味。<br />
					漓江自然风景区共有20个景点，依山伴水，四季风景各具特色，春有花海夏有碧水秋有枫叶冬有草。除去天然拥有的青山绿水等自然风景外，还架设了不少室外人工风景元素，如竹筏漂游，篱笆稻草人等。有山有水的地方就有灵气，没有比桂林这样的美景更合适拍摄山水婚纱照了，人在景中，宛如画中，连景中人也沾染了山间灵气。<br />
					地中海风情区提供了18个拍摄景点，大片的蓝搭配着大片的白，甚至门框、窗户、椅面都是蓝与白的配色，加上混着贝壳、细沙的墙面、小鹅卵石地、金银铁的金属器皿，将蓝与白不同程度的对比与组合发挥到极致，就像希腊的白色房子与碧海蓝天连成一片，纯美自然，浪漫至极。
				</p>

			</div>
		</div>
		<div class="set_meal_across_line"></div>

		<div class="content_five">
			<div class="left_number left">5</div>
			<div class="recommend_right_content content_five right">
				<strong style="color: #353535;">澳门</strong><br />
				<p>
					提起澳门，你第一时间联想到什么？世界第一赌城？东方拉斯维加斯？其实澳门除了因为“赌”而闻名世界以外，还是全球“十大最佳旅游地区”，值得你花上一个周末的时间去体验这个城市的魅力！近日，世界知名旅游系列书籍《孤独星球》公布2015年最佳旅游胜地名单，澳门入选“十大最佳旅游地区”，成为两岸四地唯一入选地。除了大三巴、旅游塔、妈祖阁等核心旅游区外，揉合中西文化的美食，百年历史的茶楼酒肆，隐藏在小巷深处的传统手工艺门店，都让澳门更具无穷魅力。<br />
					澳门的著名景点--大三巴牌坊<br /> 大三巴牌坊（Ruins of
					St.Paul），是澳门最具代表性的名胜古迹，为1580年竣工的圣保禄大教堂的前壁。大三巴牌坊建筑糅合了欧洲文艺复兴时期与东方建筑的风格而成，体现出东西艺术的交融，雕刻精细，巍峨壮观。由三至五层构成三角金字塔形，无论是牌坊顶端高耸的十字架，还是铜鸽下面的圣婴雕像和被天使、鲜花环绕的圣母塑像，都充满着浓郁的宗教气氛，给人以美的享受。牌坊上各种雕像栩栩如生，堪称“立体的圣经”。
				</p>
				<img src="${ctx}/static/images/front/recommend_5.jpg" />
				<p>
					澳门的豪华酒店---威尼斯人度假村酒店<br />
					澳门威尼斯人度假村酒店占地1,050万平方尺，设有3,000间豪华套房，以意大利威尼斯水乡为主题，酒店范围内到处充满了威尼斯特色拱桥、小运河及石板路。拉斯维加斯威尼斯人的特色将会在澳门威尼斯人度假村酒店再度展现，包括豪华套房、主题购物中心、高级餐厅、表演厅、运动场，以及亚洲其中一个最大的会议展览中心等。<br />
					澳门特色美食<br /> 澳门美食荟萃中西南北的美食，中国菜、日本菜、韩国菜和泰国菜也是应有尽有。当然最吸引人的还是当地正宗的葡国菜和各种小食店的特色小吃，以葡式蛋挞最为有名。还有葡国鸡、咖哩蟹、水蟹粥、竹升面、猪扒包、杏仁饼、牛肉干、木糠布丁等等，想起都口水直流！
				</p>

			</div>
		</div>
		<div class="set_meal_across_line"></div>
	</div>
</article>


<%@ include file="/WEB-INF/jsp/front/tpl/footer_more.jsp"%>

<rf:contentFooterFront />