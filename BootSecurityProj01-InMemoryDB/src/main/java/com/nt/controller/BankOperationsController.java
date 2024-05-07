package com.nt.controller;

import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankOperationsController {

	@GetMapping("/")
	public String showHome()
	{
		return "home";
	}
	
	@GetMapping("/offers")
	public String showOffers()
	{
		return "offers";
	}
	
	@GetMapping("/lone_approve")
	public String approve(Map<String,Object> map)
	{
		int amount=new Random().nextInt(2000000);
		map.put("ApprovedAmount", amount);
		return "lone";
	}
	
	@GetMapping("/show_blance")
	public String balance(Map<String,Object> map)
	{
		int amount=new Random().nextInt(200000);
		map.put("balance", amount);
		return "balance";
	}
	
	@GetMapping("/denied")
	public String accessDeniedPage()
	{
		return "denied";
	}
}
