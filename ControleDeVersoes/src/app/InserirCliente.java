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
		
		c.setNome("David Soares dos Santos");
		
		c.setEmail("David@qualidadesoftware.com.br");
		
		Cliente c1 = new Cliente();
		
		c1.setNome("Fernando Piovesan");
		c1.setEmail("piovesan@qualidadedesoftware.com.br");
		
		Cliente c2 = new Cliente();
		
		c2.setNome("Rafael Monteiro");
		
		c2.setEmail("rafael@qualidadedesoftware.com.br");
		
		manager.persist(c);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
	}

}
