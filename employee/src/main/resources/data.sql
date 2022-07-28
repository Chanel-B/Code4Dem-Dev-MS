create table EndUser(
  id int,
  firstName varchar(255),
  lastName varchar(255),
  email varchar(255),
  endValidity DATETIME,
  startValidity DATETIME,
  password varchar(255)
  );

insert into EndUser(id, firstName, lastName, email, endValidity, startValidity, password) values
  (0, 'boe', 'Doen', 'doenboe@gmail.com', null, null, 'doenboe2022');

insert into EndUser(id, firstName, lastName, email, endValidity, startValidity, password) values
  (1, 'bob', 'bolo', 'bolobob@gmail.com', null, null, 'danse2022');

insert into EndUser(id, firstName, lastName, email, endValidity, startValidity, password) values
  (2, 'dol', 'daws', 'doldaws@gmail.com', null, null, 'cod2022');

insert into EndUser(id, firstName, lastName, email, endValidity, startValidity, password) values
  (3, 'rita', 'jolie', 'jolierita@gmail.com', null, null, '1235@#_r');

insert into EndUser(id, firstName, lastName, email, endValidity, startValidity, password) values
  (4, 'bruno', 'sunjay', 'sonjaibru@gmail.com', null, null, '#nobru_202sun');

--select * from EndUser;