var HS = {};
var JS = {};
$(function(){
/*romantic_factor 鼠标滚动事件 start*/
var window_height = $(window).height();
$("#index_wrap_e").mousewheel(function(event, delta) {
        event.preventDefault();
        var that = $(this);	
        scroll_top = Math.round( parseInt( that.css('top') )/window_height );
        if ( that.is(':animated') ) {
                return;
        };
        if ( delta < 0 ) {
	   if(scroll_top == -3){
		return;
	   }else{
		  scroll_top--;
	   }
                //alert(scroll_top);              
        }else if ( delta > 0 ) {
	   if(scroll_top == 0){
		return;
	   }else{
		scroll_top++;
                }			//alert(scroll_top);
        };		
        that.animate({'top':(scroll_top)*100 + '%'}, 600);	
});
/*romantic_factor 点击下一页按钮 end*/
$(".index_down_btn").on('click', function(event) {
        var wrap_e = $("#index_wrap_e");
        var scroll_top = Math.round( parseInt( wrap_e.css('top') )/window_height );
        scroll_top--;
        wrap_e.animate({'top':(scroll_top)*100 + '%'}, 600);
});

/*第一屏图片调整*/
JS.adjustImg = function(){
    var box = $('#content_list1'),
          img = box.find('img'),
          img_w = img.width(),
          img_h = img.height(),
          img_k = img_h/img_w,
          wind_k = JS.wind_h/JS.wind_w;
    if( img_k > wind_k ){
        img.width(JS.wind_w);
        img.height(JS.wind_w*img_k);
        img.css('top',(JS.wind_h - JS.wind_w*img_k)/2);
    }else{
        img.height(JS.wind_h);
        img.width(JS.wind_h/img_k);
        img.css('left',(JS.wind_w - JS.wind_h/img_k)/2);
    }
};
JS.adjustImg();
setTimeout(JS.adjustImg, 500);

//首页第一屏效果
HS.moveBanner = function () {
        var box = $('#content_list1'),
              li = box.find('li'),
              len = li.length,
              cur = 0;
        setTimeout(function () {
            li.eq(0).addClass('now');
        }, 200);
        return function () {
                cur++;
                if ( cur > len - 1 ) {
                        cur = 0;
                }
                li.removeClass('now').eq(cur).addClass('now');
        }
}();
HS.bannerId = setInterval( HS.moveBanner, 8000 );





JS.wind_w = $(window).width();
JS.wind_h = $(window).height();
JS.zoom_dom = $('#content_list2');
JS.zoom_dom2 = $('#content_list3');
JS.init_zoom = JS.wind_w/1920;
JS.is_zoom = $('body').css('zoom');
JS.funzoom = function () {
        if ( JS.is_zoom != undefined && JS.is_zoom != '' ) {
			//alert(JS.is_zoom)
                JS.zoom_dom.css('zoom', JS.init_zoom);
                JS.zoom_dom2.css('zoom', JS.init_zoom);
	    if ( $(window).height() < 640 ) {
                        $('.content_four').css('zoom', 0.9);
                };
                $('.content_four_title').css('zoom', JS.init_zoom);	
        }else{
			//alert(JS.is_zoom)
                JS.zoom_dom[0].style.cssText = JS.zoom_dom[0].style.cssText +  'transform: scale(' + JS.init_zoom + '); -webkit-transform: scale(' + JS.init_zoom + ');-moz-transform: scale('+JS.init_zoom+'); ';  
                JS.zoom_dom2[0].style.cssText = JS.zoom_dom2[0].style.cssText +  'transform: scale(' + JS.init_zoom + '); -webkit-transform: scale(' + JS.init_zoom + ');-moz-transform: scale('+JS.init_zoom+');';  
                if ( $(window).height() < 640 ) {
                        $('.content_four').get(0).style.cssText = $('.content_four').get(0).style.cssText +  'transform: scale(' + 0.9 + '); -webkit-transform: scale(' + 0.9 + ');-moz-transform: scale('+0.9+');';  
                };  
                $('.content_four_title').get(0).style.cssText = $('.content_four_title').get(0).style.cssText +  'transform: scale(' + JS.init_zoom + '); -webkit-transform: scale(' + JS.init_zoom + ');-moz-transform: scale('+JS.init_zoom+');';  
        }
};
setTimeout(JS.funzoom, 1000);

//第三屏去掉阴影
var page_top  = $('#pic_mouse_e').offset().top;
$('#pic_mouse_e').find('ul').on('mousemove', function(event) {
        event.preventDefault();
        var x = event.pageX,
              y = event.pageY,
              that = $(this),
              li = that.find('li');
        if ( x/JS.wind_w < 0.203 ) {
                li.removeClass('now').eq(0).addClass('now');
        }else if ( x/JS.wind_w < 0.2655 ) {
                if ( (0.2655-x/JS.wind_w)*JS.wind_w/y > 0.1521 ) {/*左侧那一张*/
                        li.removeClass('now').eq(0).addClass('now');
                }else{
                        li.removeClass('now').eq(1).addClass('now');//右侧那一张
                }
        }else if ( x/JS.wind_w < 0.4685 ) {
                li.removeClass('now').eq(1).addClass('now');
        }else if ( x/JS.wind_w < 0.531 ) {
                if ( (x/JS.wind_w - 0.4685)*JS.wind_w/y > 0.1521 ) {/*右侧那一张*/
                        li.removeClass('now').eq(2).addClass('now');
                }else{
                        li.removeClass('now').eq(1).addClass('now');//右侧那一张
                }
        }else if ( x/JS.wind_w < 0.734 ) {
                li.removeClass('now').eq(2).addClass('now');
        }else if ( x/JS.wind_w < 0.7965 ) {
                if ( (0.7965-x/JS.wind_w)*JS.wind_w/y > 0.1521 ) {/*左侧那一张*/
                        li.removeClass('now').eq(2).addClass('now');
                }else{
                        li.removeClass('now').eq(3).addClass('now');//右侧那一张
                }
        }else{
                li.removeClass('now').eq(3).addClass('now');
        };
});

/*首页第三屏点击事件 start*/
    var prev_next_index = true;
    var move_index_pic = function () {
        var box = $('#pic_mouse_e'),
              len = box.find('ul').length,
              cur = 1;
        return function ( ind ) {
            cur = cur + ind;
            box.animate({
                'left': -cur*100 + '%'},
                800, function() {
                if ( cur == 0 ) {
                    cur = 3;
                }else if ( cur == 4 ) {
                    cur = 1;
                };
                box.css('left', -cur*100 + '%');
            });
        }
    }();
    $('.content_list3').on('click', 'a', function(event) {
        var that = $(this);
        if ( that.hasClass('prev') ) {
            move_index_pic(-1);
        }else if ( that.hasClass('next') ) {
            move_index_pic(1);
        };
    });


});

$(window).resize(function(event) {
        clearTimeout(JS.wind_resize);
        JS.wind_resize = setTimeout(function () {
                window.location.reload();
        },800);
});

HS.moveBanner2 = function () {
        var box = $('#banner2_e'),
              ul = box.find('.banner_ul2'),
              li = ul.find('li'),
              li_w = li.width(),
              ind_a = box.find('.btns').find('a'),
              cur = 0;
        ul.append( li.eq(0).clone() );
        li = ul.find('li');
        var len = li.length;
        ul.width( len*li_w );
        return function ( ind ) {
                if ( arguments.length == 0 ) {
                        cur++;
                }else if ( arguments.length == 1 ) {
                        cur = ind;
                }

                ul.animate({
                    'left': -cur*li_w},
                    600, function() {
                    if ( cur == len - 1 ) {
                            cur = 0;
                            ul.css('left', '0px');
                    };
                    ind_a.removeClass('now').eq(cur).addClass('now');
                });
        }
}();
HS.banner2Id = setInterval(HS.moveBanner2, 3000);

$('#banner2_e').find('.btns').hover(function() {
    clearInterval(HS.banner2Id);
}, function() {
    HS.banner2Id = setInterval(HS.moveBanner2, 3000);
});
$('#banner2_e').find('.btns').on('click', 'a', function(event) {
        var index = $(this).index();
              HS.moveBanner2(index);
});
