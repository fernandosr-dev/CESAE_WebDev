-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Tempo de geração: 25/09/2024 às 17:56
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `fernandowm_TudoNumBrinco`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `Maquina`
--

CREATE TABLE `Maquina` (
  `numero` int(11) NOT NULL,
  `idTipo` int(11) DEFAULT NULL,
  `dataUltimaManut` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `Servico`
--

CREATE TABLE `Servico` (
  `codFatura` int(11) NOT NULL,
  `numeroMaquina` int(11) DEFAULT NULL,
  `duracaoEmMinutos` int(11) DEFAULT NULL,
  `valor` decimal(8,2) DEFAULT NULL,
  `nifCliente` varchar(9) DEFAULT NULL,
  `dataHora` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `Tipo`
--

CREATE TABLE `Tipo` (
  `id` int(11) NOT NULL,
  `nome` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `Maquina`
--
ALTER TABLE `Maquina`
  ADD PRIMARY KEY (`numero`),
  ADD KEY `FK_MAQUINA_IDTIPO` (`idTipo`);

--
-- Índices de tabela `Servico`
--
ALTER TABLE `Servico`
  ADD PRIMARY KEY (`codFatura`),
  ADD KEY `FK_SERVICO_NUMEROMAQUINA` (`numeroMaquina`);

--
-- Índices de tabela `Tipo`
--
ALTER TABLE `Tipo`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `Maquina`
--
ALTER TABLE `Maquina`
  MODIFY `numero` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `Servico`
--
ALTER TABLE `Servico`
  MODIFY `codFatura` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `Tipo`
--
ALTER TABLE `Tipo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `Maquina`
--
ALTER TABLE `Maquina`
  ADD CONSTRAINT `FK_MAQUINA_IDTIPO` FOREIGN KEY (`idTipo`) REFERENCES `Tipo` (`id`);

--
-- Restrições para tabelas `Servico`
--
ALTER TABLE `Servico`
  ADD CONSTRAINT `FK_SERVICO_NUMEROMAQUINA` FOREIGN KEY (`numeroMaquina`) REFERENCES `Maquina` (`numero`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
