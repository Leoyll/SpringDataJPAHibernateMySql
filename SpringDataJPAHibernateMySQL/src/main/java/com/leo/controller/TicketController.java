package com.leo.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leo.entity.Ticket;
import com.leo.service.TicketService;

@RestController
public class TicketController {
//	@Autowired
	@Resource
	private TicketService ticketService;

	//ex: http://localhost:8080/save?name=movie2&price=15
	//ex: http://localhost:8080/save?name=movie4%20on%20Aug&price=15	"%20" means one space	
	@RequestMapping("/save")
	public Ticket save(@RequestParam("name") String name, @RequestParam("price") Double price) {
		Ticket ticket = new Ticket();
		ticket.setTicket_activity_name(name);
		ticket.setPrice(price);
		
		return ticketService.save(ticket);
	}
	
	//ex: http://localhost:8080/delById?id=1
	@RequestMapping("/delById")		
	public String del(@RequestParam("id") Long id) {
		ticketService.delete(id.intValue());
		return "del ok";
	}
	
	//ex: http://localhost:8080/findById?id=1
	@RequestMapping("/findById")	
	public Optional<Ticket> find(@RequestParam("id") Long id) {
		return ticketService.find(id.intValue());
	}
	
	@RequestMapping("/findNameLike1")	
	public List<Ticket> find1(@RequestParam("name") String name) {
		return ticketService.findNameLike1(name);
	}
	@RequestMapping("/findNameLike2")	
	public List<Ticket> find2(@RequestParam("name") String name) {
		return ticketService.findNameLike2(name);
	}
	@RequestMapping("/findNameLike3")	
	public List<Ticket> find3(@RequestParam("name") String name) {
		return ticketService.findNameLike3(name);
	}
	@RequestMapping("/findNameLike4")	
	public List<Ticket> find4(@RequestParam("name") String name) {
		return ticketService.findNameLike4(name);
	}
	@RequestMapping("/findNameLike5")	
	public List<Ticket> find5(@RequestParam("name") String name) {
		return ticketService.findNameLike5(name);
	}
}
