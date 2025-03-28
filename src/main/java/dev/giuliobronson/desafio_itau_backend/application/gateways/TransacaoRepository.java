package dev.giuliobronson.desafio_itau_backend.application.gateways;

import dev.giuliobronson.desafio_itau_backend.domain.Transacao;

public interface TransacaoRepository {

    public boolean salvarTransacao(Transacao transacao);

    public boolean deletarTransacao(String id);

}