package com.example.secureApp.demo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Washermen")
public class WashermanPojo {
String supervisorname;
String washermanname;

public String getSupervisorname() {
	return supervisorname;
}
public void setSupervisorname(String supervisorname) {
	this.supervisorname = supervisorname;
}
public String getWashermanname() {
	return washermanname;
}
public void setWashermanname(String washermanname) {
	this.washermanname = washermanname;
}

public WashermanPojo(String supervisorname, String washermanname) {
	super();
	this.supervisorname = supervisorname;
	this.washermanname = washermanname;
}
public WashermanPojo() {
	super();
}
@Override
public String toString() {
	return "WashermanPojo [supervisorname=" + supervisorname + ", washermanname=" + washermanname + "]";
}

}
