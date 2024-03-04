package org.example.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/pessoa")
public class Pessoa {
    public String listarPessoa(){
        return "Pedro Henrique Fidelis";
    }
}
