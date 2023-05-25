package javasession.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javasession.mvc.entities.Student;
import javasession.mvc.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService; 
	
	@RequestMapping("/")
	public ModelAndView studentList(ModelAndView modelAndView) {
		List<Student> studentList = studentService.list();
		modelAndView.addObject("studentList", studentList);
		modelAndView.setViewName("student");
		return modelAndView;	
	}

}
