package com.jw.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "login.html";
	}

	@RequestMapping("/index")
	public String index() {
		return "index.html";
	}

	@RequestMapping("/shopts")
	public String shopt() {
		return "shopt.html";
	}

	@RequestMapping("/caa")
	public String caa() {
		return "caa.html";
	}

	@RequestMapping("/bsm")
	public String bsm() {
		return "bsm.html";
	}

}
