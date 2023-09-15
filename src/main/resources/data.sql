
--PACIENTES
INSERT INTO pacientes (nombre, apellido, fecha_nacimiento, dni, telefono, correo) VALUES ('Agustin','Carrizo','1996-10-26','38225312','3834809777','jcarrizoagustin@gmail.com')
INSERT INTO pacientes (nombre, apellido, fecha_nacimiento, dni, telefono, correo) VALUES ('Mariana','Gimenez','1990-11-14','30125896','3834651511','margimenez@hotmail.com')
INSERT INTO pacientes (nombre, apellido, fecha_nacimiento, dni, telefono, correo) VALUES ('Lorena','Sanchez','1975-05-04','20188745','3834774171','sanchzLorena@gmail.com')
INSERT INTO pacientes (nombre, apellido, fecha_nacimiento, dni, telefono, correo) VALUES ('Alberto','Diaz','1988-01-17','22584296','3865781265','diazalb@gmail.com')
INSERT INTO pacientes (nombre, apellido, fecha_nacimiento, dni, telefono, correo) VALUES ('Carlos', 'Gomez', '1995-05-22', '31458923', '1155512345', 'carlos@gmail.com')
INSERT INTO pacientes (nombre, apellido, fecha_nacimiento, dni, telefono, correo) VALUES ('Laura', 'Martinez', '1980-08-10', '22245678', '1155598765', 'laura@yahoo.com')
INSERT INTO pacientes (nombre, apellido, fecha_nacimiento, dni, telefono, correo) VALUES ('Pedro', 'Ramirez', '2000-03-15', '15478932', '1155523456', 'pedro@hotmail.com')
INSERT INTO pacientes (nombre, apellido, fecha_nacimiento, dni, telefono, correo) VALUES ('Ana', 'Lopez', '1992-12-05', '36874521', '1155587654', 'ana@outlook.com')
INSERT INTO pacientes (nombre, apellido, fecha_nacimiento, dni, telefono, correo) VALUES ('Elena', 'Fernandez', '1987-04-30', '47896521', '1155576543', 'elena@gmail.com')
INSERT INTO pacientes (nombre, apellido, fecha_nacimiento, dni, telefono, correo) VALUES ('Diego', 'Perez', '1998-07-18', '58963214', '1155534567', 'diego@yahoo.com')
INSERT INTO pacientes (nombre, apellido, fecha_nacimiento, dni, telefono, correo) VALUES ('Juan', 'Garcia', '1985-02-09', '78963214', '1155518966', 'juan@gmail.com')
INSERT INTO pacientes (nombre, apellido, fecha_nacimiento, dni, telefono, correo) VALUES ('María', 'Rodriguez', '1977-11-20', '45698721', '11555819747', 'maria@yahoo.com')

--CONSULTORIOS
INSERT INTO consultorios (descripcion) VALUES('consultorio 1')
INSERT INTO consultorios (descripcion) VALUES('consultorio 2')
INSERT INTO consultorios (descripcion) VALUES('consultorio 3')

-- ESPECIALIDADES
INSERT INTO especialidades (descripcion) VALUES('clinica medica')
INSERT INTO especialidades (descripcion) VALUES('cardiologia')
INSERT INTO especialidades (descripcion) VALUES('dermatologia')
INSERT INTO especialidades (descripcion) VALUES('pediatria')

-- DOCTORES
INSERT INTO doctores (nombre, apellido, matricula, telefono,especialidad_id) VALUES('Alberto','Miranda','01389','118956328',1)
INSERT INTO doctores (nombre, apellido, matricula, telefono,especialidad_id) VALUES('Karina','Lopez','01377','118951478',2)
INSERT INTO doctores (nombre, apellido, matricula, telefono,especialidad_id) VALUES('Raul','Oshtokich','11859','3834887712',3)
INSERT INTO doctores (nombre, apellido, matricula, telefono,especialidad_id) VALUES('Monica','Fernandez','18741','3865189755',4)

INSERT INTO doctores (nombre, apellido, matricula, telefono,especialidad_id) VALUES('Olga','Sanchez','14789','3834717178',1)
INSERT INTO doctores (nombre, apellido, matricula, telefono,especialidad_id) VALUES('Monica','Albertario','11749','3864784512',2)
INSERT INTO doctores (nombre, apellido, matricula, telefono,especialidad_id) VALUES('Andres','Molina','85459','1185247524',3)
INSERT INTO doctores (nombre, apellido, matricula, telefono,especialidad_id) VALUES('Javier','Cortes','14585','3834261785',4)

INSERT INTO doctores (nombre, apellido, matricula, telefono,especialidad_id) VALUES('Mariano','Acevedo','65412','3835124578',1)
INSERT INTO doctores (nombre, apellido, matricula, telefono,especialidad_id) VALUES('Marianela','Moreno','01444','1185965625',2)
INSERT INTO doctores (nombre, apellido, matricula, telefono,especialidad_id) VALUES('Facundo','Castro','96152','3834751221',3)
INSERT INTO doctores (nombre, apellido, matricula, telefono,especialidad_id) VALUES('Nicolas','Nieva','15421','3834797877',4)

INSERT INTO doctores (nombre, apellido, matricula, telefono,especialidad_id) VALUES('Gimena','Sayes','20254','3869828412',1)
INSERT INTO doctores (nombre, apellido, matricula, telefono,especialidad_id) VALUES('Arturo','Lopez','00457','118965235',2)
INSERT INTO doctores (nombre, apellido, matricula, telefono,especialidad_id) VALUES('Fernando','Oshtokich','13144','3834788584',3)
INSERT INTO doctores (nombre, apellido, matricula, telefono,especialidad_id) VALUES('Carolina','Fernandez','12547','3865227864',4)

--HORARIOS
--
INSERT INTO horarios (dia,inicio,fin) VALUES(1,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(2,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(3,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(4,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(5,'08:00','16:00')
--2
INSERT INTO horarios (dia,inicio,fin) VALUES(1,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(2,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(3,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(4,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(5,'16:00','23:00')
--3
INSERT INTO horarios (dia,inicio,fin) VALUES(1,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(2,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(3,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(4,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(5,'08:00','16:00')
--4
INSERT INTO horarios (dia,inicio,fin) VALUES(1,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(2,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(3,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(4,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(5,'16:00','23:00')

INSERT INTO horarios (dia,inicio,fin) VALUES(1,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(2,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(3,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(4,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(5,'08:00','16:00')
--2
INSERT INTO horarios (dia,inicio,fin) VALUES(1,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(2,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(3,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(4,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(5,'16:00','23:00')
--3
INSERT INTO horarios (dia,inicio,fin) VALUES(1,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(2,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(3,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(4,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(5,'08:00','16:00')
--4
INSERT INTO horarios (dia,inicio,fin) VALUES(1,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(2,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(3,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(4,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(5,'16:00','23:00')

INSERT INTO horarios (dia,inicio,fin) VALUES(1,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(2,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(3,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(4,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(5,'08:00','16:00')
--2
INSERT INTO horarios (dia,inicio,fin) VALUES(1,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(2,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(3,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(4,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(5,'16:00','23:00')
--3
INSERT INTO horarios (dia,inicio,fin) VALUES(1,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(2,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(3,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(4,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(5,'08:00','16:00')
--4
INSERT INTO horarios (dia,inicio,fin) VALUES(1,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(2,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(3,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(4,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(5,'16:00','23:00')

INSERT INTO horarios (dia,inicio,fin) VALUES(1,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(2,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(3,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(4,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(5,'08:00','16:00')
--2
INSERT INTO horarios (dia,inicio,fin) VALUES(1,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(2,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(3,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(4,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(5,'16:00','23:00')
--3
INSERT INTO horarios (dia,inicio,fin) VALUES(1,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(2,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(3,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(4,'08:00','16:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(5,'08:00','16:00')
--4
INSERT INTO horarios (dia,inicio,fin) VALUES(1,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(2,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(3,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(4,'16:00','23:00')
INSERT INTO horarios (dia,inicio,fin) VALUES(5,'16:00','23:00')

-- AGENDA - TURNO MAÑANA: 08 - 16
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (1,1)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (1,2)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (1,3)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (1,4)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (1,5)

INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (3,11)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (3,12)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (3,13)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (3,14)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (3,15)

INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (5,21)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (5,22)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (5,23)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (5,24)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (5,25)

INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (7,31)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (7,32)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (7,33)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (7,34)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (7,35)

INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (9,41)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (9,42)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (9,43)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (9,44)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (9,45)

INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (11,51)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (11,52)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (11,53)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (11,54)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (11,55)

INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (13,61)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (13,62)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (13,63)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (13,64)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (13,65)

INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (15,71)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (15,72)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (15,73)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (15,74)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (15,75)

-- AGENDA - TURNO TARDE: 16 - 23

INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (2,6)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (2,7)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (2,8)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (2,9)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (2,10)

INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (4,16)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (4,17)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (4,18)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (4,19)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (4,20)

INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (6,26)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (6,27)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (6,28)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (6,29)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (6,30)

INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (8,36)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (8,37)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (8,38)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (8,39)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (8,40)

INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (10,46)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (10,47)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (10,48)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (10,49)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (10,50)

INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (12,56)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (12,57)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (12,58)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (12,59)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (12,60)

INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (14,66)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (14,67)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (14,68)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (14,69)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (14,70)

INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (16,76)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (16,77)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (16,78)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (16,79)
INSERT INTO doctores_horarios (doctor_id,horarios_id) VALUES (16,80)

-- TURNOS
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-13','19:30',3,3,1)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-13','20:30',2,3,1)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-13','21:00',7,3,1)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-13','21:30',6,3,1)

INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-14','10:00',1,5,1)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-14','17:30',2,6,2)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-14','09:00',5,7,3)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-14','18:30',8,8,1)

INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-15','10:30',11,5,1)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-15','22:30',10,6,1)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-15','08:40',9,7,2)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-15','20:30',5,8,3)

INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-15','12:30',1,15,1)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-15','17:30',2,6,1)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-15','12:30',10,7,2)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-15','12:30',9,3,2)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-15','18:30',3,8,3)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-15','18:30',7,16,2)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-13','11:30',9,7,2)

INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-18','12:30',1,1,1)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-18','10:30',7,7,1)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-18','12:30',12,13,2)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-18','16:30',10,4,2)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-18','18:30',3,8,3)
INSERT INTO turnos (dia, hora, paciente_id, doctor_id, consultorio_id) VALUES('2023-09-18','17:00',5,12,2)




