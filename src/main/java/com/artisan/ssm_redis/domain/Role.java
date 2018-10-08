package com.artisan.ssm_redis.domain;

import java.io.Serializable;

public class Role implements Serializable {

	
	private static final long serialVersionUID = -4381384997344901377L;

	private Long id;
	private String roleName;
	private String note;

	/**** setter and getter ****/
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", note=" + note + "]";
	}

}