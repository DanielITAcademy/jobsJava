package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	private String description;
	
	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		this.description = description;
		//TODO
	}
	
	
	@Override
	public void pay() {
		//TODO
		
		
	}


	@Override
	public String toString() {
		return "Volunteer [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", description="
				+ description + "]";
	}


	

}
