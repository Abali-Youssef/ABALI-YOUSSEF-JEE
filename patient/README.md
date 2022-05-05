# Architecture distribuée J2EE & Middlewares

## activité pratique 3 :

### Enoncé
```
Voir la vidéo :Créer une application Web JEE basée sur Spring MVC, Thylemeaf et Spring Data JPA qui permet de gérer les patients. L'application doit permettre les fonctionnalités suivantes :
   -Afficher les patients
   -Faire la pagination
   -Chercher les patients
   -Supprimer un patient
   -Faire des améliorations supplémentaires
```

## Travail réalisé
les entités & les Dépots (repositories)

| Entité  | lien                                                                                                                                               | repository                                                                                                                                                       |
|---------|----------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Patient | [patient](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/patient/src/main/java/com/example/demo/entities/Patient.java) | [patient](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/patient/src/main/java/com/example/demo/repositories/PatientRepository.java) |



la couche web

| l'élément                 | lien                                                                                                                                                            |
|---------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| le controleur des patient | [PatientController](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/patient/src/main/java/com/example/demo/web/PatientController.java) |


les vues

| la vue                     | lien                                                                                                                                                      |
|----------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------|
| template                   | [Template](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/patient/src/main/resources/templates/template.html)    |
| index des patients         | [patients](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/patient/src/main/resources/templates/patient.html)    |
| formulaire d'ajout         | [addPatient](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/patient/src/main/resources/templates/formpatients.html)  |
| formulaire de modification | [editPatient](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/patient/src/main/resources/templates/editpatients.html) |


le programme principale : [main](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/patient/src/main/java/com/example/demo/PatientManagementApplication.java)