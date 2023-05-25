package com.soulcode.vendas.repositories;

import com.soulcode.vendas.models.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {
    @Query(value = "SELECT * FROM venda WHERE cliente_id = ?", nativeQuery = true)
    public List<Venda> findByIdCliente(Long idCliente);
}
