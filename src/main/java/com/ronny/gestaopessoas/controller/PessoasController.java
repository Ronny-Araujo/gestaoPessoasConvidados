package com.ronny.gestaopessoas.controller;

import com.ronny.gestaopessoas.model.Pessoa;
import com.ronny.gestaopessoas.repositorio.pessoasRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PessoasController {

    @Autowired
    private pessoasRepositorio pessoasRepositorio;

    @GetMapping("/pessoas")
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("html");
        modelAndView.addObject(new Pessoa());
        modelAndView.addObject("lista", pessoasRepositorio.findAll());
        return modelAndView;
    }

    @PostMapping("/pessoas")
    public String salvar(Pessoa pessoa) {
        pessoasRepositorio.save(pessoa);
        return "redirect:/pessoas";
    }
}
