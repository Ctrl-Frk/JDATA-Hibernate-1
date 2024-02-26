INSERT INTO PERSONS (name, surname, age, phone_number, city_of_living)
VALUES ('Bogdan', 'Bolshakov', 22, '+76666666666', 'MOSCOW');

INSERT INTO PERSONS (name, surname, age, phone_number, city_of_living)
VALUES ('Alex', 'Kozlov', 25, '+77777777777', 'SAINT-P');

INSERT INTO PERSONS (name, surname, age, phone_number, city_of_living)
VALUES ('Boris', 'Ivanov', 30, '+78888888888', 'MOSCOW');

INSERT INTO PERSONS (name, surname, age, phone_number, city_of_living)
VALUES ('Egor', 'Ershov', 40, '+79999999999', 'ROSTOV');

select * from persons where city_of_living = 'MOSCOW';