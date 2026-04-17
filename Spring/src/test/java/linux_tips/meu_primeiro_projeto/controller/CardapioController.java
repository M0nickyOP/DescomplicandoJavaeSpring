package linux_tips.meu_primeiro_projeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cardapio")

public class CardapioController {
    //requisicoes chegam por aqui

        @GetMapping
        @ResponseStatus
        public String getCardapio(){
        return "Esse é o meu cardapio";
    }
}
