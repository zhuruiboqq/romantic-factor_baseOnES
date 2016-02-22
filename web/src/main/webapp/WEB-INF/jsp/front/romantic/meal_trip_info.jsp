<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/front/tpl/taglibs.jsp" %>
<rf:contentHeaderFront />
	
	<header>
    	<div class="header_content">
        	<%@ include file="/WEB-INF/jsp/front/tpl/head_with_title_img.jsp"%>
        </div>
    </header>
    <article class="introduce_article trip_info_article">
    	<h1 class="content_top_title">套餐介绍</h1>
    	<h2 class="content_top_title_2">SET MEAL</h2>
    	
        <nav class="set_meal_content_nav">
        	<ul>
            	<li>
                	<a href="mealIntroduce.do">
                    	<div class="nav_link_text">套餐介绍</div>
                        <div class="nav_link_line"></div>
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
                    	<div class="nav_link_text text_this">旅游情报</div>
                        <div class="nav_link_line line_this"></div>
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
        
        <div class="trip_info_content">
        	<div class="content_one">
                <div class="left_number left">1</div>
                <div class="recommend_right_content content_one right">
                    <strong style="color:#353535;">交通咨询</strong><br />
                    <p>可以链接广州飞机时刻票价网站、顺德港船票价格</p>
                    
                </div>
            </div>
                        
            <div class="content_two">
                <div class="left_number left">2</div>
                <div class="recommend_right_content content_two right">
                    <strong style="color:#353535;">旅馆住宿</strong><br />
                    <p>广州某几个住宿酒店票价<br />
顺德某几个住宿酒店票价<br />
澳门某几个住宿酒店票价</p>
                    
                </div>
            </div>
            
            
            <div class="content_three">
                <div class="left_number left">3</div>
                <div class="recommend_right_content content_three right">
                    <strong style="color:#353535;">天气预报</strong><br />
                    <p>广州某几个住宿酒店票价<br />
顺德某几个住宿酒店票价<br />
澳门某几个住宿酒店票价</p>
                    
                </div>
            </div>
            
            
            <div class="content_four">
                <div class="left_number left">4</div>
                <div class="recommend_right_content content_four right">
                    <strong style="color:#353535;">美食介绍</strong><br />
                    <p>广州某几个住宿酒店票价<br />
顺德某几个住宿酒店票价</p>
                    
                </div>
            </div>
            
            
            <div class="content_five">
                <div class="left_number left">5</div>
                <div class="recommend_right_content content_five right">
                    <strong style="color:#353535;">玩乐景点</strong><br />
                    <p>广州某几个住宿酒店票价<br />
顺德某几个住宿酒店票价<br />
澳门某几个住宿酒店票价</p>
                    
                </div>
            </div>
            <div class="set_meal_across_line"></div>
        </div>
    </article>
    
    
    <%@ include file="/WEB-INF/jsp/front/tpl/footer_more.jsp"%>
<rf:contentFooterFront/>