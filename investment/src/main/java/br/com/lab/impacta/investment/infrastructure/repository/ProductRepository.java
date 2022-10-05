package br.com.lab.impacta.investment.infrastructure.repository;

import br.com.lab.impacta.investment.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
