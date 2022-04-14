package com.example.produits.repos;

import com.example.produits.entities.Produit;

import org.springframework.data.jpa.repository.JpaRepository;
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}