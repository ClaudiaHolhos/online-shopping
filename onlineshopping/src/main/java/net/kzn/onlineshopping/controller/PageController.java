package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		//inainte dadeam un string de aici pentru a ne afisa pe pagina
		//page=logical name, not phisical
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Welcome to Spring Web MVC");
		return mv;

	}
	//pentru sufletul nostru il lasam
	/*@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam("greeting")String greeting) {
		//aici ii poti atribui un string lui greeting
		//test?greeting=...
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
		
	}*/
	
	/*@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="greeting", required=false)String greeting) {
		//aici ii poti atribui un string lui greeting
		//test?greeting=...
		if(greeting == null) {
			greeting = "Hello there";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
		
	}
	 */
	//creare link. ex:.../test/hi
	@RequestMapping(value="/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting")String greeting) {
		//aici ii poti atribui un string lui greeting
		//test?greeting=...
		if(greeting == null) {
			greeting = "Hello there";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
		
	}
	
}
