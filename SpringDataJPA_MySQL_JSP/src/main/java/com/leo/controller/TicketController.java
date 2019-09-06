package com.leo.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.leo.entity.Ticket;
import com.leo.service.TicketService;

@Controller

@RequestMapping(value="/ticket")
public class TicketController {
//	@Autowired
	@Resource
	private TicketService ticketService;	

	/**
	 * query all tickets and manage tickets
	 * @return
	 */	
	@RequestMapping(value="/list")
	public ModelAndView list() {
		ModelAndView model = new ModelAndView ();
		model.addObject("ticketList1",ticketService.findAll());
		model.setViewName("ticketList");
		return model;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String save(Ticket ticket) {
		ticketService.save(ticket);
		return "forward:/ticket/list";
	}

	@GetMapping(value="/preUpdate/{number}")
	public ModelAndView preUpdate(@PathVariable("number") Long number) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("ticket1", ticketService.find(number.longValue()));
		mav.setViewName("ticketUpdate");
		return mav;
	}	
    
	//ex: http://localhost:8080/delByNumber?number=1
	@RequestMapping("/delByNumber")		
	public String del(@RequestParam("number") Long number) {
		ticketService.delete(number.intValue());
		return "forward:/ticket/list";
	}


}
