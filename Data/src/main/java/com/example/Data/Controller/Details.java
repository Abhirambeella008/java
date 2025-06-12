package com.example.Data.Controller;

public class Details {
	
	private String stdname;
	private int stdid;
	private String branch;
	public Details(String stdname, int stdid, String branch) {
		super();
		this.stdname = stdname;
		this.stdid = stdid;
		this.branch = branch;
	}
	 public String getStdname() {
	        return stdname;
	    }

	    public int getStdid() {
	        return stdid;
	    }

	    public String getBranch() {
	        return branch;
	    }

}
