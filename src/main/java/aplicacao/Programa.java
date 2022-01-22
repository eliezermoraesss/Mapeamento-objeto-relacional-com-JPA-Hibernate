package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		//Pessoa p = em.find(Pessoa.class, 2);
		
		//System.out.println(p);		

		System.out.println("Pronto!");
		em.close();
		emf.close();
				
		/*Pessoa p1 = new Pessoa(null, "Eliezer Moraes", "eli@outlook.com");
		Pessoa p2 = new Pessoa(null, "Alex", "alex@outlook.com");
		Pessoa p3 = new Pessoa(null, "Bob", "bob@outlook.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Pronto!");
		em.close();
		emf.close();*/

	}

}
