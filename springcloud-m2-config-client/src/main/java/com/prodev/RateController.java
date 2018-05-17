package com.prodev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RateController {

	@Value("${rates}")
	String rates;

	@Value("${lanecount}")
	String laneCount;
	
	@Value("${tollstart}")
	String tollStart;
	
	@RequestMapping("/rate")
	public String getRate(Model m) {
		m.addAttribute("rateamount",rates);
		m.addAttribute("lanes",laneCount);
		m.addAttribute("tollstart",tollStart);
		
		return "rateview";
	}
}
