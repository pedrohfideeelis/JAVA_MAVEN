package org.example.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController //MAPEAMENTO PARA SPRING WEBMVC
@RequestMapping(value = "/api/v1/pessoa") //ENDEREÇO DE ACESSO DA API
public class PessoaResource {

    @GetMapping //GET
    public String listarPessoa(){
        log.info("Método GET"); //SOUT -> INFORMATIVO -> PASSA UM VALOR
        return "Pedro Henriqu  e Fidelis";
    }

    @PostMapping //POST -> RECEBER INFORMAÇÃO PARA GRAVAR
    public String qualquerCoisa(@RequestBody String corpoDaMensagem){ //CORPO DA MENSAGEM -> GERAMENTE JSON
        log.info("Método POST");
        log.debug("Objeto recebido: {}", corpoDaMensagem); //IMPRESSÃO DE OBJ RELACIONADO -> DETALHADO
        //PARÂMETRO É PASSADO DENTRO DA STRING -> JSON
        return "aoba";
    }
    //CONVERTE O JSON EM OBJETO E GRAVA
}
