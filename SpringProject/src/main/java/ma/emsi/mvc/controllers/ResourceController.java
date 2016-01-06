package ma.emsi.mvc.controllers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import ma.emsi.mvc.data.entities.Resource;

@Controller
@RequestMapping("/resource")
//@SessionAttributes("resource")
public class ResourceController {

	@RequestMapping("/review")
	public String review(@ModelAttribute Resource resource){
		System.out.println("Invoking reviw()");
		return "resource_review";
	}
	@RequestMapping(value = "/add")
	public String add(Model model) {

		return "resource_add";
	}
	
	
	@RequestMapping(value = "/save")
	public String save(@ModelAttribute Resource resource) {
		System.out.println(resource);
		return "redirect:/resource/add";
	}
	
	@ModelAttribute("resource")
	public Resource getResource(){
		System.out.println("Adding a new resource to the model");
		return new Resource();
	}
	
	@ModelAttribute("typeOptions")
	public List<String> getTypes(){
		return new LinkedList<>(Arrays.asList(new String[] {
				"Material", "Other", "Staff", "Technical Equipment" }));
	}
	
	@ModelAttribute("radioOptions")
	public List<String> getRadios(){
		return new LinkedList<>(Arrays.asList(new String[]{
				"Hours", "Piece", "Tons"	
			}));
	}
}
