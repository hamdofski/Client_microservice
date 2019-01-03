package org.sid.web;

import org.sid.dao.ClientRepository;
import org.sid.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@CrossOrigin("*")
public class FactureRestService {
	@Autowired
	private ClientRepository clientRepository;
	@RequestMapping(value="/clients",method=RequestMethod.GET)
	public List<Client> getFactures(){
		return clientRepository.findAll();
		

}
	@RequestMapping(value="/clients/{id}",method=RequestMethod.GET)
	public Client getItem(@PathVariable Long id){
		return clientRepository.findOne(id);
		
}
	@RequestMapping(value="/clients",method=RequestMethod.POST)
	public Client save(@RequestBody Client  c){
		return clientRepository.save(c);
		
}
		

	@RequestMapping(value="/clients/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		clientRepository.delete(id);
		return true;
		
}
	@RequestMapping(value="/clients/{id}",method=RequestMethod.PUT)
	public Client save(@PathVariable Long id,@RequestBody Client c){
		c.setIdClient(id);
		return clientRepository.save(c);
		
}
	
	}
