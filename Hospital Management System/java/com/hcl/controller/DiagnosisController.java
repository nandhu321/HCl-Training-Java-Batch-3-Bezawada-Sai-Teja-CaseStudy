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

import com.hcl.Service.DiagnosisService;
import com.hcl.Service.PatientService;
import com.hcl.Service.PhysicianService;
import com.hcl.entity.Diagnosis;
import com.hcl.entity.Patient;
import com.hcl.entity.Physician;

@Controller
public class DiagnosisController {
	@Autowired
	private DiagnosisService DiagnosisService;
	@Autowired
	private PatientService patientService;
	@Autowired
	private PhysicianService physicianService;
	@RequestMapping("/saveDiagnosis")
	public String showDiagnosis1(@Valid@ModelAttribute("diagnosisreg") Diagnosis theDiagnosis,BindingResult result,Model m)
	{
		if(result.hasErrors())
		{
			return "processdiagnosis";
		}
		String msg=DiagnosisService.saveDiagnosis(theDiagnosis);
		m.addAttribute("register", msg);
		return "successdiagnosis";
	
	}

	 @GetMapping("/listDiagnosis")
	    public String listDiagnosiss(Model theModel) {
	        List < Diagnosis > theDiagnosiss = DiagnosisService.getDiagnosis();
	        theModel.addAttribute("diagnosis", theDiagnosiss);
	        return "viewdiagnosis";
	    }
	 @GetMapping("/deleteDiagnosis")
	    public String deleteCustomer(@RequestParam("diagnosisId") int theId) {
	       DiagnosisService.deleteDiagnosis(theId);
	        return "redirect:/listDiagnosis";
	    }
	
	 	@GetMapping("/searchrecords")
	    public String so(@RequestParam("id") int tid,Model theModel) throws NullPointerException{
		 	Diagnosis	theDiagnosis = DiagnosisService.getDiagnosis(tid);
		 	if(theDiagnosis==null)
		 	{
		 		theModel.addAttribute("diagnosis", "No Diagnosis Id in the Records");
		 		return "showerrordiagnosis";
		 	}
		 	Patient thePatient =patientService.getPatient(theDiagnosis.getPid());
		 	if(thePatient==null)
		 	{
		 		theModel.addAttribute("patient", "Patient Id has been Deleted");
		 		return "ShowError";
		 	}
		 	Physician thePhysician=physicianService.getPhysician(theDiagnosis.getEid());
		 	if(thePhysician==null)
		 	{
		 		theModel.addAttribute("physician", "Physician Id has been Deleted");
		 		return "showerrorphysician";
		 	}
		 		theModel.addAttribute("diagnosis", theDiagnosis);
		 		theModel.addAttribute("patient", thePatient);
		 		theModel.addAttribute("physician", thePhysician);
		 	
		 	
		 	
	        return "searcheddiagnosis";
	    }

	
	 

}
