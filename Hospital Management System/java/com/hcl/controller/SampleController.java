package com.hcl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.Service.AdminService;
import com.hcl.entity.Admin;
import com.hcl.entity.Diagnosis;
import com.hcl.entity.Patient;
import com.hcl.entity.Physician;

@Controller
@PropertySource("classpath:admin.properties")
public class SampleController {
	@Autowired
	private Environment environment;
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/")
	public String showHome()
	{
		return "AdminLogin";
	}
	@RequestMapping("/register")
	public String showHome5(@ModelAttribute("admin") Admin theAdmin)
	{
		return "register";
	}
	@RequestMapping("/registration")
	public String registered(@Valid@ModelAttribute("admin") Admin theAdmin,BindingResult result,@RequestParam("password") String pass,@RequestParam("repass") String pass1,Model m)
	{
		if(result.hasErrors())
		{
			return "register";
		}
		if(pass.equals(pass1))
		{
			
			
			String msg=adminService.saveAdmin(theAdmin);
			m.addAttribute("msg", msg);
			return "successregister";
		}else
		{
			m.addAttribute("msg", "Mismatch of Password");
			return "register";
		}
	}
	@RequestMapping("/logout")
	public String showHome2(HttpServletRequest request)
	{
		 HttpSession ses=request.getSession(false);  
         ses.invalidate();  
		return "AdminLogin";
	}
	@GetMapping("/profile")
	public String showprofile()
	{
		return "adminoperations";
	}
	@PostMapping("/loginvalid")
	public String insideHome(HttpServletRequest request,@RequestParam("username") String user ,@RequestParam("password") String pass,Model m)
	{
		Admin theAdmin=adminService.getAdmins(user, pass);
		if(theAdmin!=null)
		{
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			return "adminoperations";
		}
		else
			m.addAttribute("msg", "Invalid details");
			return "AdminLogin";
	}
	@RequestMapping("/patient")
	public String patientOperation()
	{
		
		return "patientoperation";
		
	}
	@RequestMapping("/physician")
	public String physicianOperation()
	{
		
		return "physicianoperation";
		
	}
	@RequestMapping("/diagnosis")
	public String diagnosisOperation()
	{
		
		return "diagnosisoperation";
		
	}
	@RequestMapping("/processdiagnosis")
	public String diagnosisOperation1(@ModelAttribute("diagnosisreg") Diagnosis thediagnosis)
	{
		
		return "processdiagnosis";
		
	}
	

	@RequestMapping("/formpatient")
	public String showPatient(@ModelAttribute("patientreg") Patient thepatient)
	{
		
		return "processpatient";
	}
	@RequestMapping("/search")
	public String searchPatients(@ModelAttribute("patientreg") Patient thepatient)
	{
		
		return "patientsearch";
	}
	@RequestMapping("/searchdiagnosis")
	public String searchdiagnosis()
	{
		
		return "diagnosisearch";
	}
	@RequestMapping("/searchphysician")
	public String searchPhysicians(@ModelAttribute("physicianreg") Physician thephysician)
	{
		
		return "physiciansearch";
	}
	@RequestMapping("/formphysician")
	public String showPhysician(@ModelAttribute("physicianreg") Physician thephysician)
	{
		
		return "processphysician";
	}
	
}
