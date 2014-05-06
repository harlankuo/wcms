package com.harlankuo.hyacinth.wcms.web.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.multipart.MultipartFile;

/**
 * 存储服务
 * @author EricLee
 */
public abstract class Storage {
	
	private final static SimpleDateFormat FMT_FN = new SimpleDateFormat("yyyyMMddHHmmss_");
	private static final Log logger = LogFactory.getLog(Storage.class); // 日志记录
	protected abstract String getBasePath();

	/**
	 * 读取文件数据
	 * @param path
	 * @return
	 * @throws FileNotFoundException
	 */
	public FileInputStream read(String path) throws FileNotFoundException {
		return new FileInputStream(getBasePath() + path);
	}

	/**
	 * 读取文件
	 * @param path
	 * @return
	 * @throws FileNotFoundException
	 */
	public File readFile(String path) throws FileNotFoundException {
		return new File(getBasePath() + path);
	}
	
	/**
	 * 判断文件是否存在
	 * @param path
	 * @return
	 */
	public boolean exist(String path) {
		return new File(getBasePath() + path).exists();
	}
	
	/**
	 * 保存文件，并返回对应的文件URI
	 * @param f
	 * @return
	 * @throws IOException 
	 */
	public String save(MultipartFile f) throws IOException {
		String uri = FMT_FN.format(new Date()) + 
			RandomStringUtils.randomAlphanumeric(4) + '.' + 
			FilenameUtils.getExtension(f.getOriginalFilename()).toLowerCase();
		return save(f, uri);
	}

	/**
	 * 保存文件到指定路径
	 * @param f
	 * @param path
	 * @throws IOException 
	 */
	public String save(MultipartFile f, String path) throws IOException {		
		File dest = new File(getBasePath() + path);
		if(!dest.getParentFile().exists())
			dest.getParentFile().mkdirs();
		f.transferTo(dest);
		//return path;
		return getBasePath() + path;
	}
	
	/**
	 * 根据路径来删除文件
	 * @param path
	 * @throws IOException
	 */
	public void delete(String path) throws IOException {
		File dest = new File(getBasePath() + path);
		FileUtils.forceDelete(dest);
	}
	
	/**
	 * 下载文件
	 * @param request
	 * @param response
	 * @param filePath 要下载的文件路径 
	 */
	public static void downLoadFile(HttpServletRequest request, HttpServletResponse response,String filePath) {
		OutputStream toClient = null;
		try {
			// 测试--设置为固定路径
			String path = request.getRealPath("/") + filePath;
			File file = new File(path);
			
			String fileName = filePath.substring(filePath.lastIndexOf("\\") + 1);
			response.setContentLength((int) file.length());
			//设置文件类型
	        response.setContentType("application/msexcel;charset=UTF-8");
			response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName,"UTF-8"));
			toClient = response.getOutputStream(); // 得到向客户端输出二进制数据的对象
			IOUtils.copy(new FileInputStream(path),toClient);
			
		} catch (IOException ex) {
			logger.error("下载文件出错", ex);
		} finally {
			try {
				if (toClient != null) {
					toClient.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
