package com.eas.util;
import java.util.List;
import org.springframework.stereotype.Component;
@Component("pagebean")
public class PageBean<T> {
	private int currentPage;//当前页码
	private int totaPage;//总页数
	private int totalRecord;//总记录数
	private int pageSize;//每页记录数
	
	private List<T> list;
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotaPage() {
		return totaPage;
	}
	public void setTotaPage(int totaPage) {
		this.totaPage = totaPage;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<T> getList() {  
        return list;  
    }  
    public void setList(List<T> list) {  
        this.list = list;  
    }
	
	/**
     * 计算当前页起始记录
     * @param pageSize 每页记录数
     * @param currentPage 当前第几页
     * @return
     */
    public static Integer countOffset(int pageSize,int currentPage){
        Integer offset = pageSize*(currentPage-1);
        return offset;
    }
}
