package com.projet.cabinet;

import com.projet.cabinet.entities.*;
import com.projet.cabinet.repositories.ConsultationRepository;
import com.projet.cabinet.repositories.MedecinRepository;
import com.projet.cabinet.repositories.PatientRepository;
import com.projet.cabinet.repositories.RendezVousRepository;
import com.projet.cabinet.service.IHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class CabinetSpringApplication  {
	@Autowired


	public static void main(String[] args) {
		SpringApplication.run(CabinetSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner Start(IHospitalService iHospitalService,PatientRepository patientRepository,MedecinRepository medecinRepository){
		return args -> {
			Stream.of("Mohamed", "Hassan", "Najat")
					.forEach (name->{
						Patient patient=new Patient();
						patient.setNom(name);
						patient.setDateNaissance(new Date());
						patient.setMalade (false);
						iHospitalService.savePatient(patient);
					});

			Stream.of("karim", "Hassna", "ali")
					.forEach (name->{
						Medecin medecin=new Medecin();
						medecin.setNom(name);
						medecin.setSpecialite (Math.random ()>0.5?"Cardio":"Dentiste");
						iHospitalService.saveMedecin (medecin);
					});
			Patient patient=patientRepository.findById(1L).orElse(  null);
			Medecin medecin = medecinRepository.findByNom("ali");
			RendezVous rendezVous=new RendezVous();
			rendezVous.setDate (new Date());
			rendezVous.setAnnule(StatutRDV.PENDING);
			rendezVous.setMedecin (medecin);
			rendezVous.setPatient (patient);
			iHospitalService.saveRDV(rendezVous);
			Consultation consultation = new Consultation();
			consultation.setDateConsultation(new Date());
			consultation.setRapport("fait");
			consultation.setRendezVous(rendezVous);
			iHospitalService.saveConsultation(consultation);
		};

	}
	/*@Override
	public void run(String... args) throws Exception {
		patientRepository.save(new Patient(null, "ali", new Date(), true, 13));
		patientRepository.save(new Patient(null, "ahmed", new Date(), true, 12));
		patientRepository.save(new Patient(null, "sara", new Date(), true, 11));
		patientRepository.save(new Patient(null, "mehdi", new Date(), false, 17));
		patientRepository.save(new Patient(null, "samir", new Date(), false, 18));
		patientRepository.save(new Patient(null, "sanam", new Date(), false, 19));
	 simple affichage des patients déja entrés
		patientRepository.findAll().forEach( patient -> {
		System.out.println("nom " + patient.getNom()+ "date "+patient.getDateNaissance());
	});
	récupération d'un patient et changement de son score
		System.out.println("****** *******");
		Patient patient = patientRepository.findById(1L).orElse(null);
		if (patient != null) {
			System.out.println(patient.getNom());
			System.out.println(patient.isMalade());
			patient.setScore(870);
			patientRepository.save(patient);
		}
		//simple utilisation du pagination
		Page<Patient> page = patientRepository.findAll(PageRequest.of(  1,  2));
		List<Patient> patients = page.getContent();
		patients.forEach(patient -> {
			System.out.println(patient.getNom());
			System.out.println(patient.isMalade());
		});
		List<Patient> patients = patientRepository.findByNomLikeAndScoreGreaterThan("%m%",17);
		//List<Patient> patients = page.getContent();
		patients.forEach(patient -> {
			System.out.println(patient.getNom());
			System.out.println(patient.isMalade());
		});
	}*/
}
