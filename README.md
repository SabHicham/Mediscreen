# MediScreen

MediScreen est une application conçue pour aider les médecins à générer des rapports sur le diabète de leurs patients à partir des notes saisies. L'application est construite sur une architecture de microservices, développée en Java 17, et conteneurisée avec Docker.

## Caractéristiques

- **Saisie de Notes**: Les médecins peuvent saisir des notes sur leurs patients.
- **Rapports sur le Diabète**: À partir des notes saisies, l'application génère automatiquement un rapport sur le risque de diabète du patient.
- **Microservices**: L'application utilise une architecture basée sur des microservices séparés pour les patients, les notes et les rapports.



## Microservices

1. **Patient**: Gère l'information des patients.
2. **Note**: Pour la saisie et la gestion des notes médicales.
3. **Rapport**: Génère des rapports à partir des données fournies dans les notes.

## diagramme
<img width="800" alt="mpd_p6"  src="https://github.com/SabHicham/Mediscreen/dev/diagramme%20d'interaction.png">

## Prérequis

- Java 17
- Docker
- Docker-compose
- MySQL
- MongoDB

## Installation

1. lancer le projet sur votre Ide:

```bash
clean mvn install 
```
2. Créer vos image

Pour chaque micro-service, une image Docker doit être créée. lancez dans le bon dossier les commandes suivantes:
```bash
docker build -t image-patient .
docker build -t image-notes .
docker build -t image-rapport .
docker build -t image-front .
```

2. démarrez les conteneurs avec Docker Compose:

```bash
docker-compose up 
```

L'application devrait maintenant tourner sur votre machine locale. Accédez à `http://localhost:8080` dans votre navigateur

## Utilisation

- Ajoutez un patient via le microservice `patient`.
- Saisissez des notes pour un patient à travers le microservice `note`.
- Consultez les rapports générés via le microservice `rapport`.



---

N'hésitez pas à cloner, utiliser, et contribuer à MediScreen!
