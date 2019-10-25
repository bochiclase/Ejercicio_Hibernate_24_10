package pruebasMaven.modelo.asignatura;

import javax.persistence.EntityManager;
import pruebasMaven.negocio.AsignaturaBean;
import pruebasMaven.util.Connection;



public class CreateAsignatura {

	public void create(AsignaturaBean asignatura) {
		
		EntityManager entityManager = Connection.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(asignatura);
		entityManager.getTransaction().commit();
	}

}
