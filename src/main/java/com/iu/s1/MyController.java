package com.iu.s1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping(value="/notice/noticeList") /*value주소가 들어오면 메서드실행하세요*/
 public String go(HttpServletRequest request){
		String name=request.getParameter("name");
		System.out.println(name);
	 return "notice/noticeList";       
	 
 }
	
	@RequestMapping(value="/notice/noticeView")
	public String go2(){
		return"notice/noticeView";
	}
	


}

