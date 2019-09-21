package com.leo.service;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.entity.Ticket;
import com.leo.repository.ITicketRepository;

@Service
public class TicketService {
//	@Autowired
	@Resource
	private ITicketRepository ticketRepository;
	
	@Transactional
	public Ticket save(Ticket ticket) {
		return ticketRepository.save(ticket);
	}
	
	@Transactional
	public void delete(long id) {
		ticketRepository.deleteById(id);
	}
	
	public Optional<Ticket> find(long id) {
		return ticketRepository.findById(id);
	}
	
	public List<Ticket> findNameLike1(String name) {
		return ticketRepository.findNameLike1(name);
	}
	
	public List<Ticket> findNameLike2(String name) {
		return ticketRepository.findNameLike2(name);
	}
	public List<Ticket> findNameLike3(String name) {
		return ticketRepository.findNameLike3(name);
	}
	public List<Ticket> findNameLike4(String name) {
		return ticketRepository.findNameLike4(name);
	}
	public List<Ticket> findNameLike5(String name) {
		return ticketRepository.findNameLike5(name);
	}
}
