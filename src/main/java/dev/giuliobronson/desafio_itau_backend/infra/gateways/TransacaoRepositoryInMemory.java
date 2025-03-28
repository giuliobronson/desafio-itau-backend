package dev.giuliobronson.desafio_itau_backend.infra.gateways;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.giuliobronson.desafio_itau_backend.application.gateways.TransacaoRepository;
import dev.giuliobronson.desafio_itau_backend.domain.Transacao;

@Service
public class TransacaoRepositoryInMemory implements TransacaoRepository {

    private final List<Transacao> transacoes = new ArrayList<Transacao>();

    @Override
    public void salvarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    @Override
    public void deletarTransacao(String id) {
        // Auto-generated method stub
    }

}
