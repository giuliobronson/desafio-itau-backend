package dev.giuliobronson.desafio_itau_backend.application.gateways;

import dev.giuliobronson.desafio_itau_backend.domain.Transacao;

public interface TransacaoRepository {

    public void salvarTransacao(Transacao transacao);

    public void deletarTransacao(String id);

}