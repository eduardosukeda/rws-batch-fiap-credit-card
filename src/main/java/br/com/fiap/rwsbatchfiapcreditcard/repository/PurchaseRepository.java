package br.com.fiap.rwsbatchfiapcreditcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.rwsbatchfiapcreditcard.entity.Card;
import br.com.fiap.rwsbatchfiapcreditcard.entity.Purchase;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

	public List<Purchase> findByCard(Card card);
}
