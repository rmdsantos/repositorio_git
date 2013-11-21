package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Cliente;

public class InserirCliente {

	
	public static void main(String[] args) {

		EntityManagerFactory factory =
				Persistence.createEntityManagerFactory("qualidade");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Cliente c = new Cliente();
		
		c.setNome("Rafael Monteiro");
		
		c.setEmail("rafael@qualidadesoftware.com.br");
		
		manager.persist(c);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
	}

}
