// JavaScript Document
$(function() {
	var window_height = $(window).height();

	/* 鼠标经过头部菜单 start */
	// $("#header_logo_img").hover(function(){
	// $(".nav_content").animate({"opacity":"0.75","filter":"alpha(opacity=75)"},800);
	// },function(){
	// $(".nav_content").animate({"opacity":"0.0","filter":"alpha(opacity=0)"},800);
	// });
	/* 鼠标经过头部菜单 end */

	// 头部图片轮播 start
	var my_top_pic_index = 0;
	var my_top_ul = $(".my_top_ul");
	var wind_w = $(window).width();
	var ul_length = my_top_ul.find("li").length;
	my_top_ul.css("width", (ul_length * wind_w) + "px");
	my_top_ul.find("li").css("width", wind_w);
	window.setInterval(function() {
		my_top_pic_index++;
		if (my_top_pic_index == (ul_length - 1)) {
			my_top_ul.animate({
				"left" : (-my_top_pic_index * wind_w) + "px"
			}, 1200, function() {
				my_top_ul.css("left", "0");
			})
			my_top_pic_index = 0;
		} else {
			my_top_ul.animate({
				"left" : (-my_top_pic_index * wind_w) + "px"
			}, 1200);
		}
	}, 6000);
	// 头部图片轮播 end

	/* 头部图片轮播 height:580px start */
	// var now_pic_index_fri = 0;
	// var my_fir_ul = $(".my_top_fir_ul");
	// window.setInterval(function(){
	// now_pic_index_fri++;
	// if(now_pic_index_fri==3){
	// my_fir_ul.animate({"left":(-now_pic_index_fri)+"00%"},1000,function(){
	// my_fir_ul.css("left","0");
	// })
	// now_pic_index_fri = 0;
	// }else{
	// my_fir_ul.animate({"left":(-now_pic_index_fri)+"00%"},1000);
	// }
	// },4000);
	/* 头部图片轮播 height:580px end */

	/* 头部图片轮播 height:506px start */
	// var now_pic_index_sec = 0;
	// var my_sec_ul = $(".my_top_sec_ul");
	// window.setInterval(function(){
	// now_pic_index_sec++;
	// if(now_pic_index_sec==3){
	// my_sec_ul.animate({"left":(-now_pic_index_sec)+"00%"},1000,function(){
	// my_sec_ul.css("left","0");
	// })
	// now_pic_index_sec = 0;
	// }else{
	// my_sec_ul.animate({"left":(-now_pic_index_sec)+"00%"},1000);
	// }
	// },4000);
	/* 头部图片轮播 height:506px end */

	/* dress_btns 點擊事件 start */
	var now_btns_index = 0;
	var bigPicAttrName = "name";
	/* 點擊數字按鈕 */
	$(".dress_btns").find(".one").click(function() {
		$(".dress_btns").find(".number").removeClass("this_btn");
		$(this).addClass("this_btn");
		now_btns_index = 0;
	});
	$(".dress_btns").find(".two").click(function() {
		$(".dress_btns").find(".number").removeClass("this_btn");
		$(this).addClass("this_btn");
		now_btns_index = 1;
	});
	$(".dress_btns").find(".three").click(function() {
		$(".dress_btns").find(".number").removeClass("this_btn");
		$(this).addClass("this_btn");
		now_btns_index = 2;
	});
	/* 點擊首頁按鈕 */
	$(".dress_btns").find(".fri_btn").click(function() {
		$(".dress_btns").find(".number").removeClass("this_btn");
		$(".dress_btns").find(".number").eq("0").addClass("this_btn");
		now_btns_index = 0;
	});
	/* 點擊尾頁按鈕 */
	$(".dress_btns").find(".last_btn").click(function() {
		$(".dress_btns").find(".number").removeClass("this_btn");
		$(".dress_btns").find(".number").eq("2").addClass("this_btn");
		now_btns_index = 2;
	});
	/* 點擊下一頁按鈕 */
	$(".dress_btns").find(".next_btn").click(function() {
		now_btns_index++;
		if (now_btns_index == 3) {
			now_btns_index = 0;
		}
		$(".dress_btns").find(".number").removeClass("this_btn");
		$(".dress_btns").find(".number").eq(now_btns_index).addClass("this_btn");
	});
	/* dress_btns 點擊事件 end */

	/* dress_wedding 關閉窗口按鈕事件 start */
	$(".close_dialog").click(function() {
		/* $(".dress_dialog_bgd").toggleClass("now"); */
		$(".dress_dialog_bgd").slideToggle("1000");
	});
	/* dress_wedding 關閉窗口按鈕事件 end */
	function change_img_size() {
		// 9.8更改 start
		var big_h = $(".big_pic").find("img").height();
		var big_w = $(".big_pic").find("img").width();
		var big_k = big_h / big_w;
		var small_k = 550 / 900;
		// alert($(".big_pic").find("img").attr("src"));
		// alert("big_h"+big_h);
		// alert("big_w"+big_w);
		// alert("big_k:"+big_k);
		// alert("small_k:"+small_k);
		if (big_k > small_k) {
			$(".big_pic").find("img").css("height", "550px");
		} else {
			$(".big_pic").find("img").css("width", "900px");
		}
		// 9.8更改end
	}

	/* dress_wedding dialog點擊小圖片事件 start */
	var small_pic_index = 1;
	function add_small_pic_click_event() {
		$(".pre_pics").find("img").click(function() {
			var big_pic_url = $(this).attr(bigPicAttrName);
			$(".big_pic").find("img").fadeToggle("fast", function() {
				$(".big_pic").find("img").attr("src", big_pic_url);
				change_img_size();
			});
			$(".big_pic").find("img").slideToggle("2000");
			$(".pre_pics").find("img").removeClass("big_pic_this");
			$(this).addClass("big_pic_this");
			small_pic_index = $(this).attr("index");
			$(".now_small_pic_index").text(small_pic_index);
		});
	}
	/*
	 * $(".next_btns").find(".btn_right").click(function(){ small_pic_index++;
	 * if(small_pic_index==13){small_pic_index=1;}
	 * $(".pre_pics").find("img").removeClass("big_pic_this");
	 * $("[index='"+small_pic_index+"']").addClass("big_pic_this"); var
	 * big_pic_url = $(".big_pic_this").attr("src");
	 * $(".big_pic").find("img").fadeToggle("fast",function(){
	 * $(".big_pic").find("img").attr("src",big_pic_url); });
	 * $(".big_pic").find("img").slideToggle("2000");
	 * $(".now_small_pic_index").text(small_pic_index); });
	 */
	/*
	 * $(".next_btns").find(".btn_left").click(function(){ small_pic_index--;
	 * if(small_pic_index==0){small_pic_index=12;}
	 * $(".pre_pics").find("img").removeClass("big_pic_this");
	 * $("[index='"+small_pic_index+"']").addClass("big_pic_this"); var
	 * big_pic_url = $(".big_pic_this").attr("src");
	 * $(".big_pic").find("img").fadeToggle("fast",function(){
	 * $(".big_pic").find("img").attr("src",big_pic_url); });
	 * $(".big_pic").find("img").slideToggle("2000");
	 * $(".now_small_pic_index").text(small_pic_index); });
	 */
	/*
	 * $(".dress_dialog_content").find("div").eq("0").click(function(){
	 * small_pic_index--; if(small_pic_index==0){small_pic_index=12;}
	 * $(".pre_pics").find("img").removeClass("big_pic_this");
	 * $("[index='"+small_pic_index+"']").addClass("big_pic_this"); var
	 * big_pic_url = $(".big_pic_this").attr("src");
	 * $(".big_pic").find("img").fadeToggle("fast",function(){
	 * $(".big_pic").find("img").attr("src",big_pic_url); });
	 * $(".big_pic").find("img").slideToggle("2000");
	 * $(".now_small_pic_index").text(small_pic_index); });
	 * $(".dress_dialog_content").find("div").eq("1").click(function(){
	 * small_pic_index++; if(small_pic_index==13){small_pic_index=1;}
	 * $(".pre_pics").find("img").removeClass("big_pic_this");
	 * $("[index='"+small_pic_index+"']").addClass("big_pic_this"); var
	 * big_pic_url = $(".big_pic_this").attr("src");
	 * $(".big_pic").find("img").fadeToggle("fast",function(){
	 * $(".big_pic").find("img").attr("src",big_pic_url); });
	 * $(".big_pic").find("img").slideToggle("2000");
	 * $(".now_small_pic_index").text(small_pic_index); });
	 */
	/*
	 * dress_wedding dialog點擊小圖片事件 end
	 * 
	 * /*dress_wedding 點擊大圖片事件 start
	 */
	$(".dress_content_list, .dress_detial_list").find("img").click(function() {
		/* $(".dress_dialog_bgd").toggleClass("now"); */
		var srcBig = $(this).attr(bigPicAttrName);
		var index = $(this).parents('li').index();
		$(".dress_dialog_bgd").slideToggle("1000");
		$('.big_pic').find('img').attr('src', srcBig);
		$('.pre_table').find('img').removeClass('big_pic_this').end().find('td').eq(index).find('img').addClass('big_pic_this');
		change_img_size();
	});
	/* dress_wedding 點擊大圖片事件 end */

	var imgaddurl = function() {
		// body...
		var boxul = $('ul.fix'), bigimg = boxul.find('img'), len = bigimg.length, thumbimg = $('.pre_table').find('img');
		var trRow = $('.pre_table').find('tr');
		var tempStr = '';
		for (var i = 0; i < len; i++) {
			tempStr = tempStr + '<td><a href="JavaScript:;"><img index="' + i + '" class="big_pic_this" src="' + bigimg.eq(i).attr('src') + '" '
					+ bigPicAttrName + '="' + bigimg.eq(i).attr(bigPicAttrName) + '" /></a></td>';
			// thumbimg.eq(i).attr('src', bigimg.eq(i).attr('src'));
			// thumbimg.eq(i).attr(bigPicAttrName,
			// bigimg.eq(i).attr(bigPicAttrName));
		}
		$('.pre_table').find('tr').html(tempStr);
		$('.big_pic').find('img').attr('src', bigimg.eq(0).attr(bigPicAttrName));// 默认显示第一张大图
		add_small_pic_click_event();
	}();// 定义完后，直接执行一次

	/* 首頁第二屏圖片輪播按鈕點擊事件 start */
	var now_content_list2_lubo_index = 0;
	window.setInterval(function() {
		now_content_list2_lubo_index++;
		if (now_content_list2_lubo_index == 4) {
			$(".content_list2_lunbo").find(".btns").find("a").css({
				"background-color" : "#282a32"
			});
			$(".content_list2_lunbo").find(".btns").find("a").eq("0").css({
				"background-color" : "#fff"
			});
			$(".content_list2_lunbo").find("table").animate({
				'right' : (now_content_list2_lubo_index) * 100 + '%'
			}, 1000, function() {
				$(".content_list2_lunbo").find("table").css({
					"right" : "0"
				});
				now_content_list2_lubo_index = 0;
			});

		} else {
			$(".content_list2_lunbo").find(".btns").find("a").css({
				"background-color" : "#282a32"
			});
			$(".content_list2_lunbo").find(".btns").find("a").eq(now_content_list2_lubo_index).css({
				"background-color" : "#fff"
			});
			$(".content_list2_lunbo").find("table").animate({
				'right' : (now_content_list2_lubo_index) * 100 + '%'
			}, 1000);
		}

	}, 5000);

	$(".content_list2_lunbo").find(".btns").find("a").click(function() {
		$(this).parent().find("a").css({
			"background-color" : "#282a32"
		});
		$(this).css({
			"background-color" : "#fff"
		});
		var btns_index = $(this).parent().find("a").index($(this));
		$(".content_list2_lunbo").find("table").animate({
			'right' : (btns_index) * 100 + '%'
		}, 1000);
	});
	/* 首頁第二屏圖片輪播按鈕點擊事件 end */

	/* 首頁第二屏鼠标进过小图片事件 start */
	$(".content_list2_groundpics").find("a").hover(function() {
	}, function() {
	});
	/* 首頁第二屏鼠标进过小图片事件 start */

	var fir_pic_url;
	var sec_pic_url;
	$(".content_box_pic").find("li").hover(function() {
		fir_pic_url = $(this).find("img").eq("0").attr("src");
		sec_pic_url = $(this).find("img").eq("1").attr("src");
		$(this).find("img").eq("0").attr("src", sec_pic_url);
		// $(this).find("img").eq("0").fadeToggle(1000);
	}, function() {
		$(this).find("img").eq("0").attr("src", fir_pic_url);
		// $(this).find("img").eq("0").fadeToggle(1000);
	});

	/*
	 * $(".content_list3").find(".prev").click(function(){ if(prev_next_index){
	 * $(".content_list3").find(".content_box_pic").animate({"right":"100%"},1000);
	 * prev_next_index = false; }else{
	 * $(".content_list3").find(".content_box_pic").animate({"right":"0"},1000);
	 * prev_next_index = true; } });
	 * $(".content_list3").find(".next").click(function(){ if(prev_next_index){
	 * $(".content_list3").find(".content_box_pic").animate({"right":"100%"},2000);
	 * prev_next_index = false; }else{
	 * $(".content_list3").find(".content_box_pic").animate({"right":"0"},2000);
	 * prev_next_index = true; } });
	 */
	/* 首页第三屏点击事件 end */

	/* 处理首页第一屏的图片 start */
	/*
	 * window.onresize = function(){ window.location="romantic_factor.html" }
	 */
	/*
	 * var box = $(window), img = $(".index_content").find(".one").find("img"),
	 * img_w = img.width(), img_h = img.height(), img_k = img_h/img_w, wind_k =
	 * $(window).height()/$(window).width(); if ( img_k < wind_k ) { img.height(
	 * $(window).height() ); img.width( $(window).height()/img_k ); img_w =
	 * $(window).height()/img_k; img.css('left', ($(window).width() - img_w)/2 );
	 * }else{ img.width( $(window).width() ); img.height(
	 * $(window).width()*img_k ); img_h = $(window).width()*img_k;
	 * img.css('top', ($(window).height() - img_h)/2 ); }
	 */

	/* 处理首页第一屏的图片 end */

	$('.big_pic').on('click', 'img', function(event) {
		window.open(this.src);
	});

	function makeScrollTop() {// 创建回到顶部的按钮，样式在CSS中定义
		var ft = [ '<div class="mk-fixed-scrolltop">', '<div class="rocket-icon"></div>', '<div class="contact-bottom-wrap">', '</div>', '</div>' ];
		jQuery('body').append(ft.join(' '));
		jQuery(window).scroll(function() {
			if (jQuery(this).scrollTop() > 100) {
				jQuery('.rocket-icon').fadeIn();
			} else {
				jQuery('.rocket-icon').fadeOut();
			}
		});
		jQuery('.mk-fixed-scrolltop .rocket-icon').click(function() {
			jQuery("html, body").animate({
				scrollTop : 0
			}, 200);
			return false;
		});
	}
	;
	makeScrollTop();
});
