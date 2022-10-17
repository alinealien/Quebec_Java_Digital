package one.digitalinnovation.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String hello(){
        return "Olá, Québec Java Digital e Digital Innovation One. Obrigada pela oportunidade de aprender sempre mais.";

        //O que fazer para que o Spring considere isso como um endpoint REST?
        //Anotar a classe como @RestController ele vai ler determinados metodos que tem determinadas anotações
        //@GetMapping : uma notação composta que atua como um atalho para @RequestMapping (method = RequestMethod. GET). Apresentou a frase no localhost:8080
        //@requestMapping : deixar explicito (o mapeamento do endpoint)
    }
}
