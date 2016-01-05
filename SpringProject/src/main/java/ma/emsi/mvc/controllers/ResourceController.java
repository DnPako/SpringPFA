package ma.emsi.mvc.controllers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.emsi.mvc.data.entities.Resource;

@Controller
@RequestMapping("/resource")
public class ResourceController {

	@RequestMapping(value = "/add")
	public String add(Model model) {

		List<String> options = new LinkedList<>(Arrays.asList(new String[]{
				"Material","Other","Staff","Technical Equipement"
		}));
		List<String> radios = new LinkedList<>(Arrays.asList(new String[]{
				"Hours","Piece","Tons"
		}));
	
		model.addAttribute("radioOptions", radios);
		model.addAttribute("TypeOptions", options);
		model.addAttribute("resource", new Resource());
		return "resource_add";
	}

	@RequestMapping(value = "/save")
	public String save(@ModelAttribute Resource resource) {
		System.out.println(resource);
		return "redirect:/resource/add";
	}
}
