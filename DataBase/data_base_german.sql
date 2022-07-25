-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 25-07-2022 a las 14:17:31
-- Versión del servidor: 5.7.36
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `data_base_german`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acerca_de_mi`
--

DROP TABLE IF EXISTS `acerca_de_mi`;
CREATE TABLE IF NOT EXISTS `acerca_de_mi` (
  `id` bigint(20) NOT NULL,
  `contenido` text,
  `icono` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `acerca_de_mi`
--

INSERT INTO `acerca_de_mi` (`id`, `contenido`, `icono`, `titulo`) VALUES
(2, 'Estudio programación desde 2020 y soy un aficionado al diseño grafico. Me encuentro entusiasmado con las posibilidades que brinda la programación y siendo muy curioso con el alcancé que tiene la tecnología siento que puedo desarrollarme y crecer profesionalmente en la insdustria IT. Actualmente sigo estudiando y adquiriendo habilidades para encontrar el trabajo que busco en esta insdustria.', 'assets/img/icons/grandes/icon_ACERCA.svg', 'ACERCA DE MI');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `educacion`
--

DROP TABLE IF EXISTS `educacion`;
CREATE TABLE IF NOT EXISTS `educacion` (
  `id` bigint(20) NOT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `fecha` varchar(255) DEFAULT NULL,
  `icono` varchar(255) DEFAULT NULL,
  `item_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `educacion`
--

INSERT INTO `educacion` (`id`, `titulo`, `fecha`, `icono`, `item_id`) VALUES
(1, 'Escuela Bartolome Mitre', 'feb. 2021 -jul. 2022', 'fa-solid fa-school fa-xl', 4),
(2, 'Escuela de Educación Tecnica N° 3106', 'mar. 2008 - dic. 2013', 'fa-solid fa-book fa-2xl', 3),
(3, 'Todo Code Academi', 'mar. 2003 - nov. 2007', 'fa-brands fa-git-alt fa-2xl', 2),
(4, 'Argentina Programa #YoProgramo', 'feb. 2021 -jul. 2022', 'fa-solid fa-code fa-2xl', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `educacion_items`
--

DROP TABLE IF EXISTS `educacion_items`;
CREATE TABLE IF NOT EXISTS `educacion_items` (
  `id` bigint(20) NOT NULL,
  `fecha` varchar(255) DEFAULT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experiencia`
--

DROP TABLE IF EXISTS `experiencia`;
CREATE TABLE IF NOT EXISTS `experiencia` (
  `id` bigint(20) NOT NULL,
  `contenido` text,
  `icono` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `experiencia`
--

INSERT INTO `experiencia` (`id`, `contenido`, `icono`, `titulo`) VALUES
(3, 'Aprendiendo a programar desde hace 2 años. Actividades y grupos: Desarrollamos 2 etapas. La primera #SeProgramar consistía en conocimiento de básico sobre programación, ejercicios prácticos y una visión inicial del POO. La segunda etapa #YoProgramo profundizamos conocimientos adquirimos habilidades y herramientas necesarias para convertirte en un programador web full-stack junior, también con un trabajo final integrador desarrollamos nuestro Portfolio web.', NULL, 'EXPERIENCIA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(45);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `portada`
--

DROP TABLE IF EXISTS `portada`;
CREATE TABLE IF NOT EXISTS `portada` (
  `id` bigint(20) NOT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `subtitulo` varchar(255) DEFAULT NULL,
  `contenido` text NOT NULL,
  `perfil_url` varchar(255) DEFAULT NULL,
  `portada_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `portada`
--

INSERT INTO `portada` (`id`, `apellido`, `nombre`, `subtitulo`, `contenido`, `perfil_url`, `portada_url`) VALUES
(1, NULL, 'GERMAN AGUIRRE', 'DESARROLLADOR WEB FULL STACK WEB', 'Estudiante de Programacion web en Argentina Programa. Soy una persona autodidacta y siempre que puedo intento aprender nuevas tecnologias. Estoy buscando formar parte de un proyecto que me permita proyectarme profesionalmente y dejar mi marca en la web.', '\\assets\\img\\perfil.jpg', '\\assets\\img\\fondo_ilustracion-fondo.svg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyectos`
--

DROP TABLE IF EXISTS `proyectos`;
CREATE TABLE IF NOT EXISTS `proyectos` (
  `id` bigint(20) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `url_imagen` varchar(255) DEFAULT NULL,
  `url_proyecto` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

DROP TABLE IF EXISTS `rol`;
CREATE TABLE IF NOT EXISTS `rol` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rol_nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`id`, `rol_nombre`) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `skills`
--

DROP TABLE IF EXISTS `skills`;
CREATE TABLE IF NOT EXISTS `skills` (
  `descripcion` text,
  `fotos` varchar(255) DEFAULT NULL,
  `icono` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `porcentaje` bigint(20) DEFAULT NULL,
  `skill_id` bigint(20) DEFAULT NULL,
  `id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `skills`
--

INSERT INTO `skills` (`descripcion`, `fotos`, `icono`, `nombre`, `porcentaje`, `skill_id`, `id`) VALUES
('HTML, siglas en inglés de HyperText Markup Language, hace referencia al lenguaje de marcado para la elaboración de páginas web.', '', '\\assets\\img\\icons\\pequeños\\HTML0.svg', 'HTML5', 75, 51, 1),
('El CSS se puede usar para estilos de texto muy básicos como, por ejemplo, cambiar el color y el tamaño de los encabezados y los enlaces', NULL, '\\assets\\img\\icons\\pequeños\\CSS0.svg', 'CSS', 75, 52, 2),
('JavaScript es un lenguaje de programación interpretado, dialecto del estándar ECMAScript. Se define como orientado a objetos, basado en prototipos, imperativo, débilmente tipado y dinámico.', NULL, '\\assets\\img\\icons\\pequeños\\JS0.svg', 'JAVASCRIPT', 40, 53, 3),
('AngularJS was a JavaScript-based open-source front-end web framework for developing single-page applications. It was maintained mainly by Google and a community of individuals and corporations.', NULL, '\\assets\\img\\icons\\pequeños\\ANGULAR0.svg', 'ANGULAR', 60, 54, 4),
('Bootstrap es un framework front-end popular entre los desarrolladores hoy, en particular aquellos que trabajan en el mundo del diseño. Es fácil de usar y ahorra a los desarrolladores tener que escribir código HTML, CSS y JavaScript manualmente.', NULL, '\\assets\\img\\icons\\pequeños\\BOOT0.svg', 'BOOTSTRAP', 70, 55, 5),
('Adobe Photoshop es un editor de fotografías desarrollado por Adobe Systems Incorporated. Usado principalmente para el retoque de fotografías y gráficos, su nombre en español significa \"taller de fotos\".', NULL, '\\assets\\img\\icons\\pequeños\\PHOTOSHOP0.svg', 'PHOTOSHOP', 80, 56, 6),
('Adobe Illustrator es un editor de gráficos vectoriales sirve para editar entre otras cosas. Es desarrollado y comercializado por Adobe Systems y constituye su primer programa oficial de su tipo en ser lanzado por esta compañía definiendo en cierta manera el lenguaje gráfico contemporáneo mediante el dibujo vectorial.', NULL, '\\assets\\img\\icons\\pequeños\\ILLUSTRATOR0.svg', 'ILLUSTRATOR', 60, 57, 7),
('Es un editor de gráficos vectoriales desarrollado y publicado por Adobe Inc para diseñar y crear un prototipo de la experiencia del usuario para páginas web y aplicaciones móviles.', NULL, '\\assets\\img\\icons\\pequeños\\XD0.svg', 'ADOBE XD', 50, 58, 8),
('Es un sistema de gestión de bases de datos relacional desarrollado bajo licencia dual: Licencia pública general/Licencia comercial por Oracle Corporation y está considerada como la base de datos de código abierto más popular del mundo.', NULL, '\\assets\\img\\icons\\pequeños\\MYSQL0.svg', 'MYSQL', 60, 59, 9),
('Es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems.', NULL, '\\assets\\img\\icons\\pequeños\\JAVA0.svg', 'JAVA', 40, 60, 10),
('Git is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency.', NULL, '\\assets\\img\\icons\\pequeños\\GIT0.svg', 'GIT', 60, 61, 11),
('Git es un sistema de control de versiones distribuido gratuito y de código abierto diseñado para manejar todo, desde proyectos pequeños hasta proyectos muy grandes, con rapidez y eficiencia.', NULL, '\\assets\\img\\icons\\pequeños\\GITHUB0.svg', 'GITHUB', 60, 62, 12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) CHARACTER SET latin1 COLLATE latin1_spanish_ci DEFAULT NULL,
  `nombre` varchar(255) CHARACTER SET latin1 COLLATE latin1_spanish_ci DEFAULT NULL,
  `nombre_usuario` varchar(255) CHARACTER SET latin1 COLLATE latin1_spanish_ci DEFAULT NULL,
  `password` varchar(100) CHARACTER SET latin1 COLLATE latin1_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_puhr3k3l7bj71hb7hk7ktpxn0` (`nombre_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `email`, `nombre`, `nombre_usuario`, `password`) VALUES
(2, 'u@u.u', 'user', 'user', '$2a$10$CoAoWAiIb2IHpgkrX8O6juYQFKGzg4jfB6TSj8iSve.W4wLZqJY/e'),
(3, 'e@e.e', 'german', 'german', '$2a$10$wtbG5KsGX7hWtao8T8yeMu5TSkMJaUFj3vrnKE/oV5l9qHfUp0r22'),
(5, 'a@a.a', 'admin', 'admin', '$2a$10$/fulttCFVuMZuoXzYpmTm.iNRGOpA06gDAX.ljcheqgIpV88etLVG');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_rol`
--

DROP TABLE IF EXISTS `usuario_rol`;
CREATE TABLE IF NOT EXISTS `usuario_rol` (
  `usuario_id` int(11) NOT NULL,
  `rol_id` int(11) NOT NULL,
  PRIMARY KEY (`usuario_id`,`rol_id`),
  KEY `FK610kvhkwcqk2pxeewur4l7bd1` (`rol_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario_rol`
--

INSERT INTO `usuario_rol` (`usuario_id`, `rol_id`) VALUES
(3, 1),
(2, 2),
(5, 2);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `usuario_rol`
--
ALTER TABLE `usuario_rol`
  ADD CONSTRAINT `FK610kvhkwcqk2pxeewur4l7bd1` FOREIGN KEY (`rol_id`) REFERENCES `rol` (`id`),
  ADD CONSTRAINT `FKbyfgloj439r9wr9smrms9u33r` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
