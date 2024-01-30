package com.hoangminh.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Entity
@Table(name = "tour")
public class Tour {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String ten_tour;
	
	private String gioi_thieu_tour;
	
	private Integer so_ngay;
	
	private String noi_dung_tour;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date ngay_khoi_hanh;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date ngay_ket_thuc;
	
	private String diem_den;
	
	private Integer loai_tour;
	
	private String anh_tour;
	
	private String diem_khoi_hanh;
	
	private Integer trang_thai;
	
	private Long gia_tour;

	public void setId(Long id) {
		this.id = id;
	}

	public void setTen_tour(String ten_tour) {
		this.ten_tour = ten_tour;
	}

	public void setGioi_thieu_tour(String gioi_thieu_tour) {
		this.gioi_thieu_tour = gioi_thieu_tour;
	}

	public void setSo_ngay(Integer so_ngay) {
		this.so_ngay = so_ngay;
	}

	public void setNoi_dung_tour(String noi_dung_tour) {
		this.noi_dung_tour = noi_dung_tour;
	}

	public void setNgay_khoi_hanh(Date ngay_khoi_hanh) {
		this.ngay_khoi_hanh = ngay_khoi_hanh;
	}

	public void setNgay_ket_thuc(Date ngay_ket_thuc) {
		this.ngay_ket_thuc = ngay_ket_thuc;
	}

	public void setDiem_den(String diem_den) {
		this.diem_den = diem_den;
	}

	public void setLoai_tour(Integer loai_tour) {
		this.loai_tour = loai_tour;
	}

	public void setAnh_tour(String anh_tour) {
		this.anh_tour = anh_tour;
	}

	public void setDiem_khoi_hanh(String diem_khoi_hanh) {
		this.diem_khoi_hanh = diem_khoi_hanh;
	}

	public void setTrang_thai(Integer trang_thai) {
		this.trang_thai = trang_thai;
	}

	public void setGia_tour(Long gia_tour) {
		this.gia_tour = gia_tour;
	}
	
	
}
