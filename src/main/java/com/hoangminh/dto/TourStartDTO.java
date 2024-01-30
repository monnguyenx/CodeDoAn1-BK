package com.hoangminh.dto;

import java.util.Date;

import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TourStartDTO {
	private Long id;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date ngay_khoi_hanh;


	public void setId(Long id) {
		this.id = id;
	}

	public void setNgay_khoi_hanh(Date ngay_khoi_hanh) {
		this.ngay_khoi_hanh = ngay_khoi_hanh;
	}
	
	
}
