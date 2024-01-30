package com.hoangminh.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private Long user_id;
    
    private Long tour_id;
    
    private Integer so_luong_nguoi;
    
    private Date ngay_khoi_hanh;
    
    private Long tong_tien;
    
    private Integer trang_thai;
	
    private Date booking_at;

    private Integer pt_thanh_toan;

    private String ghi_chu;

    @PrePersist
    public void onCreate() {
    	this.booking_at = new Date();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getTour_id() {
		return tour_id;
	}

	public void setTour_id(Long tour_id) {
		this.tour_id = tour_id;
	}

	public Integer getSo_luong_nguoi() {
		return so_luong_nguoi;
	}

	public void setSo_luong_nguoi(Integer so_luong_nguoi) {
		this.so_luong_nguoi = so_luong_nguoi;
	}

	public Date getNgay_khoi_hanh() {
		return ngay_khoi_hanh;
	}

	public void setNgay_khoi_hanh(Date ngay_khoi_hanh) {
		this.ngay_khoi_hanh = ngay_khoi_hanh;
	}

	public Long getTong_tien() {
		return tong_tien;
	}

	public void setTong_tien(Long tong_tien) {
		this.tong_tien = tong_tien;
	}

	public Integer getTrang_thai() {
		return trang_thai;
	}

	public void setTrang_thai(Integer trang_thai) {
		this.trang_thai = trang_thai;
	}

	public Date getBooking_at() {
		return booking_at;
	}

	public void setBooking_at(Date booking_at) {
		this.booking_at = booking_at;
	}

	public Integer getPt_thanh_toan() {
		return pt_thanh_toan;
	}

	public void setPt_thanh_toan(Integer pt_thanh_toan) {
		this.pt_thanh_toan = pt_thanh_toan;
	}

	public String getGhi_chu() {
		return ghi_chu;
	}

	public void setGhi_chu(String ghi_chu) {
		this.ghi_chu = ghi_chu;
	}
    
    
    
}
