<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/front/tpl/taglibs.jsp" %>
<rf:contentHeaderFront />
	
	<header>
    	<div class="header_content">
        	<%@ include file="/WEB-INF/jsp/front/tpl/head_with_title_img.jsp"%>
        </div>
    </header>
    
    <article class="brand_story_article brand_story brand_characteristic">
    	<aside>
            <div class="brand_story_left brand_characteristic left">
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
                                <p>关于我们</p>
                                <div class="aside_nav_under_line"></div>
                            </a>
                        </li> -->
                        <li>
                            <a href="brandCharacteristic.do">
                                <p>企业文化</p>
                                <div class="aside_nav_under_line this_show"></div>
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
        <div class="brand_right_content1 brand_story_right_content brand_characteristic right">
        	<!-- <h1>品牌特色</h1>
            <h2>BRAND CHARACTERISTICS</h2>
            <p>Romantic factor，以旅游为出发点，享乐为关键，拍摄是主导的宗旨服务于大众。</p>
            <p>摄影不单单是画着精致的妆容，摆着优雅高贵的姿势在摆拍，更重要的是把拍摄的过程作为享受，使照片赋予灵魂，定制一份属于自己回忆的记录。</p>
            <img src="${ctx}/static/images/front/brand_characteristic1.jpg" />
            <br /><br /><br /><br />
            <p >留住人生中每个浪漫有爱的元素是我们的服务。</p><p>
每个难能可贵的时刻，除了照片记录保存，更要你们用心去体会记录。请全身心地投入和享受吧，我们将用心发现美，用镜头记录美，</p><p>
为你们的记忆留下美。</p>
            <img src="${ctx}/static/images/front/brand_characteristic2.jpg" /> -->
            <h1>罗蔓缘素文化</h1>
            <h2></h2>
            <h2>使命：通过互联网信息整合让人们生活省时省力省心。</h2>
            <h2>愿景：人人信赖的婚礼服务信息平台。</h2>
            <h2>品牌定位：浪漫时刻，由选择罗蔓开始。</h2>
            <h2>核心价值观：用户第一、尊重选择、主动协作、创新精神、努力成长。</h2>
            <img src="${ctx}/static/images/front/logo_big.png" height="700" width="924"/>
        </div>
	</article>
    
    <%@ include file="/WEB-INF/jsp/front/tpl/footer_more.jsp"%>
<rf:contentFooterFront/>