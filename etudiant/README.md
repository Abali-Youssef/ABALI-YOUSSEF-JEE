# Architecture distribuée J2EE & Middlewares

## activité pratique 4 :

### Enoncé
```
Créer une application Web basée sur Spring MVC, Spring Data JPA et Spring Security qui permet de gérer des étudiants.
Chaque étudiant est défini par:
 - Son id
 - Son nom
 - Son prénom
 - Son email
 - Sa date naissance
 - Son genre : MASCULIN ou FEMININ
 - Un attribut qui indique si il est en règle ou non
L'application doit offrir les fonctionnalités suivantes :
  - Chercher des étudiants par nom
  - Faire la pagination
  - Supprimer des étudiants en utilisant la méthode (DELETE au lieu de GET)
  - Saisir et Ajouter des étudiants avec validation des formulaires
  - Editer et mettre à jour des étudiants
  - Créer une page template 
  - Sécuriser l'accès à l'application avec un système d'authentification basé sur Spring security en utilisant la stratégie UseDetails Service
 - Ajouter d'autres fonctionnalités supplémentaires 
```

## Travail réalisé
les entités & les Dépots (repositories)

| Entité   | lien                                                                                                                                                | repository                                                                                                                                                        |
|----------|-----------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Etudiant | [Etudiant](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/etudiant/src/main/java/com/projet/etudiant/entities/Etudiant.java) | [Etudiant](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/etudiant/src/main/java/com/projet/etudiant/repositories/EtudiantRepository.java) |
| User     | [User](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/etudiant/src/main/java/com/projet/etudiant/security/entities/User.java)     | [User](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/etudiant/src/main/java/com/projet/etudiant/security/repositories/UserRepository.java)     |
| Role     | [Role](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/etudiant/src/main/java/com/projet/etudiant/security/entities/Role.java)     | [Role](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/etudiant/src/main/java/com/projet/etudiant/security/repositories/RoleRepository.java)     |



la couche security et web

| l'élément                              | lien                                                                                                                                                                  |
|----------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| la classe de configuration de sécurité | [security config](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/etudiant/src/main/java/com/projet/etudiant/security/SecurityConfig.java)         |
| l'interface service                    | [securityService](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/etudiant/src/main/java/com/projet/etudiant/security/SecurityService.java)     |
| imp de l'interface service             | [securityServiceImp](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/etudiant/src/main/java/com/projet/etudiant/security/SecurityServiceImpl.java)  |
| la classe UserDetailServiceImp         | [UserDetailServiceImp](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/etudiant/src/main/java/com/projet/etudiant/security/UserDetailsServiceImpl.java) |
| le controlleur des etudiants           | [EtudiantController](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/etudiant/src/main/java/com/projet/etudiant/web/EtudiantController.java)  |


les vues

| la vue                     | lien                                                                                                                                                           |
|----------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| template                   | [template](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/etudiant/src/main/resources/templates/template.html)         |
| index des etudiants        | [etudiant](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/etudiant/src/main/resources/templates/etudiant.html)     |
| formulaire d'ajout         | [addEtudiant](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/etudiant/src/main/resources/templates/formetudiants.html)  |
| formulaire de modification | [editEtudiant](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/etudiant/src/main/resources/templates/editetudiants.html) |
| la page 404                | [404](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/etudiant/src/main/resources/templates/403.html)          |



le programme principale : [main](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/etudiant/src/main/java/com/projet/etudiant/EtudiantApplication.java)

