package dev.giuliobronson.desafio_itau_backend.infra;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/transacao")
public class TransacaoController {

    @PostMapping
    public String receberTransacao(@RequestBody String entity) {
        return entity;
    }
    

}
