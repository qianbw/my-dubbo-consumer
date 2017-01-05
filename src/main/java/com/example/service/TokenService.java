package com.example.service;

public interface TokenService {

	public void refreshAccessToken();

	public String getSign();
}
