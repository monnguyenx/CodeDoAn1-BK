package com.hoangminh.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToutStartAddDTO {
    private String ngay_khoi_hanh;

	public String getNgay_khoi_hanh() {
		return ngay_khoi_hanh;
	}

	public void setNgay_khoi_hanh(String ngay_khoi_hanh) {
		this.ngay_khoi_hanh = ngay_khoi_hanh;
	}
    
    
}
