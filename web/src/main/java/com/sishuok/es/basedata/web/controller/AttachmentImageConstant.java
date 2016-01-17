package com.sishuok.es.basedata.web.controller;

import java.awt.Point;

public class AttachmentImageConstant {
	public static class ImageSize {
		/**
		 * 艺术家个人头像<br />
		 * x代表width，y代表heigth
		 */
		public static final Point Artist_Person = new Point(266, 350);
		/**
		 * 艺术家作品，宽<br />
		 * x代表width，y代表heigth<br />
		 * width > heigth
		 */
		public static final Point Artist_Works_Max_Width = new Point(270, 180);
		/**
		 * 艺术家作品，高<br />
		 * x代表width，y代表heigth<br />
		 * heigth > width
		 */
		public static final Point Artist_Works_Max_Height = new Point(270, 390);
		/**
		 * 网页头部图片<br />
		 * x代表width，y代表heigth
		 */
		public static final Point Page_Head = new Point(1920, 500);
	}
}