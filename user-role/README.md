# Architecture distribuée J2EE & Middlewares

## activité pratique 2 :

### Enoncé
```
mapping objet relationnel avec JPA, Hibernate et Spring Data :
==> Cas de Users et Roles  
```

## Travail réalisé 
les entités & les Dépots (repositories)

| Entité   | lien                                                                                                                                            |repository|
|----------|-------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------|
| User     | [User](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/user-role/src/main/java/com/projet/userrole/entities/User.java)   |[User](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/user-role/src/main/java/com/projet/userrole/repositories/UserRepository.java) |
| Role     | [Role](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/user-role/src/main/java/com/projet/userrole/entities/Role.java) |[Role](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/user-role/src/main/java/com/projet/userrole/repositories/RoleRepository.java)|

la couche service et web

| l'élément                                                                                                                                                                           | lien                                                                                                                                                   |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------|
| interface UserSerice                                                                                                                                                                | [UserSerice](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/user-role/src/main/java/com/projet/userrole/service/UserService.java)        |
| imp. de UserService                                                                                                                                                                 | [UserSericeImp](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/user-role/src/main/java/com/projet/userrole/service/UserServiceImpl.java) |
| le controleur des utilisateurs |  [UserController](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/user-role/src/main/java/com/projet/userrole/Web/UsersController.java)   |
le programme principale : [main](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/user-role/src/main/java/com/projet/userrole/DemoApplication.java)