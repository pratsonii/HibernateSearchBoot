package com.example;

import java.util.List;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@Autowired
	UserSearch search;
	
	@RequestMapping("search")
	public List<UserInfo> search(@QueryParam("q") String q)
	{
		return search.search(q);
	}
}
