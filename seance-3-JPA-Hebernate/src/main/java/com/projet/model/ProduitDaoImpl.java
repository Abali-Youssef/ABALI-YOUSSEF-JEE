package com.projet.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transactional;


public class ProduitDaoImpl implements IProduitDao{
	private EntityManager entityManager;
	
	public ProduitDaoImpl() {
	
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("UP_CAT");
	entityManager=entityManagerFactory.createEntityManager();}
	@Transactional
	public void save(Produit p) {
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		try {

		/* enregister le produit p dans la base de donnees */
		entityManager.persist(p);
		/* Valider la transaction si tout se passe bien */

		transaction.commit();

		} catch (Exception e) {
		/* Annuler la transaction en cas d exception */

		transaction.rollback();
		e.printStackTrace();

		}
		
	}

	public List<Produit> findAll() {
		Query query=entityManager.createQuery("select p from Produit p");
		return query.getResultList();
	}

	public List<Produit> findByDesignation(String mc) {
		Query query=entityManager.createQuery("select p from Produit p where p.designation like :x");
		query.setParameter("x", "%"+mc+"%");
		return query.getResultList();
	}

	public Produit findByID(Long id) {
		Produit p=entityManager.find(Produit.class, id);
		return p;
	}

	public void update(Produit p) {
		entityManager.merge(p);
		
	}

	public void deleteById(int idP) {
		Produit p=entityManager.find(Produit.class, idP);
		entityManager.remove(p);
		
	}
	
}
