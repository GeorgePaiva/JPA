package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class AlteraSaldoContaGeorge {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();

		Conta contaDoGeorge = em.find(Conta.class, 1L);

		em.getTransaction().begin();
		
		contaDoGeorge.setTitular("George");
		contaDoGeorge.setSaldo(20.0);

		em.getTransaction().commit();

	}
}