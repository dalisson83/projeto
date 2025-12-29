package com.exemplo.aprovados.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.exemplo.aprovados.model.Aprovado;
public interface AprovadoRepository extends JpaRepository<Aprovado, Long> {}