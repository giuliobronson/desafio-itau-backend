package dev.giuliobronson.desafio_itau_backend.infra.controller.dto;

import java.io.Serializable;
import java.time.OffsetDateTime;

import dev.giuliobronson.desafio_itau_backend.domain.Transacao;
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
public class DetalharTransacaoDto implements Serializable {

    private String id;
    private double valor;
    private OffsetDateTime dataHora;

    public DetalharTransacaoDto(Transacao transacao) {
        this.id = transacao.getId();
        this.valor = transacao.getValor();
        this.dataHora = transacao.getDataHora();
    }

}
