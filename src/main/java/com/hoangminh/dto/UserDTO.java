package com.hoangminh.dto;

import com.hoangminh.enumtype.USER_ROLE;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

	private Long id;
	
	private String username;
	
	private String ho_ten;
	
	private String sdt;
	
	private String gioi_tinh;
	
	private String email;
	
	private String dia_chi;

	private Integer role;

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getHo_ten() {
		return ho_ten;
	}

	public String getSdt() {
		return sdt;
	}

	public String getGioi_tinh() {
		return gioi_tinh;
	}

	public String getEmail() {
		return email;
	}

	public String getDia_chi() {
		return dia_chi;
	}

	public Integer getRole() {
		return role;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setHo_ten(String ho_ten) {
		this.ho_ten = ho_ten;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public void setGioi_tinh(String gioi_tinh) {
		this.gioi_tinh = gioi_tinh;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDia_chi(String dia_chi) {
		this.dia_chi = dia_chi;
	}

	public void setRole(Integer role) {
		this.role = role;
	}
	
	
}
