package com.hcl.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.Service.PatientService;
import com.hcl.entity.Patient;

@Controller

public class PatientController {
	@Autowired
	private PatientService patientService;
	@RequestMapping("/savep")
	public String showPatient1(@Valid @ModelAttribute("patientreg") Patient thepatient,BindingResult result,Model m)
	{
		if(result.hasErrors())
		{
			return "processpatient";
		}
		
		String msg=patientService.savePatient(thepatient);
		m.addAttribute("register", msg);
		
		return "success";
	}

	 @GetMapping("/listpatients")
	    public String listPatients(Model theModel) {
	        List < Patient > thePatients = patientService.getPatients();
	        theModel.addAttribute("patients", thePatients);
	        return "viewpatients";
	    }
	 @GetMapping("/deletepatient")
	    public String deleteCustomer(@RequestParam("patientId") int theId) {
	       patientService.deletePatient(theId);
	        return "redirect:/listpatients";
	    }
	 @GetMapping("/searchpatient")
	    public String showFormForUpdate(@RequestParam("id") int theId,
	        Model theModel) {
		 	Patient	thePatient = patientService.getPatient(theId);
		 	if(thePatient!=null)
		 		theModel.addAttribute("pa", thePatient);
		 	else
		 		theModel.addAttribute("pa","No Patients with this Id");
	        return "searchedpatient";
	    }

}
