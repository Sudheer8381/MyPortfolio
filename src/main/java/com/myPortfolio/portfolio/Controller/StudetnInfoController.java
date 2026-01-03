package com.myPortfolio.portfolio.Controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myPortfolio.portfolio.Model.StudentInfo;
import com.myPortfolio.portfolio.Repository.StudentInfoRepository;

@Controller
public class StudetnInfoController {

	@Autowired
	private StudentInfoRepository studentInfoRepo;
	
	

	@GetMapping("/AddInfo")
	public String ShowAddEmployee(Model model)
	{
		StudentInfo empdto = new StudentInfo();
		model.addAttribute("empDto", empdto);
		return "addInfo";
	}
	
	
	
	@PostMapping("/addInfo")
	public String addInfo(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("message") String message, RedirectAttributes attributes)
	{
		try {
			
			StudentInfo info = new StudentInfo();
			
			info.setEmail(name);
			info.setStudentMsg(email);
			info.setStudentName(message);
			
			studentInfoRepo.save(info);
			attributes.addFlashAttribute("msg", "Information Successfully Send.");
			
			return "redirect:/";
			
		} catch (Exception e) {
			attributes.addFlashAttribute("msg", e.getMessage());
			return "redirect:/";
		}
	}
}
