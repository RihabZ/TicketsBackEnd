package com.rihab.interventions.restControllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rihab.interventions.entities.Ticket;

import com.rihab.interventions.service.TicketService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TicketRESTController {

	@Autowired
	TicketService ticketService;

@RequestMapping(path="allInterventions",method = RequestMethod.GET)
public List<Ticket> getAllTickets() {
	return ticketService.getAllTickets();
}


@RequestMapping(value="/getByCode/{interCode}",method = RequestMethod.GET)
public Ticket getTicketionById(@PathVariable("interCode") String interCode) {
	return ticketService.getTicket(interCode);
 }

//autorisation au admin seulement cette methode
@RequestMapping(path="/addInter",method = RequestMethod.POST)

public Ticket createTicket(@RequestBody Ticket ticket) {
	return ticketService.saveTicket(ticket);
}


@RequestMapping(path="/updateInter",method = RequestMethod.PUT)

public Ticket updateTicket(@RequestBody Ticket ticket) {
		return ticketService.updateTicket(ticket);
}


@RequestMapping(value="/deleteInter/{interCode}",method = RequestMethod.DELETE)

public void deleteTicket(@PathVariable("interCode") String interCode)
{
	ticketService.deleteTicketByCode(interCode);
}


@RequestMapping(value="/intersEqpt/{eqptCode}",method = RequestMethod.GET)
public List<Ticket> getTicketsByEquipementCodeEquipement(@PathVariable("eqptCode") String eqptCode) {
		return ticketService.findByEquipementEqptCode(eqptCode);
}


@RequestMapping(value="/searchByDesignation/{eqptDesignation}",method = RequestMethod.GET)
 public List<Ticket>getTicketByDesignation(@PathVariable("interDesignation") String interDesignation) {
    return ticketService.findByInterDesignation(interDesignation);
}


@RequestMapping(value="/searchByDesignationContains/{interDesignation}",method = RequestMethod.GET)
public List<Ticket> getTicketByInterDesignationContains(@PathVariable("interDesignation") String interDesignation) {
    return ticketService.findByInterDesignationContains(interDesignation);
}


@RequestMapping(value="/interNature/{code}",method = RequestMethod.GET)
public List<Ticket> getTicketsByInterventionNatureCode(@PathVariable("code") String code) {
		return ticketService.findByInterventionNatureCode(code);
}



@RequestMapping(value="/interType/{codeType}",method = RequestMethod.GET)
public List<Ticket> getTicketsByInterventionTypeCodeType(@PathVariable("codeType") String codeType) {
		return ticketService.findByInterventionTypeCodeType(codeType);
}


}