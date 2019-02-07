package com.objectfrontier.land;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping(value = "/demo")
	public String demoMethod() {
		DemoService ds = new DemoService();
		return ds.readDemo();
	}		

	@GetMapping(value ="/person")
	public String readAllPerson() throws Exception {
		
		return "Hi";
	}

}
