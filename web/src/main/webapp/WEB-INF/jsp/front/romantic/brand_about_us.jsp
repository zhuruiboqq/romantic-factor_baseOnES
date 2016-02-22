<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/front/tpl/taglibs.jsp" %>
<rf:contentHeaderFrontFront />
	
	<header>
    	<div class="header_content">
        	<%@ include file="/WEB-INF/jsp/front/tpl/head_with_title_img.jsp"%>
        </div>
    </header>
    
    <article class="brand_story_article brand_about_us">
    	<aside>
            <div class="brand_story_left brand_about_us left">
                <img class="brand_story_pic" src="${ctx}/static/images/front/brand_pic1.png" />
                <h1>关于我们</h1>
                <h2>about us</h2>
                <img class="icon_up" src="${ctx}/static/images/front/icon_top.png" />
                <nav class="aside_nav">
                	<ul>
                    	<li>
                            <a href="brandStory.do">
                                <p>RF简介</p>
                                <div class="aside_nav_under_line"></div>
                            </a>
                        </li>
                        <!-- <li>
                            <a href="brandAboutUs.do">
                                <p>關於我們</p>
                                <div class="aside_nav_under_line this_show"></div>
                            </a>
                        </li> -->
                        <li>
                            <a href="brandCharacteristic.do">
                                <p>企业文化</p>
                                <div class="aside_nav_under_line"></div>
                            </a>
                        </li>
                        <li>
                            <a href="brandPromise.do">
                                <p>加盟方式</p>
                                <div class="aside_nav_under_line"></div>
                            </a>
                        </li>
                        <li>
                            <a href="brandAboutPrivacy.do">
                                <p>法律声明</p>
                                <div class="aside_nav_under_line"></div>
                            </a>
                        </li>
                    </ul>
                </nav>
                <img class="icon_down" src="${ctx}/static/images/front/icon_top.png" />
                <div class="nav_phone_number_content">
                	<div class="nav_phone_number">
                    	<h3>RF咨询热线</h3>
                        <h3>400-888-8888</h3>
                    </div>
                </div>
            </div>
            
        </aside>
        <div class="brand_right_content brand_story_right_content brand_about_us right">
        	<h1>关于我们</h1>
            <h2>ABOUT US</h2>
            <p>Romantic facto罗蔓缘素婚纱摄影有限公司成立于2012年1月1日，是一家专业的摄影机构，拥有实力强大的摄影师团队和化妆团队。</p>
            <p>主推婚旅拍摄，并推出一系列旅行拍摄、亲自拍摄、婚礼拍摄和配套化妆等服务。</p>
            <img src="${ctx}/static/images/front/about_us1.jpg"/>
            
            <img src="${ctx}/static/images/front/about_us2.jpg" />
            
            <img src="${ctx}/static/images/front/about_us3.jpg" />
        </div>
	</article>
    
    <%@ include file="/WEB-INF/jsp/front/tpl/footer_more.jsp"%>
<rf:contentFooterFront/>