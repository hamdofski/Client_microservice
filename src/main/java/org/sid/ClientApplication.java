package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication implements CommandLineRunner {
	@Autowired
	private ClientRepository clientRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		clientRepository.findAll().forEach(c->{
			System.out.println(c.getNomClient());
		});
	}
}
