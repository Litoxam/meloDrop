# MeloDrop 🎵

Application mobile Android de découverte musicale : publiez votre "chanson du jour", explorez les profils des autres utilisateurs par swipe, et ajoutez les morceaux découverts directement à votre bibliothèque de streaming.

> ⚠️ **Statut : en cours de développement.** Ce README est provisoire et évoluera avec l'avancement du projet (projet de fin de première année — Holberton School, Stage 1).

---

## Table des matières

- [Présentation](#présentation)
- [Fonctionnalités principales](#fonctionnalités-principales)
- [Stack technique](#stack-technique)
- [Structure du projet](#structure-du-projet)
- [Démarrage](#démarrage)
- [Roadmap](#roadmap)
- [Limitations connues](#limitations-connues)
- [Licence](#licence)

---

## Présentation

MeloDrop permet aux amateurs de musique aux goûts éclectiques de sortir des sentiers battus de leur playlist habituelle. Chaque utilisateur publie une **"chanson du jour"** sur son profil public. Les autres utilisateurs découvrent ces profils via une **interface de swipe** (filtrable par genre musical), et peuvent ajouter les morceaux qui leur plaisent directement à leur bibliothèque de streaming (Spotify, Deezer).

**Public cible :** auditeurs en recherche de nouveauté, qui veulent explorer la musique en dehors de leurs habitudes.

---

## Fonctionnalités principales

| # | Fonctionnalité | Description |
|---|-----------------|--------------|
| 1 | 🎶 Chanson du jour | Publier un morceau quotidien sur son profil public |
| 2 | 👆 Découverte par swipe | Parcourir les profils des autres utilisateurs, filtrer par genre |
| 3 | 🔗 Liaison de compte streaming | Connecter son compte Spotify / Deezer |
| 4 | ➕ Ajout à la bibliothèque | Ajouter un morceau découvert directement à sa bibliothèque de streaming |
| 5 | 📊 Statistiques de profil | Nombre de chansons partagées, nombre de morceaux ajoutés par d'autres |
| 6 | 🔐 Authentification | Création et gestion de compte |

---

## Stack technique

**Application mobile**
- Kotlin
- Jetpack Compose

**Backend**
- Python
- FastAPI

**Base de données**
- MySQL

**Intégrations externes**
- API Spotify (limitée à 5 utilisateurs test)
- API Deezer
- *(Apple Music : prévu en évolution future)*

---

## Structure du projet

```
melodrop/
├── mobile/          # Application Android (Kotlin / Jetpack Compose)
├── backend/         # Backend FastAPI
├── docs/            # Documentation du projet (dossier Stage 1, etc.)
└── README.md
```

*(Structure amenée à évoluer avec le développement.)*

---

## Démarrage

> Les instructions d'installation seront ajoutées une fois les squelettes backend et mobile en place.

```bash
# Cloner le dépôt
git clone https://github.com/<votre-nom-utilisateur>/melodrop.git
cd melodrop
```

---

## Roadmap

- [ ] Développer l'UI mobile (Compose) avec des données factices
- [ ] Implémenter le backend FastAPI et le schéma MySQL
- [ ] Implémenter l'authentification
- [ ] Implémenter l'intégration Deezer (accessible à tous les utilisateurs)
- [ ] Implémenter l'intégration Spotify (tests internes uniquement — limite de 5 utilisateurs de test)
- [ ] Implémenter la découverte par swipe + filtre de genre
- [ ] Implémenter les statistiques de profil
- [ ] Implémenter le système de signalement communautaire pour le mauvais tagging
- [ ] Intégration Apple Music (évolution future)

---

## Limitations connues

- L'intégration Spotify est limitée à 5 comptes de test autorisés durant la phase actuelle de développement (pas de limite équivalente côté Deezer).
- Ni l'API Spotify ni l'API Deezer ne renvoient le genre musical, donc les genres sont tagués manuellement par les utilisateurs et modérés via un système de signalement communautaire.

---

## Licence

*À déterminer.*
