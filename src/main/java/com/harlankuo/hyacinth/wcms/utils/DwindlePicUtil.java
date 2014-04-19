package com.harlankuo.hyacinth.wcms.utils;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

/**
 ********************************************************* 
 * @ClassName:DwindlePic
 * @Package:com.pub.util
 * @Description:TODO
 * @author PengDeJian pdj@cnsesan.com
 * @date 2013-1-9-下午01:10:15
 ********************************************************* 
 */
public class DwindlePicUtil {
	int OutputWidth = 1000; // 默认输出图片宽
	int OutputHeight = 1500; // 默认输出图片高
	boolean proportion = true; // 是否等比缩放标记(默认为等比缩放)

	/** 压缩文件 **/
	public String s_pic(byte[] imageContent, File outFile) {

		// 建立输出文件对象
		FileOutputStream tempout = null;
		try {
			tempout = new FileOutputStream(outFile);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		Image img = null;
		Toolkit tk = Toolkit.getDefaultToolkit();
		Applet app = new Applet();
		MediaTracker mt = new MediaTracker(app);
		try {
			img = tk.createImage(imageContent);
			mt.addImage(img, 0);
			mt.waitForID(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (img.getWidth(null) == -1) {
			return "no";
		} else {
			int new_w;
			int new_h;
			if (this.proportion == true) { // 判断是否是等比缩放.
				// 为等比缩放计算输出的图片宽度及高度
				double rate1 = ((double) img.getWidth(null))
						/ (double) OutputWidth + 0.1;
				double rate2 = ((double) img.getHeight(null))
						/ (double) OutputHeight + 0.1;
				double rate = rate1 > rate2 ? rate1 : rate2;
				new_w = (int) (((double) img.getWidth(null)) / rate);
				new_h = (int) (((double) img.getHeight(null)) / rate);
			} else {
				new_w = OutputWidth; // 输出的图片宽度
				new_h = OutputHeight; // 输出的图片高度
			}
			BufferedImage buffImg = new BufferedImage(new_w, new_h,
					BufferedImage.TYPE_INT_RGB);

			Graphics g = buffImg.createGraphics();

			g.setColor(Color.white);
			g.fillRect(0, 0, new_w, new_h);

			g.drawImage(img, 0, 0, new_w, new_h, null);
			g.dispose();

			JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(tempout);
			try {
				encoder.encode(buffImg);
				tempout.close();
			} catch (IOException ex) {
				System.out.println(ex.toString());
			}
		}
		return "ok";
	}

	/**
	 * 对图片裁剪，并把裁剪完蛋新图片保存 。
	 */
	public void cutImage(String srcPath, int x, int y, int height, int width,
			String dirPath) throws IOException {

		FileInputStream is = null;
		ImageInputStream iis = null;

		try {
			// 读取图片文件
			is = new FileInputStream(srcPath);

			/*
			 * 返回包含所有当前已注册 ImageReader 的 Iterator，这些 ImageReader 声称能够解码指定格式。
			 * 参数：formatName - 包含非正式格式名称 .（例如 "jpeg" 或 "tiff"）等 。
			 */
			Iterator<ImageReader> it = ImageIO
					.getImageReadersByFormatName("jpg");
			ImageReader reader = it.next();
			// 获取图片流
			iis = ImageIO.createImageInputStream(is);
			/*
			 * <p>iis:读取源.true:只向前搜索 </p>.将它标记为 ‘只向前搜索’。
			 * 此设置意味着包含在输入源中的图像将只按顺序读取，可能允许 reader 避免缓存包含与以前已经读取的图像关联的数据的那些输入部分。
			 */
			reader.setInput(iis, true);
			/*
			 * <p>描述如何对流进行解码的类<p>.用于指定如何在输入时从 Java Image I/O
			 * 框架的上下文中的流转换一幅图像或一组图像。用于特定图像格式的插件 将从其 ImageReader 实现的
			 * getDefaultReadParam 方法中返回 ImageReadParam 的实例。
			 */
			ImageReadParam param = reader.getDefaultReadParam();
			/*
			 * 图片裁剪区域。Rectangle 指定了坐标空间中的一个区域，通过 Rectangle 对象
			 * 的左上顶点的坐标（x，y）、宽度和高度可以定义这个区域。
			 */
			Rectangle rect = new Rectangle(x, y, width, height);
			// 提供一个 BufferedImage，将其用作解码像素数据的目标。
			param.setSourceRegion(rect);
			/*
			 * 使用所提供的 ImageReadParam 读取通过索引 imageIndex 指定的对象，并将 它作为一个完整的
			 * BufferedImage 返回。
			 */
			BufferedImage bi = reader.read(0, param);
			// 保存新图片
			ImageIO.write(bi, "jpg", new File(dirPath));
		} finally {
			if (is != null)
				is.close();
			if (iis != null)
				iis.close();
		}
	}

}
