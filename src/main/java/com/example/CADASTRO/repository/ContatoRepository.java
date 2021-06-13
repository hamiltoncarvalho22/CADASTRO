package com.example.CADASTRO.repository;


import com.example.CADASTRO.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface ContatoRepository extends JpaRepository<Contato, String> {


    void remove(Contato contato);

    void add(Contato contato);
}