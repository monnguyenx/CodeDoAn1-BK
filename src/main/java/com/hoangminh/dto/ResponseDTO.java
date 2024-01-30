package com.hoangminh.dto;

import com.hoangminh.enumtype.USER_ROLE;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
	public String message;
	public Object data;

//	public ResponseDTO(String message, Object data) {
//		this.message = message;
//		this.data = data;
//	}

	public String getMessage() {
		return message;
	}

	public Object getData() {
		return data;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}
