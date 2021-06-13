package com.example.CADASTRO.model;



import lombok.Data;
import java.util.Date;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;

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

    public Object getnome() {
    }
}
