
package pruebasMaven.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pruebasMaven.negocio.AlumnoBean;

public class Connection {

	private static EntityManager entityManager = null;
	
	private Connection() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.marcos.pruebasMaven.H2");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	
	public static EntityManager getEntityManager() {
		
		if(entityManager==null) {
			
			new Connection();
		}
		return entityManager;
	} 
}
