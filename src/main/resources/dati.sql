DROP TABLE IF EXISTS Cilveki;


CREATE TABLE Cilveki (
id INT AUTO_INCREMENT  PRIMARY KEY,
  vards VARCHAR(250) NOT NULL,
  uzvards VARCHAR(250) NOT NULL,
  vecums VARCHAR(250) DEFAULT NULL
);

INSERT INTO billionaires (vards, uzvards, vecums) VALUES
