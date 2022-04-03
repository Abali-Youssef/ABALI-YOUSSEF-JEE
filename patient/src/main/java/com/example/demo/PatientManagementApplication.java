package com.example.demo;

import com.example.demo.entities.Patient;
import com.example.demo.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientManagementApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner (PatientRepository patientRepository){
		return args -> {
			patientRepository.save(
					new Patient(  null,  "Hassan", new Date(),  false,  11));
			patientRepository.save(
					new Patient( null,  "Mohammed", new Date (),  true,  12));
			patientRepository.save(
					new Patient(  null,  "Yasmine", new Date(),  false,  13));
			patientRepository.save(
					new Patient( null,  "Hassnae", new Date(),  true, 19));
		};
	}
}
