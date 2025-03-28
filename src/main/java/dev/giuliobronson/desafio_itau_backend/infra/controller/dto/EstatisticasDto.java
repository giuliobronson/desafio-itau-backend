package dev.giuliobronson.desafio_itau_backend.infra.controller.dto;

import java.io.Serializable;
import java.util.DoubleSummaryStatistics;

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
public class EstatisticasDto implements Serializable {

    private double count = .0;
    private double sum = .0;
    private double avg = .0;
    private double min = .0;
    private double max = .0;

    public EstatisticasDto(DoubleSummaryStatistics stats) {
        this.count = stats.getCount();
        this.sum = stats.getSum();
        this.avg = stats.getAverage();
        this.min = stats.getMin();
        this.max = stats.getMax();
    }

}
