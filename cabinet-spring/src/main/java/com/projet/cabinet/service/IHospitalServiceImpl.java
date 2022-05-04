package com.projet.cabinet.service;

import com.projet.cabinet.entities.Consultation;
import com.projet.cabinet.entities.Medecin;
import com.projet.cabinet.entities.Patient;
import com.projet.cabinet.entities.RendezVous;
import com.projet.cabinet.repositories.ConsultationRepository;
import com.projet.cabinet.repositories.MedecinRepository;
import com.projet.cabinet.repositories.PatientRepository;
import com.projet.cabinet.repositories.RendezVousRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class IHospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;
    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
