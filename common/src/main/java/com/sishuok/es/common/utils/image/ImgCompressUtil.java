package com.sishuok.es.common.utils.image;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;

import org.springframework.util.StringUtils;

public class ImgCompressUtil {
	public static void main(String[] args) {
		//ImgCompressUtil.compressPic("F:\\index_pic4.png","F:\\test1.png", 1f);
		scale2("F:\\IMG_0021.jpg", "F:\\test1.jpg",  
	            650, 2550, true);
	}
	
	public static boolean compressPic(String srcFilePath, String descFilePath,
			float qality) {
		File file = null;
		BufferedImage src = null;
		FileOutputStream out = null;
		ImageWriter imgWrier;
		ImageWriteParam imgWriteParams;

		// 指定写图片的方式为 jpg
		imgWrier = ImageIO.getImageWritersByFormatName("png").next();
		imgWriteParams = new javax.imageio.plugins.jpeg.JPEGImageWriteParam(
				null);
		
		// 要使用压缩，必须指定压缩方式为MODE_EXPLICIT
		imgWriteParams.setCompressionMode(imgWriteParams.MODE_EXPLICIT);
		// 这里指定压缩的程度，参数qality是取值0~1范围内，
		imgWriteParams.setCompressionQuality(qality);
		
		imgWriteParams.setProgressiveMode(imgWriteParams.MODE_DISABLED);
		ColorModel colorModel = ColorModel.getRGBdefault();
		
		// 指定压缩时使用的色彩模式
		imgWriteParams.setDestinationType(new javax.imageio.ImageTypeSpecifier(
				colorModel, colorModel.createCompatibleSampleModel(16, 16)));

		try {
			if (StringUtils.isEmpty(srcFilePath)) {
				return false;
			} else {
				file = new File(srcFilePath);
				src = ImageIO.read(file);
				out = new FileOutputStream(descFilePath);

				imgWrier.reset();
				// 必须先指定 out值，才能调用write方法, ImageOutputStream可以通过任何
				// OutputStream构造
				imgWrier.setOutput(ImageIO.createImageOutputStream(out));
				// 调用write方法，就可以向输入流写图片
				imgWrier.write(null, new IIOImage(src, null, null),
						imgWriteParams);
				out.flush();
				out.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	/** 
     * 缩放图像（按高度和宽度缩放） 
     * @param srcImageFile 源图像文件地址 
     * @param result 缩放后的图像地址 
     * @param height 缩放后的高度 
     * @param width 缩放后的宽度 
     * @param bb 比例不对时是否需要补白：true为补白; false为不补白; 
     */  
    public final static void scale2(String srcImageFile, String result,  
            int height, int width, boolean bb) {  
        try {  
        	
        	
            double ratio = 0.0; // 缩放比例  
            File f = new File(srcImageFile);  
            BufferedImage bi = ImageIO.read(f);  
            

        	double rate1 = ((double) bi.getWidth(null))
					/ (double) width + 0.1;
			double rate2 = ((double) bi.getHeight(null))
					/ (double) height + 0.1;
			// 根据缩放比率大的进行缩放控制
			double rate = rate1 > rate2 ? rate1 : rate2;
			width = (int) (((double) bi.getWidth(null)) / rate);
			height = (int) (((double) bi.getHeight(null)) / rate);
            
            
            Image itemp = bi.getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH);  
            // 计算比例  
            if ((bi.getHeight() > height) || (bi.getWidth() > width)) {  
                if (bi.getHeight() > bi.getWidth()) {  
                    ratio = (new Integer(height)).doubleValue()  
                            / bi.getHeight();  
                } else {  
                    ratio = (new Integer(width)).doubleValue() / bi.getWidth();  
                }  
                AffineTransformOp op = new AffineTransformOp(AffineTransform  
                        .getScaleInstance(ratio, ratio), null);  
                itemp = op.filter(bi, null);  
                
                
            }  
            if (bb) {//补白  
                BufferedImage image = new BufferedImage(width, height,  
                        BufferedImage.TYPE_INT_RGB);  
                Graphics2D g = image.createGraphics();  
                g.setColor(Color.white);  
                g.fillRect(0, 0, width, height);  
                if (width == itemp.getWidth(null))  
                    g.drawImage(itemp, 0, (height - itemp.getHeight(null)) / 2,  
                            itemp.getWidth(null), itemp.getHeight(null),  
                            Color.white, null);  
                else  
                    g.drawImage(itemp, (width - itemp.getWidth(null)) / 2, 0,  
                            itemp.getWidth(null), itemp.getHeight(null),  
                            Color.white, null);  
                g.dispose();  
                itemp = image;  
            }  
            ImageIO.write((BufferedImage) itemp, "JPEG", new File(result));  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    } 
}
