<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/front/tpl/taglibs.jsp" %>
<rf:contentHeaderFront />
	
	<header>
    	<div class="header_content">
        	<%@ include file="/WEB-INF/jsp/front/tpl/head_with_title_img.jsp"%>
        </div>
    </header>
    <article class="introduce_article meal_leave_words_article">
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
                    	<div class="nav_link_text">旅游情报</div>
                        <div class="nav_link_line"></div>
                    </a>
                </li>
                <li><span>/</span></li>
                <li>
                	<a href="mealLeaveWords.do">
                    	<div class="nav_link_text text_this">合作留言</div>
                        <div class="nav_link_line line_this"></div>
                    </a>
                </li>
            </ul>
        
        </nav>
        <div class="set_meal_across_line"></div>
        <div class="footer_name_content set_meal_footer not_foot">
            <div class="footer_top">
                <div class="line no_show left"></div>
                <img class="icon_left left" src="${ctx}/static/images/front/icon_left.png" />
                <div class="text left">
                    <h1><img src="${ctx}/static/images/front/foot_pic1.png" /></h1>
                    <h2>罗 蔓 缘 素 婚 纱 摄 影</h2>
                </div>
                <div class="line no_show right"></div>
                <img class="icon_right right" src="${ctx}/static/images/front/icon_left.png" />
            </div>
            
        </div> 
        <form name="form" action="${ctx}/front/addMessage.do">
        <div class="leave_words_content">
        	<p style="color:#636363;line-height:30px;font-size:14px;">
            	<strong>合作留言</strong><br />
                您好！若您有合作提案、采访等需求，欢迎在此提出。为了加速我们为您处理的时间，请务必详细填写以下资料后送出，当我们接获您的来信，将会在
				3个工作天內尽快回复您！<br />
				*服务时间：周一至周五 AM09:30-12:00；PM13:30-18:00
            </p>
            <div class="leave_words_inputs left">
            	<div class="unit_line_info">
                    <div class="lable left">
                        <div class="shixin_circle left"></div>
                        <span>姓名：</span>
                    </div>
                    <input type="text" />
                </div>
                <div class="unit_line_info">
                    <div class="lable left">
                        <div class="shixin_circle left"></div>
                        <span>QQ号码：</span>
                    </div>
                    <input type="text" />
                </div>
                <div class="unit_line_info">
                    <div class="lable left">
                        <div class="shixin_circle left"></div>
                        <span>联系电话：</span>
                    </div>
                    <input type="text" />
                </div>
                <div class="unit_line_info">
                    <div class="lable left">
                        <div class="shixin_circle left"></div>
                        <span>电子邮箱：</span>
                    </div>
                    <input type="text" />
                </div>
                <div class="unit_line_info">
                    <div class="lable left">
                        <div class="shixin_circle left"></div>
                        <span>居住地址：</span>
                    </div>
                    <input type="text" />
                </div>
                <div class="unit_line_info">
                    <div class="lable left">
                        <div class="shixin_circle left"></div>
                        <span>建议和要求：</span>
                    </div>
                    <a href="JavaScript: form.submit();">提交</a>
                    <a href="JavaScript: form.reset();">重设</a>
                </div>
                <textarea class="suggestion_area"></textarea>
            </div>
            <div class="leave_words_img right"><img src="${ctx}/static/images/front/leave_words1.jpg" /></div>
        </div>
        <div class="set_meal_across_line meal_leave_words_line"></div>
        </form>
    </article>
    
    
<%@ include file="/WEB-INF/jsp/front/tpl/footer_more.jsp"%>
<rf:contentFooterFront/>