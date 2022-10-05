package br.com.lab.impacta.investment.infrastructure.repository;

import br.com.lab.impacta.investment.domain.model.Investment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestmentRepository extends JpaRepository<Investment, Long> {
}
