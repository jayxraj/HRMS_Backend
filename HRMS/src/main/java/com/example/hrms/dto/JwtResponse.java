package com.example.hrms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtResponse {
    public JwtResponse(String token2) {
		// TODO Auto-generated constructor stub
	}

	private String token;
}
