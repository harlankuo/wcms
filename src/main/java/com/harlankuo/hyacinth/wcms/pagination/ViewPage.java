/**
 * 项目名:Web内容管理系统
 * 包名：com.harlankuo.hyacinth.wcms.utils.pagination
 * 文件名：ViewPage.java
 * 版本信息：1.0
 * 日期：2014年5月5日-上午9:38:28
 * 作者：harlankuo
 * Copyright (c)2014版权所有--harlankuo
 */

package com.harlankuo.hyacinth.wcms.pagination;

import java.util.List;

/**
 * 类名称：ViewPage 类描述：分页接口。
 * 创建人：harlankuo 修改人：harlankuo 修改时间：2014年5月5日 上午9:38:28
 * 修改备注：@version 1.0.0
 */

public interface ViewPage<T>{
	/**
	 * 获取总页数
	 * 
	 * @return 总页数
	 */
	public int getPageCount();

	/**
	 * 获得页面大小
	 * 
	 * @return 页面大小
	 */
	public int getPageSize();

	/**
	 * 设置页面大小
	 * 
	 * @param size
	 */
	public void setPageSize(T entity, int size);

	/**
	 * 获得当前页数据
	 * 
	 * @return 数据列表
	 */
	public List<T> getPageData(T entity);

	/**
	 * 获得当前页索引号
	 * 
	 * @return 当前页索引号
	 */
	public int getPageIndex();

	/**
	 * 获得当前页记录总数
	 * 
	 * @return 当前页记录总数
	 */
	public int getPageRows();

	/**
	 * 是否有下一页
	 * 
	 * @return
	 */
	public boolean getHashNextPage();

	/**
	 * 是否有上一页
	 * 
	 * @return
	 */
	public boolean getHashPreviousPage();

	/**
	 * 转到尾页
	 * 
	 */
	public void gotoLastPage();

	/**
	 * 转到首页
	 * 
	 */
	public void gotoFirstPage();

	/**
	 * 是否首页
	 * 
	 * @return
	 */
	public boolean isFirstPage();

	/**
	 * 是否尾页
	 * 
	 * @return
	 */
	public boolean isLastPage();

	/**
	 * 转到上一页
	 * 
	 */
	public void gotoPreviousPage();

	/**
	 * 转到下一页
	 * 
	 */
	public void gotoNextPage();

	/**
	 * 转到指定页面,pageIndex小于1时，转到第一页;pageIndex大于总页数时，转到最尾页
	 * 
	 * @param pageIndex
	 *            指定的页号
	 */
	public void gotoPage(int pageIndex);

	/**
	 * 获取当前页第一条记录的记录号
	 * 
	 * @return int 当前页第一条记录的记录号
	 */
	public int getPageFirstRecord();

	/**
	 * 获取当前页最后一条记录的记录号
	 * 
	 * @return int 当前页最后一条记录的记录号
	 */
	public int getPageLastRecord();

}
