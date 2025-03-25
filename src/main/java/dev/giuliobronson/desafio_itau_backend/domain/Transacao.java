package dev.giuliobronson.desafio_itau_backend.domain;

import java.time.OffsetDateTime;
import java.util.UUID;

import lombok.Getter;

@Getter
public class Transacao {

    private String id;
    private double valor;
    private OffsetDateTime dataHora;

    public Transacao(double valor, OffsetDateTime dataHora) {
        this.id = UUID.randomUUID().toString();
        this.valor = validarValorDaTransacao(valor);
        this.dataHora = validarTempoDaTransacao(dataHora);
    }

    public OffsetDateTime validarTempoDaTransacao(OffsetDateTime dataHora) {
        if (dataHora.isAfter(OffsetDateTime.now())) {
            throw new IllegalArgumentException("A data não pode acontecer no futuro");
        }
        return dataHora;
    }

    public double validarValorDaTransacao(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor da transação não pode ser negativo");
        }
        return valor;
    }

}
