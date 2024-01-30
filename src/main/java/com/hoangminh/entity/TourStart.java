package com.hoangminh.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TourStart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date ngay_khoi_hanh;

	private Long tour_id;


	public void setId(Long id) {
		this.id = id;
	}

	public void setNgay_khoi_hanh(Date ngay_khoi_hanh) {
		this.ngay_khoi_hanh = ngay_khoi_hanh;
	}

	public void setTour_id(Long tour_id) {
		this.tour_id = tour_id;
	}
	
	
}
