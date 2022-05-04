package com.projet.etudiant;

import com.projet.etudiant.entities.Etudiant;
import com.projet.etudiant.entities.Genre;
import com.projet.etudiant.repositories.EtudiantRepository;
import com.projet.etudiant.security.SecurityService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class EtudiantApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtudiantApplication.class, args);
	}
	//@Bean
	CommandLineRunner commandLineRunner (EtudiantRepository patientRepository){
		return args -> {
			patientRepository.save(
					new Etudiant(  null,  "Hassan","Hass", new Date(),  false, Genre.MASCULIN));
			patientRepository.save(
					new Etudiant(  null,  "alii","Haaaa", new Date(),  false, Genre.MASCULIN));
			patientRepository.save(
					new Etudiant(  null,  "ahmed","ahmd", new Date(),  false, Genre.MASCULIN));
			patientRepository.save(
					new Etudiant(  null,  "akram","akram", new Date(),  false, Genre.MASCULIN));
			patientRepository.save(
					new Etudiant(  null,  "souad","soud", new Date(),  false, Genre.FEMININ));
		};

	}
	@Bean
	CommandLineRunner commandLineRunner (SecurityService securityService){

		return args -> {
			/*securityService.saveNewUser(  "mohamed",  "1234",  "1234");
			securityService.saveNewUser(  "yasmine",  "1234",  "1234");
			securityService.saveNewRole(  "USER",  "");
			securityService.saveNewRole(  "ADMIN",  "");*/
			securityService.addRoleToUser("mohamed","USER");
			securityService.addRoleToUser("yasmine","USER");
			securityService.addRoleToUser("mohamed","ADMIN");
		};
	}
}
