package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartCities");
		EntityManager em = fabrica.createEntityManager();
		
		em.close();
		fabrica.close();
	}
}
