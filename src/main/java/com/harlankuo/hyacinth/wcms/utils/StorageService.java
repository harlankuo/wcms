package com.harlankuo.hyacinth.wcms.utils;

import java.io.File;

/**
 * 文件存储服务
 * 
 * @author EricLee
 */
public class StorageService extends Storage {

	public final static StorageService FILES = new StorageService("files");

	private String file_path;

	private StorageService(String ext) {
		this.file_path = RequestUtils.webRoot() + "upload"
				+ File.separator + ext + File.separator;
	}

	@Override
	protected String getBasePath() {
		return file_path;
	}
}
