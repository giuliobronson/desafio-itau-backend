package dev.giuliobronson.desafio_itau_backend.application.usecases;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;

import org.springframework.stereotype.Service;

import dev.giuliobronson.desafio_itau_backend.application.gateways.TransacaoRepository;
import dev.giuliobronson.desafio_itau_backend.domain.Transacao;

@Service
public class CalcularEstatisticasUseCase {

    private final TransacaoRepository repository;

    public CalcularEstatisticasUseCase(TransacaoRepository repository) {
        this.repository = repository;
    }

    public DoubleSummaryStatistics calcularEstatisticas(int seconds) {
        var transacoes = repository.filtrarPorDataHora(OffsetDateTime.now().minusSeconds(seconds));
        var stats = transacoes.stream().mapToDouble(Transacao::getValor).summaryStatistics();
        return stats;
    }

}
