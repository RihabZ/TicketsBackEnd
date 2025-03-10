package com.rihab.interventions.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rihab.interventions.entities.Ticket;
import com.rihab.interventions.repos.TicketRepository;
@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	TicketRepository ticketRepository;



@Override
public Ticket saveTicket(Ticket inter)
{
return ticketRepository.save(inter);

}

@Override
public Ticket updateTicket(Ticket inter) {
return ticketRepository.save(inter);
}


@Override
public void deleteTicket(Ticket inter) {
	ticketRepository.delete(inter);
}


@Override
public void deleteTicketByCode(String code) {
	ticketRepository.deleteById(code);
}


@Override
public Ticket getTicket(String code) {
return ticketRepository.findById(code).get();
}


@Override
public List<Ticket> getAllTickets() {
return ticketRepository.findAll();
}



@Override
public List<Ticket> findByInterDesignation(String desing)
{
return ticketRepository.findByInterDesignation(desing);
}
@Override
public List<Ticket> findByInterDesignationContains(String desing)
{
return ticketRepository.findByInterDesignationContains(desing);
}




@Override
public List<Ticket> findByEquipementEqptCode(String eqptCode)
{
return ticketRepository.findByEquipementEqptCode( eqptCode);}


@Override
public List<Ticket> findByInterventionNatureCode(String code)
{
return ticketRepository.findByInterventionNatureCode( code);

}

@Override
public List<Ticket>findByInterventionTypeCodeType(String code){
return ticketRepository.findByInterventionTypeCodeType( code);

}

}
