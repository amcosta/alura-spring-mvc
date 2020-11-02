package br.com.alura.mvc.mudi.repository;

import br.com.alura.mvc.mudi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
