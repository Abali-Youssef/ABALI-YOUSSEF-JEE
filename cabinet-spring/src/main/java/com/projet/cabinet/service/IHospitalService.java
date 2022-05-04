package com.projet.cabinet.service;

import com.projet.cabinet.entities.Consultation;
import com.projet.cabinet.entities.Medecin;
import com.projet.cabinet.entities.Patient;
import com.projet.cabinet.entities.RendezVous;

public interface IHospitalService  {
    Patient savePatient (Patient patient);
    Medecin saveMedecin (Medecin medecin);
    RendezVous saveRDV (RendezVous rendezVous);
    Consultation saveConsultation (Consultation consultation);
}
