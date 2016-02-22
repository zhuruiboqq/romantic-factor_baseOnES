<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/front/tpl/taglibs.jsp" %>
<rf:contentHeaderFront />
	
	<header>
    	<div class="header_content">
        	<%@ include file="/WEB-INF/jsp/front/tpl/head_with_title_img.jsp"%>
        </div>
    </header>
    <article class="introduce_article">
    	<h1 class="content_top_title">套餐介绍</h1>
    	<h2 class="content_top_title_2">SET MEAL</h2>
    	
        <nav class="set_meal_content_nav">
        	<ul>
            	<li>
                	<a href="mealIntroduce.do">
                    	<div class="nav_link_text text_this">套餐介绍</div>
                        <div class="nav_link_line line_this"></div>
                    </a>
                </li>
                <li><span>/</span></li>
                <li>
                	<a href="mealRecommendLocation.do">
                    	<div class="nav_link_text">景点推介</div>
                        <div class="nav_link_line"></div>
                    </a>
                </li>
                <li><span>/</span></li>
                <li>
                	<a href="mealTripInfo.do">
                    	<div class="nav_link_text">旅游情报</div>
                        <div class="nav_link_line"></div>
                    </a>
                </li>
                <li><span>/</span></li>
                <li>
                	<a href="mealLeaveWords.do">
                    	<div class="nav_link_text">合作留言</div>
                        <div class="nav_link_line"></div>
                    </a>
                </li>
            </ul>
        
        </nav>
        <div class="set_meal_across_line"></div>
        <div class="package_info">
        	<!--unit start-->
            <div class="package_unit left">
                <div class="unit_top_pic">
                	<img src="${ctx}/static/images/front/introduce_package1.jpg"/>
                </div>
                <div class="package_name">
                	<div class="left_icon left"></div>
                    <div class="package_text left">浪漫摄影系列</div>
                    <div class="right_icon left"></div>
                </div>
                <div class="price">CNY9980</div>
                <div class="detail_info">
                	<span style="color:#999999;">【拍摄线路】</span> <span style="font-size:16px;">广州九龙湖度假区、广州世界大观园、鹤山环球影城（三选一）</span><br />
                    <span style="color:#999999;">【拍摄数量】</span> 全程高画质数码文件500件以上，全部母片免费赠送<br />
                    <span style="color:#999999;">【拍摄时间】</span> 1天（8小时）<br />
                    <span style="color:#999999;">【拍摄场景】</span> 全外景或外景+棚景<br />
                    <span style="color:#999999;">【婚纱礼服】</span> 提供新娘服饰4套，新郎服饰1套（建议顾客自带便装1~2套）<br />
                    <span style="color:#999999;">【化妆造型】</span> 专业化妆造型4组，化妆师拍摄全程跟妆<br />
                    <span style="color:#999999;">【摄影服务】</span> 全程外景车接送（8小时）<br />
                    <span style="color:#999999;">【后期精修】</span>  50张，含PS色调、细节处理，高档排版后制<br />
                    <span style="color:#999999;">【附送成品】</span><br />
                     &nbsp;&nbsp;● 精修50张相片入册，其中：<br />
                        &nbsp;&nbsp;25张相片精修＋1本18寸PVC防潮一体成型豪华水晶相册排版制作<br />
                        &nbsp;&nbsp;25张相片精修＋1本12寸PVC防潮一体成型豪华水晶相册排版制作<br />
                     &nbsp;&nbsp; ● 36x24寸豪华相框1个<br />
                     &nbsp;&nbsp; ● 8x12寸豪华铂晶相架3个<br />
                     &nbsp;&nbsp; ● 18寸高档相册收纳皮箱1个<br />
                     &nbsp;&nbsp; ● 附送光碟若干张(含电子相册，所有母片，后期成品的JPG文件，非视频)<br />
                     &nbsp;&nbsp; <span style="color:red;">*</span>报价不含景点门票费用，不含餐饮费、住宿费<br />
                </div>
            </div>
            <!--unit end-->
            <!--unit start-->
            <div class="package_unit unit_right left">
                <div class="unit_top_pic">
                	<img src="${ctx}/static/images/front/introduce_package2.jpg"/>
                </div>
                <div class="package_name">
                	<div class="left_icon left"></div>
                    <div class="package_text left">尊贵摄影系列</div>
                    <div class="right_icon left"></div>
                </div>
                <div class="price">CNY12980</div>
                <div class="detail_info">
                	<span style="color:#999999;">【拍摄线路】</span> <span style="font-size:16px;">广州九龙湖度假区、广州塔、广州世界大观园、鹤山环球影城（四选二）</span><br />
                    <span style="color:#999999;">【拍摄数量】</span> 全程高画质数码文件600张以上，全部母片免费赠送，另送三卷菲林拍摄<br />
                    <span style="color:#999999;">【拍摄时间】</span> 2天<br />
                    <span style="color:#999999;">【拍摄场景】</span> 全外景或外景+棚景或夜景<br />
                    <span style="color:#999999;">【婚纱礼服】</span> 提供新娘服饰4套，新郎服饰1套（建议顾客自带便装1~2套）<br />
                    <span style="color:#999999;">【化妆造型】</span> 专业化妆造型4组，化妆师拍摄全程跟妆<br />
                    <span style="color:#999999;">【摄影服务】</span> 全程外景车接送（8小时）<br />
                    <span style="color:#999999;">【后期精修】</span>  50张，含PS色调、细节处理，高档排版后制<br />
                    <span style="color:#999999;">【附送成品】</span><br />
                     &nbsp;&nbsp;● 精修50张相片入册，其中：<br />
                        &nbsp;&nbsp;25张相片精修＋1本18寸PVC防潮一体成型豪华水晶相册排版制作<br />
                        &nbsp;&nbsp;25张相片精修＋1本12寸PVC防潮一体成型豪华水晶相册排版制作<br />
                     &nbsp;&nbsp; ● 36x24寸豪华相框1个<br />
                     &nbsp;&nbsp; ● 8x12寸豪华铂晶相架3个<br />
                     &nbsp;&nbsp; ● 18寸高档相册收纳皮箱1个<br />
                     &nbsp;&nbsp; ● 附送光碟若干张(含电子相册，所有母片，后期成品的JPG文件，非视频)<br />
                     &nbsp;&nbsp; <span style="color:red;">*</span>报价不含景点门票费用，不含餐饮费、住宿费<br />
                </div>
            </div>
            <!--unit end-->
        </div>
        
        <!--中间线-->
        <div class="set_meal_across_line set_meal_center_line">
        	<div class="center_circle">
            	<div class="text_fri">RF</div>
                <div class="text_sec">SHOOT</div>
            </div>
        </div>
        
        <!--中间线-->
        
        <div class="package_info">
        	<!--unit start-->
            <div class="package_unit left">
                <div class="unit_top_pic">
                	<img src="${ctx}/static/images/front/introduce_package3.jpg"/>
                </div>
                <div class="package_name">
                	<div class="left_icon left"></div>
                    <div class="package_text left">奢华摄影系列</div>
                    <div class="right_icon left"></div>
                </div>
                <div class="price">CNY16980</div>
                <div class="detail_info">
                	<span style="color:#999999;">【拍摄线路】</span> <span style="font-size:16px;">澳门</span><br />
                    <span style="color:#999999;">【拍摄数量】</span> 全程高画质数码文件800张以上，全部母片免费赠送，另送三卷菲林拍摄<br />
                    <span style="color:#999999;">【拍摄时间】</span> 2天+1晚夜景<br />
                    <span style="color:#999999;">【拍摄场景】</span> 全外景或外景+棚景<br />
                    <span style="color:#999999;">【婚纱礼服】</span> 提供新娘服饰5套，新郎服饰3套（建议顾客自带便装1~2套）<br />
                    <span style="color:#999999;">【化妆造型】</span> 专业化妆造型6组，化妆师拍摄全程跟妆<br />
                    <span style="color:#999999;">【摄影服务】</span> 外景车接送至澳门关口<br />
                    <span style="color:#999999;">【后期精修】</span>  100张，含PS色调、细节处理，高档排版后制<br />
                    <span style="color:#999999;">【附送成品】</span><br />
                     &nbsp;&nbsp;● 精修100张相片入册，其中：<br />
                        &nbsp;&nbsp;25张相片精修＋1本18寸10跨页PVC防潮一体成型豪华水晶相册<br />
                        &nbsp;&nbsp;25张相片精修＋1本12寸10跨页PVC防潮一体成型豪华水晶相册<br />
                        &nbsp;&nbsp;25张相片精修＋1本10寸10跨页PVC防潮一体成型豪华水晶相册<br />
                        &nbsp;&nbsp;100张相片精修＋1本A4杂志精装豪华相册<br />
                     &nbsp;&nbsp;  ● 36x24寸豪华油画框1个                   ● 8×12寸豪华铂晶相架4个<br />
                     &nbsp;&nbsp; ● 附送钱包相片8张                             ● 附送18寸皮箱，手套等<br />
                     &nbsp;&nbsp; ● 附送光碟若干张(含电子相册，所有母片，后期成品的JPG文件，非视频)<br />
                     &nbsp;&nbsp; <span style="color:red;">*</span>报价不含景点门票费用，不含餐饮费、住宿费、澳门境内交通费<br />
                </div>
            </div>
            <!--unit end-->
            <!--unit start-->
            <div class="package_unit unit_right left">
                <div class="unit_top_pic">
                	<img src="${ctx}/static/images/front/introduce_package4.jpg"/>
                </div>
                <div class="package_name">
                	<div class="left_icon left"></div>
                    <div class="package_text left">休闲摄影系列</div>
                    <div class="right_icon left"></div>
                </div>
                <div class="price">CNY7980</div>
                <div class="detail_info">
                	<span style="color:#999999;">【拍摄线路】</span> <span style="font-size:16px;">广州九龙湖度假区、广州世界大观园、鹤山环球影城（三选一）</span><br />
                    <span style="color:#999999;">【拍摄数量】</span> 全程高画质数码文件300件以上，全部母片免费赠送<br />
                    <span style="color:#999999;">【拍摄时间】</span> 1天（8小时）<br />
                    <span style="color:#999999;">【拍摄场景】</span> 全外景或外景+棚景<br />
                    <span style="color:#999999;">【婚纱礼服】</span> 提供新娘服饰5套，新郎服饰3套（建议顾客自带便装1~2套）<br />
                    <span style="color:#999999;">【化妆造型】</span> 专业化妆造型5组，化妆师拍摄全程跟妆<br />
                    <span style="color:#999999;">【摄影服务】</span> 外景车接送<br />
                    <span style="color:#999999;">【后期精修】</span>  75张，含PS色调、细节处理，高档排版后制<br />
                    <span style="color:#999999;">【附送成品】</span><br />
                     &nbsp;&nbsp;● 精修100张相片入册，其中：<br />
                        &nbsp;&nbsp;25张相片精修＋1本18寸10跨页PVC防潮一体成型豪华水晶相册<br />
                        &nbsp;&nbsp;25张相片精修＋1本12寸10跨页PVC防潮一体成型豪华水晶相册<br />
                        &nbsp;&nbsp;25张相片精修＋1本10寸10跨页PVC防潮一体成型豪华水晶相册<br />
                        &nbsp;&nbsp;100张相片精修＋1本A4杂志精装豪华相册<br />
                     &nbsp;&nbsp;  ● 36x24寸豪华油画框1个                   ● 8×12寸豪华铂晶相架4个<br />
                     &nbsp;&nbsp; ● 附送钱包相片8张                             ● 附送18寸皮箱，手套等<br />
                     &nbsp;&nbsp; ● 附送光碟若干张(含电子相册，所有母片，后期成品的JPG文件，非视频)<br />
                     &nbsp;&nbsp; <span style="color:red;">*</span>报价不含景点门票费用，不含餐饮费、住宿费、澳门境内交通费<br />
                </div>
            </div>
            <!--unit end-->
        </div>
        <div class="set_meal_across_line set_meal_center_line"></div>
    </article>
    
    
<%@ include file="/WEB-INF/jsp/front/tpl/footer_more.jsp"%>
    
<rf:contentFooterFront/>