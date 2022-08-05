# microservicio-aula

# CREAR TABLA
# create table detalle_aula(
# 	id_alumno int NOT NULL,
# 	id_aula int NOT NULL,
#  	FOREIGN KEY(id_aula ) REFERENCES aula (id_aula )  on delete cascade on update cascade,
# 	FOREIGN KEY(id_alumno ) REFERENCES alumnos( id_alumno )  on delete cascade on update cascade
# )