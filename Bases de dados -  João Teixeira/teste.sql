SELECT 
    Animal.Id AS IdAnimal,
    Animal.Nome AS NomeAnimal,
    Consulta.DataHora,
    Consulta.Diagnostico,
    Consulta.Tratamento
FROM 
    Animal
JOIN 
    Consulta
ON 
    Animal.Id = Consulta.IdAnimal
WHERE 
    Animal.Especie = 2 AND Animal.Raca = 'Persa';

    SELECT 
        Animal.Id AS IdAnimal,
        Animal.Nome AS NomeAnimal,
        Especie.Nome AS NomeEspecie,
        Animal.Raca AS NomeRaca,
        Consulta.DataHora,
        Consulta.Diagnostico,
        Consulta.Tratamento
    FROM 
        Animal
    JOIN 
        Especie
    ON 
        Animal.Especie = Especie.Id
    JOIN 
        Consulta
    ON 
        Animal.Id = Consulta.IdAnimal
    WHERE 
        Animal.Especie = 2 AND Animal.Raca = 'Persa';



CREATE TABLE LinhaFatura (
    IdFatura INT NOT NULL,
    IdProduto INT NOT NULL,
    Quantidade INT,
    ValorUnidade DECIMAL(10,2),
    CONSTRAINT PK_LINHAFATURA PRIMARY KEY (IdFatura, IdProduto),
    CONSTRAINT FK_LINHAFATURA FOREIGN KEY (IdFatura, IdProduto) REFERENCES Fatura(Id), Produto(Id)
);

CREATE TABLE LinhaFatura (
    IdFatura INT NOT NULL,
    IdProduto INT NOT NULL,
    Quantidade INT,
    ValorUnidade DECIMAL(10,2),
    CONSTRAINT PK_LINHAFATURA PRIMARY KEY (IdFatura, IdProduto),
    CONSTRAINT FK_LINHAFATURA_FATURA FOREIGN KEY (IdFatura) REFERENCES Fatura(Id),
    CONSTRAINT FK_LINHAFATURA_PRODUTO FOREIGN KEY (IdProduto) REFERENCES Produto(Id)
);


CREATE TABLE LinhaFatura (
    'IdFatura' INT NOT NULL PRIMARY KEY,
    'IdProduto' INT NOT NULL PRIMARY KEY,
    Quantidade INT,
    ValorUnidade DECIMAL(10,2),
    CONSTRAINT FK_LINHAFATURA_FATURA FOREIGN KEY ('IdFatura') REFERENCES Fatura('Id'),
    CONSTRAINT FK_LINHAFATURA_PRODUTO FOREIGN KEY ('IdProduto') REFERENCES Produto('Id')
);
