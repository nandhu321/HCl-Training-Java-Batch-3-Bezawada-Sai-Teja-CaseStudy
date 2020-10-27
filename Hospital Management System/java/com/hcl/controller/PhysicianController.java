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

import com.hcl.Service.PhysicianService;
import com.hcl.entity.Physician;
@Controller
public class PhysicianController {

	@Autowired
	private PhysicianService physicianService;
	@RequestMapping("/savephysician")
	public String showPhysician1(@Valid@ModelAttribute("physicianreg") Physician thephysician,BindingResult result,Model m)
	{
		if(result.hasErrors())
		{
			return "processphysician";
		}
		else
		{
		String msg=physicianService.savePhysician(thephysician);
		m.addAttribute("register", msg);
		return "successphysician";
	}
	}
	
	@GetMapping("/listphysicians")
    public String listPhysicians(Model theModel) {
        List < Physician > thePhysicians = physicianService.getPhysicians();
        theModel.addAttribute("physicians", thePhysicians);
        return "viewphysicians";
    }
 @GetMapping("/deletephysician")
    public String deleteCustomer(@RequestParam("physicianId") int theId) {
       physicianService.deletePhysician(theId);
        return "redirect:/listphysicians";
    }
 @GetMapping("/searchedphysician")
 public String showFormForUpdate(@RequestParam("insurancePlan") String theId,
     Model theModel) {
	 	List<Physician>	thePhysician = physicianService.getPhysicians(theId);
	 	if(thePhysician!=null)
	 		theModel.addAttribute("physician", thePhysician);
	 	else
	 		theModel.addAttribute("physician","No Physicians with insurance");
        
     return "searchedphysician";
 }
 @GetMapping("/searchedphysicianstate")
 public String showFormForUpdate1(@RequestParam("state") String theId,
     Model theModel) {
	 	List<Physician>	thePhysician = physicianService.getPhysicians(theId);
	 	if(thePhysician!=null)
	 		theModel.addAttribute("physician", thePhysician);
	 	else
	 		theModel.addAttribute("physician","No Physicians with in this state");
     return "searchedphysician";
 }
 @GetMapping("/searchedphysiciandepartment")
 public String showFormForUpdate2(@RequestParam("department") String theId,
     Model theModel) {
	 	List<Physician>	thePhysician = physicianService.getPhysicians(theId);
	 	if(thePhysician!=null)
	 		theModel.addAttribute("physician", thePhysician);
	 	else
	 		theModel.addAttribute("physician","No Physicians with this department");
     return "searchedphysician";
 }
 
}
