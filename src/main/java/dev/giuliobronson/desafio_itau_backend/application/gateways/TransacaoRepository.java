package dev.giuliobronson.desafio_itau_backend.application.gateways;

import java.time.OffsetDateTime;
import java.util.List;

import dev.giuliobronson.desafio_itau_backend.domain.Transacao;

public interface TransacaoRepository {

    public boolean salvarTransacao(Transacao transacao);

    public void deletarTransacao();

    public List<Transacao> filtrarPorDataHora(OffsetDateTime dataHora);

}