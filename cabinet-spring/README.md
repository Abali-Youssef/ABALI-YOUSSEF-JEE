# Architecture distribuée J2EE & Middlewares

## activité pratqiue 1 :

### Enoncé
```
mapping objet relationnel avec JPA, Hibernate et Spring Data :
==> Cas  de Patient, Medecin, Rendez-vous, Consultation   
```

## Travail réalisé 
les entités & les Dépots (repositories)

| Entité                              | lien                                                                                                                                                  |repository|
|-------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------|
| Consultation                        | [Consultation](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/cabinet-spring/src/main/java/com/projet/cabinet/entities/Consultation.java)   |[Consultation](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/cabinet-spring/src/main/java/com/projet/cabinet/repositories/ConsultationRepository.java) |
| Medecin                             | [Medecin](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/cabinet-spring/src/main/java/com/projet/cabinet/entities/Medecin.java)             |[Medecin](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/cabinet-spring/src/main/java/com/projet/cabinet/repositories/MedecinRepository.java)|
| Patient                             | [Patient](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/cabinet-spring/src/main/java/com/projet/cabinet/entities/Patient.java)                             |[Patient](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/cabinet-spring/src/main/java/com/projet/cabinet/repositories/PatientRepository.java)  |
| Rendez-Vous                         | [Rendez-Vous](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/cabinet-spring/src/main/java/com/projet/cabinet/entities/RendezVous.java)  |[Rendez-Vous ](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/cabinet-spring/src/main/java/com/projet/cabinet/repositories/RendezVousRepository.java)    |



la couche service

| l'élément                 | lien                                                                                                                                                                 |
|---------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| interface IHospitalSerice | [IHospitalSerice](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/cabinet-spring/src/main/java/com/projet/cabinet/service/IHospitalService.java)        |
| imp. de HospitalSerice    | [IHospitalSericeImp](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/cabinet-spring/src/main/java/com/projet/cabinet/service/IHospitalServiceImpl.java) |

le programme principale : [main](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/cabinet-spring/src/main/java/com/projet/cabinet/CabinetSpringApplication.java)