package pruebasMaven.inicio;

import java.util.List;

import javax.persistence.EntityManager;

import pruebasMaven.modelo.alumno.CreateAlumno;
import pruebasMaven.modelo.alumno.DeleteAlumno;
import pruebasMaven.modelo.asignatura.CreateAsignatura;
import pruebasMaven.modelo.asignatura.ReadAsignatura;
import pruebasMaven.modelo.profesor.CreateProfesor;
import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.negocio.AsignaturaBean;
import pruebasMaven.negocio.ProfesorBean;
import pruebasMaven.util.Connection;

public class Start {

	public static void main(String[] args) {
		
		ProfesorBean monica = new ProfesorBean();
		monica.setNombre("Monica");
		
		
		AsignaturaBean lengua = new AsignaturaBean();
		lengua.setNombre("lengua");
		
		AsignaturaBean historia = new AsignaturaBean();
		historia.setNombre("historia");
		
		AsignaturaBean filosofia = new AsignaturaBean();
		filosofia.setNombre("filosofia");

		AsignaturaBean mates = new AsignaturaBean();
		mates.setNombre("mates");
		


		monica.addAsignatura(lengua);
		monica.addAsignatura(filosofia);
		
		 
		
		
		
		AlumnoBean maria = new AlumnoBean();
		maria.setNombre("Maria");
		maria.setCiudad("Oviedo");
		maria.setTelefono("666555444");
		
		AlumnoBean marcos = new AlumnoBean();
		marcos.setNombre("Marcos");
		marcos.setCiudad("Oviedo");
		marcos.setTelefono("666555444");

		
		filosofia.addAlumno(marcos);
		filosofia.addAlumno(maria);
		
		
		
		
	
		CreateProfesor createProfesor = new CreateProfesor();
		createProfesor.create(monica);		
		
		
		CreateAlumno createAlumno = new CreateAlumno();
		createAlumno.create(marcos);
		createAlumno.create(maria);
		
		
		CreateAsignatura createAsignatura = new CreateAsignatura();
		createAsignatura.create(lengua);
		createAsignatura.create(mates);
		createAsignatura.create(historia);
		createAsignatura.create(filosofia);
		
		

	
		
	}

}
