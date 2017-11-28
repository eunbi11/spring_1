package com.iu.control;

import java.awt.Checkbox;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iu.qna.QnaDTO;

@Controller
@RequestMapping(value="/qna/*")
public class QnaController {
	
	
	
	
	@RequestMapping(value="qnaWrite",method=RequestMethod.GET)
	public void write(){} 
	
	@RequestMapping(value="qnaWrite", method=RequestMethod.POST)
	public String write(QnaDTO qnaDTO,String title ){ /*파라미터 이름과 동일해야함*/
		System.out.println("title : "+qnaDTO.getTitle());
		System.out.println(title);
		System.out.println("writer : "+qnaDTO.getWriter());
		System.out.println("age : "+qnaDTO.getAge());
		
		for(String s : qnaDTO.getName()){
		System.out.println("checkBox value : "+s);
		}
		return "redirect: ./qnaList?curPage=5";
	}
	

	

	

/*	@RequestMapping(value="qnaWrite", method=RequestMethod.POST)
	public String write(HttpServletRequest request){
		String title=request.getParameter("title");
		int age=Integer.parseInt(request.getParameter("age"));
		System.out.println("title : "+title);
		System.out.println("age : "+age);
		return "qna/qnaList";
	}*/ 
	
	
	
	/*@RequestMapping(value="/qna/qnaWrite")
	public String write(){
		return "qna/qnaWrite";
	}*/
	
	@RequestMapping(value="qnaList" ,method={RequestMethod.GET, RequestMethod.POST}) /*두가지 다 쓰고싶을때*/
	public ModelAndView list(ModelAndView mv, @RequestParam(defaultValue="0" ,required=false)int curPage){
		QnaDTO qnaDTO=new QnaDTO();
		qnaDTO.setTitle("test");
		qnaDTO.setWriter("choa");
		qnaDTO.setAge(25);
		mv.addObject("view", qnaDTO);
		mv.setViewName("qna/qnaList");
		System.out.println("curPage : "+curPage);
		
		return mv;
	}
	
	@RequestMapping(value="qnaList" ,method={RequestMethod.GET, RequestMethod.POST}) /*두가지 다 쓰고싶을때*/
	public ModelAndView list1(ModelAndView mv, @RequestParam(defaultValue="0" ,required=false)int curPage){
	
		System.out.println("curPage : "+curPage);
		
		return mv;
	}
	
	@RequestMapping(value="qnaView")
	public String view(Model model){
		/*Model->클라이언트쪽으로 데이터를 전달하기위한 객체  HttpServletRequest request 비슷한 뜻*/
		QnaDTO qnaDTO=new QnaDTO();
		qnaDTO.setTitle("test");
		qnaDTO.setWriter("choa");
		qnaDTO.setAge(25);
		model.addAttribute("view",qnaDTO)
	         .addAttribute("board", "qna");
		return "qna/qnaView";
	}
	
	

}
