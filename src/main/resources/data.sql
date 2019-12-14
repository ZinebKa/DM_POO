INSERT INTO address(id, creation, content ) VALUES (1, CURRENT_TIMESTAMP() , '57 boulevard demorieux');
INSERT INTO address(id, creation, content ) VALUES (2, CURRENT_TIMESTAMP() , '51 allee du gamay , 34080 Montpellier');
UPDATE address SET auteur ='Zineb' WHERE id=1;
UPDATE address SET auteur ='Nicos' WHERE id=2;


