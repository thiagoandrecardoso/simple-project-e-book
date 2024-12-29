package br.com.project.simpleproject.repositories;

import br.com.project.simpleproject.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
