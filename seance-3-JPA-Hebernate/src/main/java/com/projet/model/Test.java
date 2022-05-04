package com.projet.model;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("UP_CAT");
		ProduitDaoImpl dao=new ProduitDaoImpl();
		dao.save(new Produit((long) 80,"P1", 8000, 4));
		dao.save(new Produit((long)80,"P2", 6700, 2));
		dao.save(new Produit((long)80,"P3", 5300, 1));
		System.out.println("--------------------");
		List<Produit> prods=dao.findAll();
		for(Produit p:prods){
		System.out.println(p.getDesignation());
	}
		System.out.println("--------------------");
		System.out.println("Consulter les produits par mot clé");
		List<Produit> prods2=dao.findByDesignation("P");
		for(Produit p:prods2){
		System.out.println(p.getDesignation());
		}
		System.out.println("--------------------");
		System.out.println("modification du produit 2");
		dao.update(prods2.get(1));
		prods2=dao.findByDesignation("P");
		for(Produit p:prods2){
		System.out.println(p.getDesignation());
		}
		System.out.println("--------------------");
		System.out.println("--------------------");
		System.out.println("suppression du produit 2");
		dao.deleteById(1);
		prods2=dao.findByDesignation("P");
		for(Produit p:prods2){
		System.out.println(p.getDesignation());
		}
		System.out.println("--------------------");
}
}
