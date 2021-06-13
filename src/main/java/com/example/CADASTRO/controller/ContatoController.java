package com.example.CADASTRO.controller;

import com.example.CADASTRO.model.Contato;
import com.example.CADASTRO.repository.ContatoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.text.AttributedString;

@Controller
class ContatoController {

    private ContatoRepository contatos;
    public ContatoController(ContatoRepository Contatos)   {
        this.contatos = contatos;
    }

    @GetMapping("/exibirContato")
    public String exibirForm(Contato contato) {
        return "contatos-form";
    }

    @PostMapping("/salvarContato")
    public String salvarContato(Contato contato) {
        this.contatos.remove(contato);
        this.contatos.add(contato);
        return "redirect:/ListarContatos";
    }

    @GetMapping("/ListarContatos")
    public String listarContatos(Model model);{
        AttributedString model;
        model.addAttribute("Lista",contatos);
    return"contatos-list";
    }
    @GetMapping("/removerContato")
    public String removerContato(String nome){
        Contato contatoParaRemover = null;
        for(Contato cont : this.contatos){
            if(cont.getnome().equals(nome)) {
                contatoParaRemover = cont;
            }
        }
        if (contatoParaRemover !=null) {
            this.contatos.remove(contatoParaRemover);
        }
        return "redirect:/listarContatos";
    }
    @GetMapping("/editarContato")
    public String editarContatos(String nome, Model model){
        Contato contatoParaEditar = null;
        for(Contato cont : this.contatos){
            if(cont.getnome().equals(nome)) {
                contatoParaEditar = cont;
            }
        }
        model.addAttribute("contato", contatoParaEditar);
        return "contatos-form";
    }


}

