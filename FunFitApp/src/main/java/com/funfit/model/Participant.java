package com.funfit.model;

public class Participant {
 private int pid;
 private String pname;
 private int age;
 private int bid;
 
 
 public Participant() {
	super();
}

public Participant(int pid, String pname, int age, int bid) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.age = age;
	this.bid = bid;
}
 
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}

@Override
public String toString() {
	return "Participant [pid=" + pid + ", pname=" + pname + ", age=" + age + ", , bid=" + bid
			+ "]";
}

}
