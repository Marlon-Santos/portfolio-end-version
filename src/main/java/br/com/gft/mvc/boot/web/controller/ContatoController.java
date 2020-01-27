package br.com.gft.mvc.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ContatoController {
    @GetMapping("/contato")
    public String cadastro() {
        return "./contato/contato";
    }

}
