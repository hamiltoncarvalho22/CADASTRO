package com.example.CADASTRO.repository;


import com.example.CADASTRO.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {



    void remove(Contato contato);

    void add(Contato contato);
}