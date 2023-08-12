package sample.work.model;

import java.util.List;

public class UserDataResponse {
	
	private String page;
	private String per_page;
	private String total;
	private String total_pages;
	private List<User> data;
	private SupportData support;
	
	
	public UserDataResponse() {
	}


	public String getPage() {
		return page;
	}


	public void setPage(String page) {
		this.page = page;
	}


	public String getPer_page() {
		return per_page;
	}


	public void setPer_page(String per_page) {
		this.per_page = per_page;
	}


	public List<User> getData() {
		return data;
	}


	public void setData(List<User> data) {
		this.data = data;
	}


	public SupportData getSupport() {
		return support;
	}


	public void setSupport(SupportData support) {
		this.support = support;
	}


	public String getTotal() {
		return total;
	}


	public void setTotal(String total) {
		this.total = total;
	}


	public String getTotal_pages() {
		return total_pages;
	}


	public void setTotal_pages(String total_pages) {
		this.total_pages = total_pages;
	}
	
	
	
	
	
	
	
	
	

	
	

	

}
