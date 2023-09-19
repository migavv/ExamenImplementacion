-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema asociacion
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema asociacion
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `asociacion` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `asociacion` ;

-- -----------------------------------------------------
-- Table `asociacion`.`heroes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `asociacion`.`heroes` (
  `idHeroe` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `rango` VARCHAR(1) NOT NULL,
  `habilidad` INT NOT NULL,
  `monstruosCombatidos` VARCHAR(45) NULL DEFAULT NULL,
  `residencia` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  `fans` INT NULL DEFAULT NULL,
  PRIMARY KEY (`idHeroe`),
  UNIQUE INDEX `idHeroe_UNIQUE` (`idHeroe` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 12
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `asociacion`.`monstruos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `asociacion`.`monstruos` (
  `idMonstruo` INT NOT NULL AUTO_INCREMENT,
  `nivelAmenaza` VARCHAR(45) NULL DEFAULT NULL,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idMonstruo`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `asociacion`.`batallas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `asociacion`.`batallas` (
  `idBatalla` INT NOT NULL AUTO_INCREMENT,
  `idHeroe` INT NOT NULL,
  `idMonstruo` INT NOT NULL,
  `resultadoBatalla` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idBatalla`),
  UNIQUE INDEX `idBatalla_UNIQUE` (`idBatalla` ASC) VISIBLE,
  INDEX `batallas_idHeroeFK_idx` (`idHeroe` ASC) VISIBLE,
  INDEX `batallas_idMonstruoFK_idx` (`idMonstruo` ASC) VISIBLE,
  CONSTRAINT `batallas_idHeroeFK`
    FOREIGN KEY (`idHeroe`)
    REFERENCES `asociacion`.`heroes` (`idHeroe`),
  CONSTRAINT `batallas_idMonstruoFK`
    FOREIGN KEY (`idMonstruo`)
    REFERENCES `asociacion`.`monstruos` (`idMonstruo`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `asociacion`.`celulas_heroe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `asociacion`.`celulas_heroe` (
  `idCelula` INT NOT NULL AUTO_INCREMENT,
  `idHeroeC` INT NOT NULL,
  PRIMARY KEY (`idCelula`),
  UNIQUE INDEX `idCelula_UNIQUE` (`idCelula` ASC) VISIBLE,
  INDEX `celulasHeroe_HeroeFK_idx` (`idHeroeC` ASC) VISIBLE,
  CONSTRAINT `celulasHeroe_HeroeFK`
    FOREIGN KEY (`idHeroeC`)
    REFERENCES `asociacion`.`heroes` (`idHeroe`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `asociacion`.`celulas_monstruo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `asociacion`.`celulas_monstruo` (
  `idCelula` INT NOT NULL AUTO_INCREMENT,
  `idMonstruoC` INT NOT NULL,
  PRIMARY KEY (`idCelula`),
  UNIQUE INDEX `idCelula_UNIQUE` (`idCelula` ASC) VISIBLE,
  INDEX `celulasMonstruo_idMonstruoFK_idx` (`idMonstruoC` ASC) VISIBLE,
  CONSTRAINT `celulasMonstruo_idMonstruoFK`
    FOREIGN KEY (`idMonstruoC`)
    REFERENCES `asociacion`.`monstruos` (`idMonstruo`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `asociacion`.`comida`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `asociacion`.`comida` (
  `idComida` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idComida`),
  UNIQUE INDEX `idComida_UNIQUE` (`idComida` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `asociacion`.`heroes_casa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `asociacion`.`heroes_casa` (
  `idHeroesCasa` INT NOT NULL AUTO_INCREMENT,
  `nombreHeroes` VARCHAR(100) NOT NULL,
  `fecha` DATE NOT NULL,
  PRIMARY KEY (`idHeroesCasa`),
  UNIQUE INDEX `idHeroesCasa_UNIQUE` (`idHeroesCasa` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `asociacion`.`partidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `asociacion`.`partidos` (
  `idPartido` INT NOT NULL AUTO_INCREMENT,
  `resultado` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idPartido`),
  UNIQUE INDEX `idPartido_UNIQUE` (`idPartido` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `asociacion`.`patrocinadores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `asociacion`.`patrocinadores` (
  `idPatrocinador` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idPatrocinador`),
  UNIQUE INDEX `idPatrocinador_UNIQUE` (`idPatrocinador` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `asociacion`.`patrocinadores_heroes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `asociacion`.`patrocinadores_heroes` (
  `idHeroe` INT NOT NULL,
  `idPatrocinador` INT NOT NULL,
  PRIMARY KEY (`idHeroe`, `idPatrocinador`),
  INDEX `patrocinadoresHeroes_PatrocinadoresFK_idx` (`idPatrocinador` ASC) VISIBLE,
  CONSTRAINT `patrocinadoresHeroes_HeroesFK`
    FOREIGN KEY (`idHeroe`)
    REFERENCES `asociacion`.`heroes` (`idHeroe`),
  CONSTRAINT `patrocinadoresHeroes_PatrocinadoresFK`
    FOREIGN KEY (`idPatrocinador`)
    REFERENCES `asociacion`.`patrocinadores` (`idPatrocinador`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `asociacion`.`patrocinadores_monstruos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `asociacion`.`patrocinadores_monstruos` (
  `idMonstruo` INT NOT NULL,
  `idPatrocinador` INT NOT NULL,
  PRIMARY KEY (`idMonstruo`, `idPatrocinador`),
  INDEX `patrocinadoresMonstruos_PatrocinadorFK_idx` (`idPatrocinador` ASC) VISIBLE,
  CONSTRAINT `patrocinadoresMonstruos_MonstruoFK`
    FOREIGN KEY (`idMonstruo`)
    REFERENCES `asociacion`.`monstruos` (`idMonstruo`),
  CONSTRAINT `patrocinadoresMonstruos_PatrocinadorFK`
    FOREIGN KEY (`idPatrocinador`)
    REFERENCES `asociacion`.`patrocinadores` (`idPatrocinador`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `asociacion`.`videojuegos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `asociacion`.`videojuegos` (
  `idJuego` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idJuego`),
  UNIQUE INDEX `idJuego_UNIQUE` (`idJuego` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
