package br.com.gft.mvc.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProjetoController {
    @GetMapping("/projeto")
    public String cadastro() {
        return "./projeto/projeto";
    }

}
