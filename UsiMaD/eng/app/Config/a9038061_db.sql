-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Serveur: localhost
-- Généré le : Ven 07 Juin 2013 à 14:58
-- Version du serveur: 5.5.8
-- Version de PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `a9038061_db`
--
DROP DATABASE `a9038061_db`;
CREATE DATABASE `a9038061_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `a9038061_db`;

-- --------------------------------------------------------

--
-- Structure de la table `addresses`
--

CREATE TABLE IF NOT EXISTS `addresses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `country_id` int(11) NOT NULL,
  `street` varchar(50) NOT NULL,
  `number` varchar(20) NOT NULL,
  `zip_code` int(11) NOT NULL,
  `city` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id` (`country_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=27 ;

--
-- Contenu de la table `addresses`
--

INSERT INTO `addresses` (`id`, `country_id`, `street`, `number`, `zip_code`, `city`) VALUES
(2, 22, 'rue du bourgeois', '85', 1050, 'Bruxelles'),
(4, 23, 'rue du lyon', '846', 45680, 'Lyon'),
(5, 24, 'RueVanstraat', '14', 86868, 'Amsterdam'),
(6, 22, 'place libre', '', 3450, 'Louvain-la-Neuve'),
(7, 24, 'ma rue', '52 b6', 1030, 'Bruxelles'),
(13, 22, 'ma rue', '52 b8', 1213, 'LLN'),
(14, 22, 'test', '1', 7760, 'Pottes'),
(18, 22, 'street', '52', 1030, 'BRuxeles'),
(23, 22, 'sdf', 'sdf', 1020, 'sdf'),
(24, 22, 'sdf', 'sdf', 321, 'dfs'),
(25, 22, 'sdf', 'sdf', 321, 'dfs'),
(26, 22, 'ma rue', '51', 5132, 'Bruxelles'),
(27, 22, 'rue du lac', '18', 1348, 'Louvain');

-- --------------------------------------------------------

--
-- Structure de la table `articles`
--

CREATE TABLE IF NOT EXISTS `articles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` text NOT NULL,
  `content` text NOT NULL,
  `language` int(11) NOT NULL DEFAULT '0',
  `user_id` int(11) NOT NULL,
  `created` datetime NOT NULL,
  `slug` varchar(20) NOT NULL,
  `category_id` int(11) NOT NULL,
  `online` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `category_id` (`category_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=13 ;

--
-- Contenu de la table `articles`
--

INSERT INTO `articles` (`id`, `name`, `description`, `content`, `language`, `user_id`, `created`, `slug`, `category_id`, `online`) VALUES
(1, 'My preferred articles', '<p>Tout ce que je veux decrire</p>\r\n<p>dsfsdfsdf</p>\r\n<p>sdfsdf</p>', '<p>Mon contenu de l''article avec les images et tout</p>', 1, 33, '2013-05-24 00:05:00', 'mon_preferred_articl', 1, 0),
(4, ' Mara', '<p>Ma description</p>', '<p>&nbsp;</p>\r\n<p><img class="alignLeft" src="/ww/eng/img/articlepictures/2013/05/P1000387.jpg" alt="mara" /></p>\r\n<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum</p>', 0, 34, '2013-05-30 10:56:00', '', 1, 0),
(5, ' Sans date de création', '<p>Ma descrition aa<br /><img class="alignCenter" src="/ww/eng/img/articlepictures/2013/05/P1000387.jpg" alt="mara" />adfsa</p>\r\n<div><br />aaaa</div>', '<p style="text-align: right;">Mon contenu avec photo a droite&nbsp;<img class="alignRight" src="/ww/eng/img/articlepictures/2013/05/P1000387.jpg" alt="mara" /></p>', 0, 34, '2013-05-30 11:11:16', '', 1, 0),
(6, ' Ma cérémonie de 13-16', '<p>zfdgh</p>', '<p>fsdfg&nbsp;</p>', 0, 34, '2013-05-30 11:16:17', '', 2, 0),
(7, ' sans abris', '<p>sdfdfgf&nbsp;</p>', '<p>sdf tout ce que je veus</p>', 0, 34, '2013-05-30 11:22:46', '', 1, 0),
(9, ' Ma propre cérémonie', '<p>fsdfgldlsmhkj</p>', '<p>Help&ugrave;qodjfg</p>', 0, 34, '2013-05-30 13:29:45', '', 2, 0),
(10, ' sdf', '<p>sdf</p>', '<p>sdf</p>', 0, 34, '2013-05-30 13:58:19', '', 1, 0),
(11, ' ', ' ', ' ', 0, 34, '2013-05-30 15:06:48', '', 1, -1),
(12, ' ', ' ', ' ', 0, 33, '2013-05-30 15:38:31', '', 1, -1);

-- --------------------------------------------------------

--
-- Structure de la table `categories`
--

CREATE TABLE IF NOT EXISTS `categories` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `description` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `categories`
--

INSERT INTO `categories` (`id`, `name`, `description`) VALUES
(1, 'Visits', 'Reflexion about past visits'),
(2, 'Ceremonies', 'Article about cerenomy, explaination of why we celebrate this cerenomy'),
(3, 'Battles', 'Famous battle of WW1 or WW2'),
(4, 'Reflexion', 'Reflection mode'),
(5, 'Poems', 'Poems about WW1 and WW2');

-- --------------------------------------------------------

--
-- Structure de la table `countries`
--

CREATE TABLE IF NOT EXISTS `countries` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=25 ;

--
-- Contenu de la table `countries`
--

INSERT INTO `countries` (`id`, `name`) VALUES
(22, 'Belgique'),
(23, 'France'),
(24, 'Pays-Bas');

-- --------------------------------------------------------

--
-- Structure de la table `eventarticle`
--

CREATE TABLE IF NOT EXISTS `eventarticle` (
  `id` int(30) NOT NULL,
  `event_id` int(30) NOT NULL,
  `article_id` int(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `event_id` (`event_id`),
  KEY `article_id` (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `eventarticle`
--


-- --------------------------------------------------------

--
-- Structure de la table `eventpictures`
--

CREATE TABLE IF NOT EXISTS `eventpictures` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `url` text NOT NULL,
  `alt` varchar(20) DEFAULT NULL,
  `foreign_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `foreign_id` (`foreign_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=18 ;

--
-- Contenu de la table `eventpictures`
--

INSERT INTO `eventpictures` (`id`, `url`, `alt`, `foreign_id`) VALUES
(16, 'eventpictures/2013/05/img.jpg', 'test', 2),
(17, 'eventpictures/2013/05/img.jpg', 'a', 19);

-- --------------------------------------------------------

--
-- Structure de la table `events`
--

CREATE TABLE IF NOT EXISTS `events` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `category_id` int(30) NOT NULL,
  `organisation_id` int(30) NOT NULL,
  `user_id` int(30) NOT NULL,
  `name` varchar(30) NOT NULL,
  `created` datetime NOT NULL,
  `active_begin` datetime DEFAULT NULL,
  `active_end` datetime DEFAULT NULL,
  `description` text NOT NULL,
  `online` int(30) NOT NULL,
  `address_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`),
  KEY `organisation_id` (`organisation_id`),
  KEY `user_id` (`user_id`),
  KEY `address_id` (`address_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=33 ;

--
-- Contenu de la table `events`
--

INSERT INTO `events` (`id`, `category_id`, `organisation_id`, `user_id`, `name`, `created`, `active_begin`, `active_end`, `description`, `online`, `address_id`) VALUES
(2, 1, 6, 44, 'Armistice 1918', '2013-05-26 09:02:01', '2013-03-11 09:01:00', '2013-03-11 18:01:00', '<p>Meeting for the 11th November commemoration</p>', 0, NULL),
(20, 1, 6, 34, 'qsdf', '2013-05-30 13:31:40', '2013-05-30 13:31:41', '2013-06-06 13:31:41', '<p>sdf&nbsp;</p>', 0, NULL),
(22, 1, 6, 34, '', '2013-05-30 16:06:22', NULL, NULL, '', -1, NULL),
(32, 1, 6, 33, 'Event Tes with Address', '2013-06-07 16:43:14', '2013-05-30 13:31:41', '2013-05-30 13:31:41', '<p>dfs</p>', 0, 26);

-- --------------------------------------------------------

--
-- Structure de la table `organisations`
--

CREATE TABLE IF NOT EXISTS `organisations` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `address_id` int(30) NOT NULL,
  `name` varchar(40) NOT NULL,
  `phone` varchar(30) NOT NULL,
  `fax` varchar(30) NOT NULL,
  `mail` varchar(40) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `address_id` (`address_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Contenu de la table `organisations`
--

INSERT INTO `organisations` (`id`, `address_id`, `name`, `phone`, `fax`, `mail`) VALUES
(6, 13, 'Creciun', '003287485', '0032458456', 'mon@mail.cpom');

-- --------------------------------------------------------

--
-- Structure de la table `pictures`
--

CREATE TABLE IF NOT EXISTS `pictures` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `url` text NOT NULL,
  `alt` varchar(20) DEFAULT NULL,
  `foreign_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `foreign_id` (`foreign_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `pictures`
--

INSERT INTO `events` (`id`, `category_id`, `organisation_id`, `user_id`, `name`, `created`, `active_begin`, `active_end`, `description`, `online`, `address_id`) VALUES
(2, 1, 6, 44, 'Armistice 1918', '2013-05-26 09:02:01', '2013-03-11 09:01:00', '2013-03-11 18:01:00', '<p>Meeting for the 11th November commemoration</p>', 0, NULL),
(20, 1, 6, 34, 'qsdf', '2013-05-30 13:31:40', '2013-05-30 13:31:41', '2013-06-06 13:31:41', '<p>sdf&nbsp;</p>', 0, NULL),
(22, 1, 6, 34, '', '2013-05-30 16:06:22', NULL, NULL, '', -1, NULL),
(32, 1, 6, 33, 'Event Tes with Address', '2013-06-07 16:43:14', '2013-05-30 13:31:41', '2013-05-30 13:31:41', '<p>dfs</p>', 0, 26);

-- --------------------------------------------------------

--
-- Structure de la table `urldoc`
--

CREATE TABLE IF NOT EXISTS `urldoc` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `article_id` int(30) NOT NULL,
  `url` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `article_id` (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `urldoc`
--


-- --------------------------------------------------------

--
-- Structure de la table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `address_id` int(30) NOT NULL,
  `username` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL,
  `role` varchar(30) NOT NULL,
  `lastname` varchar(60) NOT NULL,
  `firstname` varchar(60) NOT NULL,
  `active` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `address_id` (`address_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=46 ;

--
-- Contenu de la table `users`
--

INSERT INTO `users` (`id`, `address_id`, `username`, `password`, `role`, `lastname`, `firstname`, `active`) VALUES
(33, 2, 'ecr2@yopmail.com', '05c5b29070d50a12bb2667585eca383978e2ad2d', 'admin', 'Creciun', 'Eduard', 1),
(34, 6, 'ecr@yopmail.com', '05c5b29070d50a12bb2667585eca383978e2ad2d', 'user', 'Creciun', 'Eduard', 0),
(43, 7, 'ecr@yopm/com', 'd9dedb316a3f4b3881bc1d06d31b5894b518e01c', 'admin', 'Creciun', 'edyard', 0),
(44, 14, 'tristan', '01bafe18f9c3db761e77d0dcf6c5d2d7a7515448', 'user', 'Dorange', 'Tristan', 1),
(45, 18, 'ecr@@@@', '05c5b29070d50a12bb2667585eca383978e2ad2d', 'user', 'Creciun', 'Eudard', 0),
(46, 27, 'voisina', '4b3899a5bc02d6b4ef54ff050c2c50c006aab816', 'user', 'Voisin', 'Adrien', 0);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `addresses`
--
ALTER TABLE `addresses`
  ADD CONSTRAINT `addresses_ibfk_1` FOREIGN KEY (`country_id`) REFERENCES `countries` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `articles`
--
ALTER TABLE `articles`
  ADD CONSTRAINT `articles_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `articles_ibfk_2` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `eventarticle`
--
ALTER TABLE `eventarticle`
  ADD CONSTRAINT `eventarticle_ibfk_1` FOREIGN KEY (`article_id`) REFERENCES `articles` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `eventarticle_ibfk_2` FOREIGN KEY (`event_id`) REFERENCES `events` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `eventpictures`
--
ALTER TABLE `eventpictures`
  ADD CONSTRAINT `eventpictures_ibfk_1` FOREIGN KEY (`foreign_id`) REFERENCES `events` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `events`
--
ALTER TABLE `events`
  ADD CONSTRAINT `events_ibfk_4` FOREIGN KEY (`address_id`) REFERENCES `addresses` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `events_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `events_ibfk_2` FOREIGN KEY (`organisation_id`) REFERENCES `organisations` (`id`),
  ADD CONSTRAINT `events_ibfk_3` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `organisations`
--
ALTER TABLE `organisations`
  ADD CONSTRAINT `organisations_ibfk_1` FOREIGN KEY (`address_id`) REFERENCES `addresses` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `pictures`
--
ALTER TABLE `pictures`
  ADD CONSTRAINT `pictures_ibfk_1` FOREIGN KEY (`foreign_id`) REFERENCES `articles` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `urldoc`
--
ALTER TABLE `urldoc`
  ADD CONSTRAINT `urldoc_ibfk_1` FOREIGN KEY (`article_id`) REFERENCES `articles` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `users_ibfk_1` FOREIGN KEY (`address_id`) REFERENCES `addresses` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
