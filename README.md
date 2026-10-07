
Résumé:

Nounoux est une application mobile destinée aux assistantes maternelles (ASMAT) permettant de gérer simplement le pointage des enfants accueillis.

L'application mobile est connectée à une base de données centralisée. Les heures d'arrivée et de départ enregistrées depuis le téléphone y sont stockées afin d'être ensuite récupérées par une application PC.

L'application PC permet notamment d'exploiter ces données pour générer des fiches de présence et faciliter le suivi administratif.

 Fonctionnement:

Nounoux s'appuie sur trois composants principaux :

- Application mobile
           │
           │ Synchronisation
           ▼
- Base de données   
           │
           │ Récupération
           ▼
-  Application PC    

 
# Application mobile:

L'application mobile permet à l'assistante maternelle de :

consulter les enfants accueillis ;
enregistrer une arrivée ;
enregistrer un départ;
enregistrer les horaires de présence ;
ajouter/supprimer un enfant sans pouvoir le compléter pour autant;


L'objectif est de rendre le pointage rapide et éviter l'utilisation de feuille de pointage peu pratique.

# Base de données :

Les informations saisies depuis l'application mobile sont enregistrées dans une base de données centralisée.

Elle permet notamment de conserver :

les enfants ;
les dates de présence ;
les heures d'arrivée ;
les heures de départ ;
l'historique des pointages.

La base de données sert ainsi de lien entre l'application mobile et l'application PC.

# Application PC:

L'application PC se nommant AsmaT (depot:https://github.com/mouyousse/AsmaT) récupère les données enregistrées dans la BDD.

Elle a pour objectif :

 la consultation/modification des présences ;
 la consultation/modification de l'historique ;
 la génération de fiches de présence ;
 gérer les enfants/parents enregistrés

# Stack : 

Serveur: Vm Debian 12
Base de donnée: postgresql SQL
IDE: Android Studio Rabbit 1
Language : kotlin (java 25)
Deploy: Gradle 9.5
Support:Android 7.0+ 
API:express/node.js


# Fonctionnalités

L'application mobile est principalement destinée à la **saisie des présences**.

L'application PC est destinée à leur consultation, leur modification, leur traitement et leur exploitation.

# Actuellement

* [x] Pointage des enfants
* [x] Enregistrement des heures d'arrivée
* [x] Enregistrement des heures de départ
* [x] Envoi des données vers la base de données
* [x] HIstorique
* [x] Notifications

# Non possible sur cette version

* [ ] Gestion des enfants
* [ ] Génération automatique des fiches de présence
* [ ] Export des données
* [ ] Gestion de plusieurs profils
* [ ] Gestion des comptes utilisateurs
* [ ] Autres fonctionnalités de suivi administratif
* [ ] Support Parent


# Sécurité et confidentialité

Nounoux manipule des données relatives aux enfants accueillis.

Les communications entre l'application mobile, le serveur et la base de données ne communiqueront uniquement en local 
sur cette version sans support parent ainsi l'app ne sera utilisé uniquement en interne ainsi la sécurité sera assurée.

# Projet

Nounoux est développé dans le but de proposer un outil simple et pratique aux assistantes maternelles pour la gestion des présences.

Le projet est composé de plusieurs parties et sera réalisé dans cette ordre:

- Livrable 1 -> Diagramme/mise en place
- Livrable 2 -> Base de donnée
- Livrable 3 -> Application Mobile
- Livrable 4 -> Api
- Livrable 5 -> Liaison Api/App
- Livrable 6 -> tests/déploiement

Concernant les livrables je ne peux pas communiquer de dates les concernant car il m'est impossible de m'assurer du respect de ses dernières,cependant le github sera mise à jour à chaque étape du projet.

# Livrable (suivis) : 

Projet en cours de développement.
