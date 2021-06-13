package com.example.CADASTRO.model;



import lombok.Data;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contato")
@Data
public class Contato {

    @Id
    private String id;

    private String nome;

    private String cpf;

    private final ThreadLocal<Date> datanascimento = new ThreadLocal<Date>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return nome.equals(contato.nome);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", datanascimento=" + datanascimento +
                ", cpf='" + cpf + '\'' +
                '}';
    }


}
