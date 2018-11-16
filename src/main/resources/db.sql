-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:3306
-- Généré le :  ven. 16 nov. 2018 à 18:22
-- Version du serveur :  5.7.23
-- Version de PHP :  7.2.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de données :  `spa89`
--

-- --------------------------------------------------------

--
-- Structure de la table `animal`
--

CREATE TABLE `animal` (
  `id` int(11) NOT NULL,
  `adopted` tinyint(1) DEFAULT NULL,
  `name` varchar(50) NOT NULL,
  `species` varchar(50) DEFAULT NULL,
  `race` varchar(50) DEFAULT NULL,
  `loof` tinyint(1) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  `abandonment` date DEFAULT NULL,
  `adoption` date DEFAULT NULL,
  `caracter` varchar(255) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `animal`
--

INSERT INTO `animal` (`id`, `adopted`, `name`, `species`, `race`, `loof`, `color`, `birthdate`, `abandonment`, `adoption`, `caracter`, `comment`) VALUES
(1, 1, 'Harry', 'Chat', 'Européen', 0, 'Tigré', NULL, NULL, NULL, NULL, 'The big Monster'),
(2, 1, 'Mila', 'Chat', 'Bleu-Russe', 1, 'Grey', NULL, NULL, NULL, NULL, 'Mila-minette'),
(3, 1, 'Maya', 'Chat', 'Européenne', 0, 'Black and white', NULL, NULL, NULL, 'Vénère', 'Coucou Ramaya'),
(4, 1, 'Nénette', 'Chat', 'Européenne', 0, 'tigrée', NULL, NULL, NULL, 'Attack', 'Nééééénettteeeeeee');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `animal`
--
ALTER TABLE `animal`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `animal`
--
ALTER TABLE `animal`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

