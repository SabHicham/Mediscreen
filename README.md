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

## Prérequis

- Java 17
- Docker
- Docker-compose

## Installation

1. Clonez le dépôt:

```bash
git clone https://github.com/votre_nom_utilisateur/MediScreen.git
cd MediScreen
```

2. Construisez et démarrez les conteneurs avec Docker Compose:

```bash
docker-compose up --build -d
```

L'application devrait maintenant tourner sur votre machine locale. Accédez à `http://localhost:PORT` dans votre navigateur, où `PORT` est le port exposé pour le service principal.

## Utilisation

- Ajoutez un patient via le microservice `patient`.
- Saisissez des notes pour un patient à travers le microservice `note`.
- Consultez les rapports générés via le microservice `rapport`.

## Contribution

Si vous souhaitez contribuer au projet, veuillez consulter [CONTRIBUTING.md](./CONTRIBUTING.md) pour les directives.

## Support

Pour toute question ou support, ouvrez un problème dans la section "Issues" du dépôt GitHub.

## Licence

MediScreen est sous licence MIT. Voir le fichier [LICENSE](./LICENSE) pour plus d'informations.

---

N'hésitez pas à cloner, utiliser, et contribuer à MediScreen!
