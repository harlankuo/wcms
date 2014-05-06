/**
* 项目名:Web内容管理系统
* 包名：com.harlankuo.hyacinth.wcms.utils.pagination
* 文件名：AbstractViewPage.java
* 版本信息：1.0
* 日期：2014年5月5日-上午9:40:17
* 作者：harlankuo
* Copyright (c)2014版权所有--harlankuo
*/
	
package com.harlankuo.hyacinth.wcms.pagination;

import java.util.ArrayList;
import java.util.List;

import com.harlankuo.hyacinth.wcms.exception.SystemException;

/**
 * 类名称：AbstractViewPage
 * 类描述：分页默认抽象实现
 * 初始时，分页类有下列默认值：
 * 分页大小为-1,为不分页;
 * 总页数为1页
 * 当前页为第一页
 * 总记录数为0条
 * 当前页数据列表为没有任何记录的列表
 * 创建人：harlankuo
 * 修改人：harlankuo
 * 修改时间：2014年5月5日 上午9:40:17
 * 修改备注：@version 1.0.0
 */
@SuppressWarnings("unchecked")
public abstract class AbstractViewPage<T> implements ViewPage<T> {
	//-----------------------------------------
    //私有静态常量
    //-----------------------------------------
    
    private static final int DEFAULT_PAGE_INDEX = 1;

	private static final int DEFALT_PAGE_COUNT = 1;
    
    private static final int DEFAULT_PAGE_SIZE = -1;
    
    private static final int DEFAULT_ROWS = 0;
    
    //-----------------------------------------
    //私有成员变量
    //-----------------------------------------
    
    /**当前页索引号**/
    private int pageIndex = DEFAULT_PAGE_INDEX;
       /**总页数**/
    private int pageCount =DEFALT_PAGE_COUNT;

    /**分页大小**/
    private int pageSize = DEFAULT_PAGE_SIZE ;
    
    /**数据总记录数**/
    private int rows = DEFAULT_ROWS;
    
    //------------------------------------------
    //本地成员变量getter,setter方法
    //------------------------------------------
    

    /**
     * 设置新页号，只有大于等于1而且小于等于总页数并且不为当前页时，才允许设置
     * @param pageIndex The pageIndex to set.
     */
    private void setPageIndex(int newPageIndex) {
            
       if( newPageIndex >= this.DEFAULT_PAGE_INDEX &&  newPageIndex <= this.getPageCount() &&  newPageIndex != this.pageIndex) {
               this.pageIndex = newPageIndex;
       }
       
    }

    /**
     * @return Returns the rows.
     */
    private int getRows() {
            return rows;
    }

    /**
     * @param rows The rows to set.
     */
    private void setRows(int rows) {
            this.rows = rows;
    }
       /**
     * @param pageCount The pageCount to set.
     */
    private void setPageCount(int pageCount) {
            this.pageCount = pageCount;
    }
    
    
    
    //--------------------------------------
    //实现Page接口方法
    //--------------------------------------
    

    /**
     * @see com.harlankuo.hyacinth.wcms.pagination.ViewPage#getPageData()
     */
    public List<T> getPageData(T entity) {
             List<T> pageList =null;
             
            //获得当前页数据 
            pageList = this.pageList(entity,this.getPageFirstRecord(), this.getPageRows());
             //保证不返回null
             if(pageList == null) {
                     pageList =new ArrayList<T>();
             }
             return pageList;
            
    }
    
    /**
     * 获得当前页数据，调用queryPageList()方法，将异常封装为non-checked异常
      * @param startRow  开始记录号
      * @param rowCount  记录总数
      * @return 当前页数据
     * @throws SystemException
     */
    private List<T> pageList(T entity,int startRow, int rowCount) throws SystemException{
            try{
                    return queryPageList(entity,startRow, rowCount);
            }catch(Exception ex){
                    throw new SystemException(ex);
            }
    }
    

    /** 
     * @see com.harlankuo.hyacinth.wcms.pagination.ViewPage#getPageIndex()
     */
    public int getPageIndex() {
      return this.pageIndex;
    }
    /**
     * @see com.harlankuo.hyacinth.wcms.pagination.ViewPage#isFirstPage()
     */
    public boolean isFirstPage() {
            
            return  this.DEFAULT_PAGE_INDEX ==this.pageIndex;
    }
       /**
     * @see com.harlankuo.hyacinth.wcms.pagination.ViewPage#isLastPage()
     */
    public boolean isLastPage() {
            //当前页索引为总页数时为最后一页
            return this.pageIndex == this.pageCount;
    }        

    /**
     * @see com.harlankuo.hyacinth.wcms.pagination.ViewPage#getHashNextPage()
     */
    public boolean getHashNextPage() {
        //当前页索引号小于总页数
            return this.pageIndex  < this.pageCount ;
    }

    /**
     * @see com.harlankuo.hyacinth.wcms.pagination.ViewPage#getHashPreviousPage()
     */
    public boolean getHashPreviousPage() {
            //当前页索引号大于默认的初始页号,这里为1
            return this.pageIndex  > this.DEFAULT_PAGE_INDEX ;
    }



    /**
     * @see com.harlankuo.hyacinth.wcms.pagination.ViewPage#getPageCount()
     */
    public int getPageCount() {
            
            return this.pageCount;
    }



    /**
     * @see com.harlankuo.hyacinth.wcms.pagination.ViewPage#getPageSize()
     */
    public int getPageSize() {
            
            return this.pageSize;
    }

       /**
     * @see com.harlankuo.hyacinth.wcms.pagination.ViewPage#getPageRows()
     */
    public int getPageRows() {
            //当页面大小为-1 时,返回总记录数
            if(this.DEFAULT_PAGE_SIZE == this.pageSize ) {
                    return this.rows;
            }
            
            //不为最后一页时，返回pageSize
            if(!this.isLastPage()) {
                    return this.pageSize;
            }
            //最后一页时
            return this.rows - (this.pageSize * (this.pageCount -1));
    }
    
    

    /**
     * @see com.harlankuo.hyacinth.wcms.pagination.ViewPage#getPageFirstRecord()
     */
    public int getPageFirstRecord() {
            
            //页大小为-1 时
            if(this.DEFAULT_PAGE_SIZE== this.pageSize ) {
                    return 0;
            }
            return (this.pageIndex -1)* this.pageSize;
    }
    
    /**
     * @see com.harlankuo.hyacinth.wcms.pagination.ViewPage#getPageLastRecord()
     */
    public int getPageLastRecord() {
            //页大小为-1时,返回总记录数
        if(this.DEFAULT_PAGE_SIZE == this.pageSize) {
                return this.rows;
        }
            return this.getPageFirstRecord() + this.getPageRows() ;
    }        
    /**
     * @see com.harlankuo.hyacinth.wcms.pagination.ViewPage#gotoFirstPage()
     */
    public void gotoFirstPage() {
            this.gotoPage(this.DEFAULT_PAGE_INDEX);
            
    }

    /**
     * @see com.harlankuo.hyacinth.wcms.pagination.ViewPage#gotoLastPage()
     */
    public void gotoLastPage() {
            this.gotoPage(this.getPageCount());
            
    }
    
    /**
     * @see com.harlankuo.hyacinth.wcms.pagination.ViewPage#gotoPreviousPage()
     */
    public void gotoPreviousPage() {
            this.gotoPage(this.getPageIndex() -1);
            
    }        

    /**
     * @see com.harlankuo.hyacinth.wcms.pagination.ViewPage#gotoNextPage()
     */
    public void gotoNextPage() {
            this.gotoPage(this.getPageIndex() + 1);
            
    }

    /**
     * @see com.harlankuo.hyacinth.wcms.pagination.ViewPage#gotoPage(int)
     */
    public void gotoPage(int newPageIndex) {
             if( newPageIndex >= this.DEFAULT_PAGE_INDEX &&  newPageIndex <= this.getPageCount() ) {
                     this.setPageIndex(newPageIndex); 
             }
            
    }
    /**
     * @see com.harlankuo.hyacinth.wcms.pagination.ViewPage#setPageSize(int)
     */
    public void setPageSize(T entity,int size) {
            if(size < 1) {
            	size = 1;
            }
            
            this.pageSize = size;
            
            //进行初始化
            this.doInit(entity);
    }
    
    //-----------------------------------
    //辅助方法
    //-----------------------------------
    
    
    /**
     * 分页初始化方法,为了保证总是能正确的初始化，所以声明为final ,为了让子类可以调用声明为protected
     *
     */
    protected final void doInit(T entity) {
            int rows = 0;
            
            //获得总记录数
            rows= totalRows(entity);
            
            //设置总记录数
            this.setRows(rows);
            //设置新的总页数
            
            //计算并设置总页数
            int pages = calculatePageCount();
            this.setPageCount(pages);
            
            //转到第一页
            this.gotoPage(this.DEFAULT_PAGE_INDEX);
            
            onInit();
    }
    /**
     * 记算总页数
     * @return 总页数
     */
    private int calculatePageCount() {
            
            //总记录数为0条，则返回的总页数为1
            if(this.getRows() == 0) {
                    return this.DEFALT_PAGE_COUNT;
            }
            
            //如果页面大小为-1,则返回的总页数为1
            if(this.DEFAULT_PAGE_SIZE == this.getPageSize() ) {
                    return this.DEFALT_PAGE_COUNT;
            }
            
            return  this.getRows() / this.getPageSize() + ( this.getRows() % this.getPageSize() ==0 ? 0 :1);
    }
    
    
    /**
     * 获得总记录数，调用queryTotalRows(),将异常封装为non-checked 异常
     * @return 总记录数
     * @throws SystemException
     */
    private int totalRows(T entity) throws SystemException{
            try{
                    return queryTotalRows(entity);
            }
            catch(Exception ex){
                    throw new SystemException(ex);
            }
    }
    
    
    //-----------------------------------------
    //子类实现的方法
    //-----------------------------------------
    
    /**
     * 初始化附加方法，由子类扩展
     */
    protected void onInit() {
            
    }
    
    
    /**
     * 查询获得总记录数，由子类具体实现
     * @return 总记录数
     * @throws Exception
     */
     protected abstract int queryTotalRows(T entity) throws Exception;
    
     /**
      * 查询当前页数据,从startRow 开始的rowCount条记录
      * @param startRow  开始记录号
      * @param rowCount  记录总数
      * @return 当前页数据
      * @throws Exception
      */
     protected abstract List<T> queryPageList(T entity, int startRow, int rowCount) throws Exception;
}
