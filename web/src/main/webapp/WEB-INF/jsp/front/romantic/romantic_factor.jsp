<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/front/tpl/taglibs.jsp" %>
<rf:contentHeaderFront />
	<link href="${ctx}/static/css/front/romantic_index.css" rel='stylesheet' type='text/css'>
	<div class="header_content index_header">
		<!-- <img id="header_logo_img" src="${ctx}/static/images/front/logo.png" /> -->
           <%@ include file="/WEB-INF/jsp/front/tpl/head_nav.jsp" %>
        </div>
    
    <div class="index_content" id="index_wrap_e">
    	<!--第一屏-->
        <div class="content_box content_list1" id="content_list1">
        	<ul class="banner_ul"> 
                <li class="banner_li2">
                    <img src="${ctx}/static/images/front/index_pic22.jpg">
                    <div class="word_box">
                            <p class="word1">You Are My Destiny</p>
                            <p class="word2"></p>
                            <p class="word3">一千次回眸&nbsp;&nbsp;只为命中注定</p>
                    </div>
                </li>
                <li class="banner_li3">
                    <img src="${ctx}/static/images/front/index_pic23.jpg">
                    <div class="word_box">
                            <p class="word1">Create A Perfect Moment</p>
                            <p class="word2">For Your Happiness</p>
                            <p class="word3">给您们的幸福&nbsp;&nbsp;一个完美的开始</p>
                    </div>
                </li>
                <li class="banner_li1">
                    <img src="${ctx}/static/images/front/index_pic21.jpg">
                    <div class="word_box">
                            <p class="word1">Perfect & Personalized</p>
                            <p class="word2">Elegant & Supreme</p>
                            <p class="word3">完美 • 个性  优雅 • 极致</p>
                    </div>
                </li>
                <li class="banner_li4">
                    <img src="${ctx}/static/images/front/index_pic24.jpg">
                    <div class="word_box">
                            <p class="word1">Choose Romantic Factor</p>
                            <p class="word2">To Start a Romantic Journey</p>
                            <p class="word3">浪漫的时刻&nbsp;&nbsp;由选择罗蔓开始</p>
                    </div>
                </li>   
            </ul>
        	<!--<img src="${ctx}/static/images/front/index_pic21.jpg" />-->
            <a class="index_down_btn" href="JavaScript:;">下一页</a>
        </div>
    	<!--第二屏-->
        <div class="content_box content_list2">
        	<div id="content_list2">
                <div class="content_box_title2">
                    <h1>摄影作品</h1>
                    <h2>PHOTOGRAPHY</h2>
                </div>
                <div class="content_list2_groundpics center">
                    <a href="photoer.do?page=1"><img src="${ctx}/static/images/front/index_pic7.jpg" /><div class="mouse_over_hidden"></div></a>
                    <a href="photoer.do?page=1"><img src="${ctx}/static/images/front/index_pic8.jpg" /><div class="mouse_over_hidden"></div></a>
                </div>
                <div class="content_list2_story">
                    <h2>ROMANTIC FACTOR</h2>
                    <h1>罗蔓缘素</h1>
                    <p><font size="4">罗蔓缘素（ROMANTIC FACTOR)是一个包含摄影、化妆、录像、婚庆、礼服、主持等元素的一站式服务展示平台。由于这些元素服务以发现及挖掘真、善、美的宗旨，呈现最美好的作品给用户，尤其针对即将结婚的用户群，为他们提供一系列的婚礼元素服务，缘起，缘聚，故取名“罗蔓缘素”。</font></p>
                </div>
                <div class="content_list2_lunbo" id="banner2_e">
                    <ul class="banner_ul2">
                        <li><a href="photoer.do?page=1"><img src="${ctx}/static/images/front/index_pic_luobo1.jpg" /></a></li>
                        <li><a href="photoer.do?page=1"><img src="${ctx}/static/images/front/index_pic_luobo2.jpg" /></a></li>
                        <li><a href="photoer.do?page=1"><img src="${ctx}/static/images/front/zuop1.jpg" /></a></li>
                        <li><a href="photoer.do?page=1"><img src="${ctx}/static/images/front/zuop2.jpg" /></a></li>
                        <li><a href="photoer.do?page=1"><img src="${ctx}/static/images/front/zuop3.jpg" /></a></li>
                    </ul>
                    <div class="btns">
                        <a class="now" href="JavaScript:;"></a>
                        <a href="JavaScript:;"></a>
                        <a href="JavaScript:;"></a>
                        <a href="JavaScript:;"></a>
                        <a href="JavaScript:;"></a>
                    </div>
                </div>
                <div class="content_list2_groundpics top">
                    <a href="photoer.do?page=1"><img src="${ctx}/static/images/front/index_pic9.jpg" /><div class="mouse_over_hidden"></div></a>
                    <a href="photoer.do?page=1"><img src="${ctx}/static/images/front/index_pic10.jpg" /><div class="mouse_over_hidden"></div></a>
                </div>
                <div class="content_list2_groundpics foot">
                    <a href="photoer.do?page=1"><img src="${ctx}/static/images/front/index_pic11.jpg" /><div class="mouse_over_hidden"></div></a>
                    <a href="photoer.do?page=1"><img src="${ctx}/static/images/front/index_pic6.jpg" /><div class="mouse_over_hidden"></div></a>
                </div>
                <div class="content_list2_groundpics center">
                    <a href="photoer.do?page=1"><img src="${ctx}/static/images/front/index_pic12.jpg" /><div class="mouse_over_hidden"></div></a>
                    <a href="photoer.do?page=1"><img src="${ctx}/static/images/front/index_pic13.jpg" /><div class="mouse_over_hidden"></div></a>
                </div>
                
            </div>
            <a class="index_down_btn index_down_btn2" href="JavaScript:;">下一页</a>
        </div>
    	<!--第三屏-->
        <div class="content_box content_list3">
        	<div id="content_list3">
        	<div class="content_box_title">
            	<p>化妆作品</p>
                <span>MAKEUP</span>
            </div>
            <div class="content_box_pic" id="pic_mouse_e">
            <!-- 后台请注意，这里以ul为一屏单位，总共是三屏幕，但是考虑客户特殊需求，为了不太影响性能，这里将最后一个ul复制放到第一个位置，同事将第一个复制一份放到最后。       -->   
                <ul><!-- 这是第三个 -->
                    <li class="index_img1">
                        <p></p>
                        <img src="${ctx}/static/images/front/beauty9.png" />
                        <div class="mouse_over_clear" ></div>
                    </li>
                    <li class="index_img2">
                        <p></p>
                        <div class="mouse_over_clear"></div>
                        <img src="${ctx}/static/images/front/beauty10.png" />
                    </li>
                    <li class="index_img3">
                        <p></p>
                        <div class="mouse_over_clear"></div>
                        <img src="${ctx}/static/images/front/beauty11.png" />
                    </li>
                    <li class="index_img4">
                        <p></p>
                        <div class="mouse_over_clear"></div>
                        <img src="${ctx}/static/images/front/beauty12.png" /><!-- href="makeupMakeer.do?page=1" -->
                    </li>
                </ul>  	
                
                <ul><!-- 这是第二个 -->
                    <li class="index_img1">
                        <p></p>
                        <img src="${ctx}/static/images/front/beauty5.png" />
                        <div class="mouse_over_clear"></div>
                    </li>
                    <li class="index_img2">
                        <p></p>
                        <div class="mouse_over_clear"></div>
                        <img src="${ctx}/static/images/front/beauty6.png" />
                    </li>
                    <li class="index_img3">
                        <p></p>
                        <div class="mouse_over_clear"></div>
                        <img src="${ctx}/static/images/front/beauty7.png" />
                    </li>
                    <li class="index_img4">
                        <p></p>
                        <div class="mouse_over_clear"></div>
                        <img src="${ctx}/static/images/front/beauty8.png" />
                    </li>
                </ul>
                <ul><!-- 这是第一个 -->
                    <li class="index_img1">
                        <p></p>
                        <img src="${ctx}/static/images/front/beauty1.png"  />
                        <div class="mouse_over_clear" ></div>
                    </li>
                    <li class="index_img2">
                        <p></p>
                        <div class="mouse_over_clear"></div>
                        <img src="${ctx}/static/images/front/beauty2.png" />
                    </li>
                    <li class="index_img3">
                        <p></p>
                        <div class="mouse_over_clear"></div>
                        <img src="${ctx}/static/images/front/beauty3.png"/>
                    </li>
                    <li class="index_img4">
                        <p></p>
                        <div class="mouse_over_clear"></div>
                        <img src="${ctx}/static/images/front/beauty4.png" />
                    </li>
                </ul>
                <ul><!-- 这是第三个 -->
                    <li class="index_img1">
                        <p></p>
                        <img src="${ctx}/static/images/front/beauty9.png" />
                        <div class="mouse_over_clear"></div>
                    </li>
                    <li class="index_img2">
                        <p></p>
                        <div class="mouse_over_clear"></div>
                        <img src="${ctx}/static/images/front/beauty10.png" />
                    </li>
                    <li class="index_img3">
                        <p></p>
                        <div class="mouse_over_clear"></div>
                        <img src="${ctx}/static/images/front/beauty11.png" />
                    </li>
                    <li class="index_img4">
                        <p></p>
                        <div class="mouse_over_clear"></div>
                        <img src="${ctx}/static/images/front/beauty12.png" />
                    </li>
                </ul>
                <ul><!-- 这是第一个 -->
                    <li class="index_img1">
                        <p></p>
                        <img src="${ctx}/static/images/front/beauty1.png" />
                        <div class="mouse_over_clear"></div>
                    </li>
                    <li class="index_img2">
                        <p></p>
                        <div class="mouse_over_clear"></div>
                        <img src="${ctx}/static/images/front/beauty2.png" />
                    </li>
                    <li class="index_img3">
                        <p></p>
                        <div class="mouse_over_clear"></div>
                        <img src="${ctx}/static/images/front/beauty3.png" />
                    </li>
                    <li class="index_img4">
                        <p></p>
                        <div class="mouse_over_clear"></div>
                        <img src="${ctx}/static/images/front/beauty4.png" />
                    </li>
                </ul>
            </div>
            <!--<div class="wavy_line"></div>-->
            <a class="prev" href="JavaScript:;"></a>
            <a class="next" href="JavaScript:;"></a>
            </div>
            <a class="index_down_btn" href="JavaScript:;">下一页</a>
        </div>
    	<!--第四屏-->
        <div class="content_box content_list4">
        	<div class="content_four_title">
            	<h1>套餐介绍</h1>
                <h2>PACKAGE</h2>
            </div>
        	<div class="content_four">
            	<div class="content_four_info">
                	<div class="romantic_factor_text">
                    	<span>R</span>OMANTIC<br />
                        <span>F</span>ACTOR
                    </div>
                    <div class="contnet_four_left_info">
                    	<div class="introduce_us">
                        	<h1>罗蔓缘素文化</h1>
                         	<p>使命：通过互联网信息整合让人们生活省时省力省心<br/>
										愿景：人人信赖的婚礼服务信息平台<br/>
										品牌定位：浪漫時刻，由选择罗蔓开始  <br/>   
							 核心价值观：用户第一、尊重选择、主动协作、创新精神、努力成长</p>
                        </div>
                        <div class="introduce_us_more">
                        	<img src="${ctx}/static/images/front/logo2.png" />
                            <p>罗蔓缘素致力于打造一个遵循市场规则，货真价实，给予用户自由选择的婚礼服务平台，让消费者省时省力省心地自由选择服务。</p>
                            <a href="mealIntroduce.do">MORE+</a>
                        </div>
                   	</div>
                	<div class="content_four_pics">
                	<a href="mealIntroduce.do" target="_blank">
                    	<div class="content_four_pic_unit">
                    		<img src="${ctx}/static/images/front/index_pic2.jpg" />
                        	<!-- <a href="mealIntroduce.do" target="_blank"><img src="${ctx}/static/images/front/index_pic2.jpg" /></a> -->
                            <span class="meal_name_en">ROMANTIC SERIES</span>
                            <span class="meal_name_ch">浪漫摄影系列</span>
                            <div class="pic_mouseover_see">
                            	<div class="line"></div>
                                <div class="money">
                                	<span>CNY</span><span>9980</span>
                                    <span>ROMANTIC SERIES</span>
                                    <span>浪漫摄影系列</span>
                                    <span>【拍摄路线】</span><span>九龙湖/大观园/鹤山环球影城</span>
                                </div>
                            </div>
                        </div>
                      </a>
                      <a href="mealIntroduce.do" target="_blank">
                        <div class="content_four_pic_unit">
                        	<img src="${ctx}/static/images/front/index_pic3.jpg" />
                            <span class="meal_name_en">LUXURY SERIES</span>
                            <span class="meal_name_ch">奢华摄影系列</span>
                            <div class="pic_mouseover_see">
                            	<div class="line"></div>
                                <div class="money">
                                	<span>CNY</span><span>7980</span>
                                    <span>LUXURY SERIES</span>
                                    <span>奢华摄影系列</span>
                                    <span>【拍摄路线】</span><span>九龙湖/大观园/鹤山环球影城</span>
                                </div>
                            </div>
                        </div>
                        </a>
                        <a href="mealIntroduce.do" target="_blank">
                        <div class="content_four_pic_unit">
                        	<img src="${ctx}/static/images/front/index_pic4.jpg" />
                            <span class="meal_name_en">THE LEISURE SERIES</span>
                            <span class="meal_name_ch">休闲摄影系列</span>
                            <div class="pic_mouseover_see">
                            	<div class="line"></div>
                                <div class="money">
                                	<span>CNY</span><span>7980</span>
                                    <span>THE LEISURE SERIES</span>
                                    <span>休闲摄影系列</span>
                                    <span>【拍摄路线】</span><span>九龙湖/大观园/鹤山环球影城</span>
                                </div>
                            </div>
                        </div>
                        </a>
                        <a href="mealIntroduce.do" target="_blank">
                        <div class="content_four_pic_unit">
                        	<img src="${ctx}/static/images/front/index_pic5.jpg" />
                            <span class="meal_name_en">EXALTED SERIES</span>
                            <span class="meal_name_ch">尊贵摄影系列</span>
                            <div class="pic_mouseover_see">
                            	<div class="line"></div>
                                <div class="money">
                                	<span>CNY</span><span>16980</span>
                                    <span>EXALTED SERIES</span>
                                    <span>尊贵摄影系列</span>
                                    <span>【拍摄路线】</span><span>澳门</span>
                                </div>
                            </div>
                        </div>
                        </a>
                    </div>
                </div>
            </div>
            <footer style="position:absolute; bottom:0px;min-width:700px">
                <div class="left">© Romantic factor - 2015保留所有权利 <a>   粤ICP备15086517       </a>  
                    <a class="frist" href="mealLeaveWords.do">联系方式</a>
                    <span>-</span>
                    <a href="brandPromise.do">消费保证</a>
                    <span>-</span>
                    <a href="brandAboutPrivacy.do">关于隐私</a>
                </div>
                <div class="right"><a href="mealLeaveWords.do">留言板</a></div>
            </footer>
            
       	</div>
    </div>
    <script src="${ctx}/static/js/front/mousewheel.min.js"></script>
<script src="${ctx}/static/js/front/mymousewheel.js"></script>
<rf:contentFooterFront/>