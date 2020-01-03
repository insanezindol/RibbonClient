package kr.co.lunasoft.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@GetMapping(value = "/get-map-data")
	public Map<String, Object> getMapData() {
		Map<String, Object> obj = new HashMap<String, Object>();
		obj.put("code", "100200");
		obj.put("msg", "success");
		obj.put("data", "this is ribbon client. 12345");
		return obj;
	}
	
	@GetMapping(value = "/test")
	public Map<String, Object> test() {
		Map<String, Object> obj = new HashMap<String, Object>();
		obj.put("code", "100200");
		obj.put("msg", "success");
		obj.put("data", "this is ribbon client. 67890");
		return obj;
	}

}
