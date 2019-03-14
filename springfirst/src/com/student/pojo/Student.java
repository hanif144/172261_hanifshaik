package com.student.pojo;

public class Student {
	
	private String name;
	private String agte;
	
	  
	public String getAgte() {
		return agte;
	}
	

	public void setAgte(String agte) {
		this.agte = agte;
	}


	public String getName() {  
	    return name;  
	}  
	  
	public void setName(String name) {  
	    this.name = name;  
	}  
	  
	public void displayInfo(){  
	    System.out.println("Hello: "+name);
	    System.out.println(agte);  
	}  

}
