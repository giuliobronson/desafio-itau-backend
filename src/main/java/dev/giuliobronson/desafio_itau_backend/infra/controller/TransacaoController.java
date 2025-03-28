package dev.giuliobronson.desafio_itau_backend.infra.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import dev.giuliobronson.desafio_itau_backend.application.gateways.TransacaoRepository;
import dev.giuliobronson.desafio_itau_backend.domain.Transacao;
import dev.giuliobronson.desafio_itau_backend.infra.controller.dto.ReceberTransacaoDto;
import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {

    public final TransacaoRepository repository;

    public TransacaoController(TransacaoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<?> receberTransacao(@Valid @RequestBody ReceberTransacaoDto dto, UriComponentsBuilder uriBuilder) {
        var transacao = new Transacao(dto);
        var uri = uriBuilder.path("/transacao/{id}").buildAndExpand(transacao.getId()).toUri();
        repository.salvarTransacao(transacao);
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping()
    public ResponseEntity<?> deletarTransacao() {
        repository.deletarTransacao();
        return ResponseEntity.ok().build();
    }

}
