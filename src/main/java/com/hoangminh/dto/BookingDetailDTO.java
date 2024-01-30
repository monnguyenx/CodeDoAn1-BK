package com.hoangminh.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.Date;

@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDetailDTO {

    private Long id;

    private Long user_id;

    private String ho_ten;

    private String sdt;

    private Long tour_id;

    private String ten_tour;

    private Integer so_luong_nguoi;

    private Date ngay_khoi_hanh;

    private Long tong_tien;

    private Integer trang_thai;

    private Integer pt_thanh_toan;

    private String ghi_chu;

    private Date booking_at;

	public void setId(Long id) {
		this.id = id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public void setHo_ten(String ho_ten) {
		this.ho_ten = ho_ten;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public void setTour_id(Long tour_id) {
		this.tour_id = tour_id;
	}

	public void setTen_tour(String ten_tour) {
		this.ten_tour = ten_tour;
	}

	public void setSo_luong_nguoi(Integer so_luong_nguoi) {
		this.so_luong_nguoi = so_luong_nguoi;
	}

	public void setNgay_khoi_hanh(Date ngay_khoi_hanh) {
		this.ngay_khoi_hanh = ngay_khoi_hanh;
	}

	public void setTong_tien(Long tong_tien) {
		this.tong_tien = tong_tien;
	}

	public void setTrang_thai(Integer trang_thai) {
		this.trang_thai = trang_thai;
	}

	public void setPt_thanh_toan(Integer pt_thanh_toan) {
		this.pt_thanh_toan = pt_thanh_toan;
	}

	public void setGhi_chu(String ghi_chu) {
		this.ghi_chu = ghi_chu;
	}

	public void setBooking_at(Date booking_at) {
		this.booking_at = booking_at;
	}
    
    
}