package dev.giuliobronson.desafio_itau_backend.infra.gateways.controller.dto;

import java.io.Serializable;
import java.time.OffsetDateTime;

import dev.giuliobronson.desafio_itau_backend.domain.Transacao;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class TransacaoDto implements Serializable {

    @NotNull
    private double valor;

    @NotNull
    private OffsetDateTime dataHora;

    public TransacaoDto(Transacao transacao) {
        this.valor = transacao.getValor();
        this.dataHora = transacao.getDataHora();
    }

}
