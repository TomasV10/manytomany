INSERT INTO destytojai(id, vardas, pavarde) VALUES ('1', 'Tomas', 'Rozmarinas');
INSERT INTO destytojai(id, vardas, pavarde) VALUES ('2', 'Romas', 'Kelpinis');
INSERT INTO destytojai(id, vardas, pavarde) VALUES ('3', 'Kiklopas', 'Sikinis');
INSERT INTO destytojai(id, vardas, pavarde) VALUES ('4', 'Patricijus', 'Kiaulinis');

INSERT INTO dalykai(id, pavadinimas, destytojas_id) VALUES ('1', 'Matieka', '1');
INSERT INTO dalykai(id, pavadinimas, destytojas_id) VALUES ('2', 'Lietuviu', '2');
INSERT INTO dalykai(id, pavadinimas, destytojas_id) VALUES ('3', 'Info', '3');
INSERT INTO dalykai(id, pavadinimas, destytojas_id) VALUES ('4', 'Daile', '4');

INSERT INTO studentai(id, vardas, pavarde) VALUES ('1', 'Vaidotas', 'Zala');
INSERT INTO studentai(id, vardas, pavarde) VALUES ('2', 'Benediktas', 'Vanagas');
INSERT INTO studentai(id, vardas, pavarde) VALUES ('3', 'Martynas', 'Gelaznikas');
INSERT INTO studentai(id, vardas, pavarde) VALUES ('4', 'Agro', 'Rodeo');

INSERT INTO pazymiai(id, studentas_id, data,pazymys ) VALUES ('1', '1', '2019-05-05', '10');
INSERT INTO pazymiai(id, studentas_id, data,pazymys ) VALUES ('2', '2', '2019-05-05', '9');
INSERT INTO pazymiai(id, studentas_id, data,pazymys ) VALUES ('3', '3', '2019-05-05', '8');
INSERT INTO pazymiai(id, studentas_id, data,pazymys ) VALUES ('4', '4', '2019-05-05', '7');

INSERT INTO studentas_dalykai(studentas_id, dalykas_id) VALUES(1, 1);
INSERT INTO studentas_dalykai(studentas_id, dalykas_id) VALUES(2, 1);
INSERT INTO studentas_dalykai(studentas_id, dalykas_id) VALUES(4, 1);
INSERT INTO studentas_dalykai(studentas_id, dalykas_id) VALUES(1, 3);
INSERT INTO studentas_dalykai(studentas_id, dalykas_id) VALUES(2, 4);
INSERT INTO studentas_dalykai(studentas_id, dalykas_id) VALUES(4, 2);





