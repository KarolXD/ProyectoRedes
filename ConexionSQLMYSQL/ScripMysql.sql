SELECT * FROM tarea3_b64543_b6587.persona;

use tarea3_b64543_b6587;

SET SQL_SAFE_UPDATES = 0;
delete from persona where cedula<>0;

  insert into persona(nombre,apellido1,apellido2,sexo,edad,cedula)
values('Armando','Riv','Barboa','Masculino',20,1);


insert into persona(nombre,apellido1,apellido2,sexo,edad,cedula)
values('Jesus','Colindres','Porras','Masculino',40,7);

insert into persona(nombre,apellido1,apellido2,sexo,edad,cedula)
values('Rebeca','Colindres','Porras','Female',40,5);
insert into persona(nombre,apellido1,apellido2,sexo,edad,cedula)
values('Jimena','Colindres','Porras','Male',40,6);

update persona set nombre ='Armando',  apellido1='Riv', apellido2='Barboa', sexo='Femenino', edad=20
where cedula=1;


create table persona(
nombre varchar(45) not null,
apellido1 varchar(45) not null,
apellido2 varchar(45) not null,
sexo varchar(45) not null,
edad int not null,
cedula int not null
);


  insert into persona(nombre,apellido1,apellido2,sexo,edad,cedula)
values('Eduado','Pelaz','Porras','Masculino',40,1);
  
 
 
drop table persona;


DROP TABLE temp_table;

