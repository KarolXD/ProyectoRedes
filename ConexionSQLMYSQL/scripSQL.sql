
  select* from persona

  delete from persona where cedula<>1

  insert into persona(nombre,apellido1,apellido2,sexo,edad,cedula)
values('Dorian','Pelaz','Porras','Masculino',40,2);

  insert into persona(nombre,apellido1,apellido2,sexo,edad,cedula)
values('Ana','Asctoga','Porras','Female',40,3);

  insert into persona(nombre,apellido1,apellido2,sexo,edad,cedula)
values('Armando','Riv','Barboa','Masculino',20,1);

update persona set nombre ='Karol',  apellido1='Mg', apellido2='Porra', sexo='Fem', edad=20
where cedula=2

drop table persona

create table persona(
nombre varchar(45) not null,
apellido1 varchar(45) not null,
apellido2 varchar(45) not null,
sexo varchar(45) not null,
edad int not null,
cedula int not null
);
update persona set nombre ='Armando',  apellido1='Riv', apellido2='Barboa', sexo='Femenino', edad=20
where cedula=1;
