package com.hoangminh.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hoangminh.enumtype.USER_ROLE;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String username;
	
	private String ho_ten;
	
	@JsonIgnore
	private String password;
	
	private String gioi_tinh;
	
	private String sdt;
	
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

	public String getPassword() {
		return password;
	}

	public String getGioi_tinh() {
		return gioi_tinh;
	}

	public String getSdt() {
		return sdt;
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

	public void setPassword(String password) {
		this.password = password;
	}

	public void setGioi_tinh(String gioi_tinh) {
		this.gioi_tinh = gioi_tinh;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
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
