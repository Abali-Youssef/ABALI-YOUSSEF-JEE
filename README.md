# Architecture distribuée J2EE & Middlewares

## activité pratqiue 1 :

### Enoncé
```
 Inversion de contrôle et Injection des dépendances :

Rendre un compte rendu en reprenant l'exemple traité dans les vidéos des deux dernières séances
1. Créer l'interface IDao
2. Créer une implémentation de cette interface
3. Créer l'interface IMetier
4. Créer une implémentation de cette interface en utilisant le couplage faible
5. Faire l'injection des dépendances :
  - Par instanciation statique
  - Par instanciation dynamique
  - En utilisant le Framework Spring
       - Version XML
       - Version annotations
       
```

## Travail réalisé 

| Question | lien |commentaire |
| ----------- | ----------- |----------- |
| l'interface IDao | [IDao](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/seance-1/src/main/java/dao/IDao.java) |création de l'interface et ajout signature de la methode getData() |
| Implémentation de l'interface IDao | [IDaoImp](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/seance-1/src/main/java/dao/IDaoImp.java) |cration de la classe et la redifinition de la methode abstraite|
| l'interface IMetier | [IMetier](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/seance-1/src/main/java/metier/IMetier.java) |création de l'interface et l'ajout du signature de la methode calcul() |
| Implémentation de l'interface IMetier | [IMetierImp](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/seance-1/src/main/java/metier/IMetierImp.java) |cration de la classe, la redifinition de la methode abstraite  |
| I.D par instanciation statique | [Presentation Version Statique](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/seance-1/src/main/java/presentation/Presentation.java) |injection des dépendances en instanciant les objets statiquement |
| I.D Par instanciation dynamique | [Presentation Version Dynamique](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/seance-1/src/main/java/presentation/PresentationV2.java) |injection des dépendances en instanciant les objets dynamiquement  |
| I.D avec Spring version XML | [Application Contexte](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/seance-2/src/main/resources/ApplicationContexte.xml) |injection des dépendances en déclaration des beans dans un fichier XML |
| I.D avec Spring version annotations | [IMetierImp Avec Annotation](https://github.com/Abali-Youssef/ABALI-YOUSSEF-JEE/blob/main/seance-2/src/main/java/metier/IMetierImp.java) |injection des dépendances en déclaration des beans à l'aide des annotations|

