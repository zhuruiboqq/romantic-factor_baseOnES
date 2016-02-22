<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/front/tpl/taglibs.jsp" %>
<rf:contentHeaderFront />
	
	<header>
    	<div class="header_content">
        	<%@ include file="/WEB-INF/jsp/front/tpl/head_with_title_img.jsp"%>
        </div>
    </header>
    
    <article class="brand_story_article brand_story brand_characteristic brand_promise">
    	<aside>
            <div class="brand_story_left brand_characteristic brand_promise left">
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
                                <div class="aside_nav_under_line"></div>
                            </a>
                        </li>
                        <li>
                            <a href="brandPromise.do">
                                <p>加盟方式</p>
                                <div class="aside_nav_under_line this_show"></div>
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
        	<h1>加盟方式</h1>
            <h2><!-- PROMISE --></h2>
            <img src="${ctx}/static/images/front/star_word2.jpg" height="1400" width="924"/>
            
            
           <!--  <div class="promise_info">
            	<div class="number left"><a>1</a></div>
                <div class="promise_text right">
                	<strong>底片档案全数提供</strong><br />
                    所有摄影行程套系在拍摄完毕之后，我们将提供全数拍摄照片的电子相簿，除了让每位客人可以开心地享受摄影行程之余，回到家后还能
完全拥有摄影行程中的所有作品，除了能完整地享受整个拍摄过程还能拥有完美的回忆照片录。
                </div>
            </div>
            <div class="promise_info">
            	<div class="number left"><a>2</a></div>
                <div class="promise_text right">
                	<strong>造型师全程外景拍摄</strong><br />
                    一般业者提供的摄影服务，造型师通常无法全程跟拍，而我们在服务上更主动更到位，以全程外景均随身跟拍的方式，由专属造型师即时
替换整体造型，让客人可以随时保持最佳的造型和状态出现在快门按下的每一刻！
                </div>
            </div>
            <div class="promise_info">
            	<div class="number left"><a>3</a></div>
                <div class="promise_text right">
                	<strong>礼服看得到拍得到</strong><br />
                    针对各个不同的摄影行程，我们会在您前来拍摄之前，提供最符合该外景风格的建议礼服款式让您挑选出4-8套服装礼服；除此之外，我
们会事先在客人出发前确认客人的三围尺寸，并将预先安排好客人以便客人抵达当天便可立即试穿。
                </div>
            </div>
            <div class="promise_info promise_info_four">
            	<div class="number left"><a>4</a></div>
                <div class="promise_text right">
                	<strong>15天鉴赏期</strong><br />
                    客人于本网站预约的15天內，如果尚未完成拍摄并发现所订购的摄影产品不符合需求，客人均可享有免费退换货的权利，让客人拥有足
够的时间想清楚是否由我们来为您服务。<br />
于线上下订后，需在收到预约订购单的48小时內支付预约定金款项，用途为预留摄影师工作期或住宿或是交通方面的预定金额；若订购
后因故无法于预定时间前来，由于预约订金款项是作为预留摄影师工作期或住宿或交通费用的预定金额，既已生效，请注意将无法退还，
仅能延期处理*
                </div>
            </div>
            <div class="promise_info promise_info_five">
            	<div class="number left"><a>5</a></div>
                <div class="promise_text right">
                	<strong>一年內档期自由调整</strong><br />
                    在本网站预约后的一年內，客人将享有免费调整摄影档期的权利，可自由依照当时的天气状况或其它个别特殊需求与我们沟通调整档期，
但考量到相关调整作业时间，最晚需于拍摄前20日以上与服务人员提出调整档期需求，以保障自身与其他客人的拍照权益喔!<br />
*实际档期安排需主要配合店面门市的档期空档排定，无法确保完全符合您方便的时间，若造成不便敬请见谅*
                </div>
            </div>
            
            <div class="promise_info promise_info_six">
            	<div class="number left"><a>6</a></div>
                <div class="promise_text right">
                	<strong>安心消费不任意加收费用</strong><br />
                   在预约Romantic factor的摄影产品后，我们会按照客人的消费金额所含的产品项目条款为客人提供服务，仅有以下状况会增加客人
最后的消费金额，因此敬请安心消费~<br />
→享玩旅游摄影行所需旅景住宿、景点门票和餐饮费用<br />
→加购消费产品项目条款中所不含的交通费部分<br />
→增加或更改所购买的产品项目中的景点<br />
→加购女士之拍摄礼服整体造型数<br />
→事后加选照片入本组相本或加买其它摄影产品<br />
→寄送产品至您指定地址的邮寄费用
                </div>
            </div>
            <div class="promise_info promise_info_senven">
            	<div class="number left"><a>7</a></div>
                <div class="promise_text right">
                	<strong>专业送货到府服务</strong><br />
                    为了确保海外与外地客户均可享受到高品质的摄影服务，Romantic factor与知名且专业的货运公司配合，提供每位客人完善的摄影
产品寄送服务：<br />
港澳台地区：由統一速达宅急便全程专业寄送<br />
海外地区：由联邦快递(FedEX Express)全程专业寄送<br />
大陆地区：由顺丰速运全程专业寄送
                </div>
            </div> -->
        </div>
	</article>
	
    <%@ include file="/WEB-INF/jsp/front/tpl/footer_more.jsp"%>
    
<rf:contentFooterFront/>