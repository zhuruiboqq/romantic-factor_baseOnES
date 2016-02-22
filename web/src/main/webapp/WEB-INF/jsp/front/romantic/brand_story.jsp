<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/front/tpl/taglibs.jsp" %>
<rf:contentHeaderFront />
	
	<header>
    	<div class="header_content">
        	<%@ include file="/WEB-INF/jsp/front/tpl/head_with_title_img.jsp"%>
        </div>
    </header>
    
    <article class="brand_story_article brand_story">
    	<aside>
            <div class="brand_story_left left">
                <img class="brand_story_pic" src="${ctx}/static/images/front/brand_pic1.png" />
                <h1>关于我们</h1>
                <h2>about us</h2>
                <img class="icon_up" src="${ctx}/static/images/front/icon_top.png" />
                <nav class="aside_nav">
                	<ul>
                    	<li>
                            <a href="brandStory.do">
                                <p>RF简介</p>
                                <div class="aside_nav_under_line this_show"></div>
                            </a>
                        </li>
                       <!--  <li>
                            <a href="brandAboutUs.do">
                                <p>关于我们</p>
                                <div class="aside_nav_under_line"></div>
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
        <div class="brand_right_content brand_story_right_content right">
        	<h1>ROMANTIC FACTOR简介</h1>
            <h2><!-- GENESIS --></h2>
            <p>罗蔓缘素（ROMANTIC FACTOR）是一个包含摄影、化妆、录像、婚庆、礼服、主持等元素的一站式服务展示平台。由于这些元素服务以发现及挖掘真、善、美的宗旨，呈现最美好的作品给用户，尤其针对即将结婚的用户群，为他们提供一系列的婚礼元素服务，缘起，缘聚，故取名“罗蔓缘素”。</p>
            <img src="${ctx}/static/images/front/brand_content_pic_1.jpg" />
            <h1><!-- 緣起 --></h1>
            <h2><!-- GENESIS --></h2>
            <p>罗蔓缘素致力于打造一个遵循市场规则，货真价实，给予用户自由选择的婚礼服务平台，帮助更多的消费者了解婚姻市场的资讯动态，使消费者足不出户，就能简单快捷地通过网上的作品进行选择，让消费者省时省力省心地自由选择服务。</p>
            <img src="${ctx}/static/images/front/brand_content_pic_2.jpg" />
            <h1><!-- 緣續 --></h1>
            <h2><!-- BRIDE --></h2>
            <p>罗蔓缘素平台的集中服务在很大程度上改变了传统的到店或者在互联网上挨个寻找咨询的方式，也改变了人们的生活消费方式。不做冤大头、自由选择，遵循消费者最本质的需求。</p><p>除了便捷地满足用户需求外，罗蔓缘素也为提供服务的个体及机构提供一个公平、高效的资源整合推广平台。使服务个体机构能轻松高效地获得婚礼市场的最新动态，更好地了解消费者的心理，各地同行之间相互学习提高，更好地发展自己适应市场的需求。</p>
            <img src="${ctx}/static/images/front/brand_content_pic_3.jpg" />
        </div>
	</article>
    
   <%@ include file="/WEB-INF/jsp/front/tpl/footer_more.jsp"%>
    
<rf:contentFooterFront/>