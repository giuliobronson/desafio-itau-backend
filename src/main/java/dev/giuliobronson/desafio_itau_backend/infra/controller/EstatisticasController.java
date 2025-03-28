package dev.giuliobronson.desafio_itau_backend.infra.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.giuliobronson.desafio_itau_backend.application.usecases.CalcularEstatisticasUseCase;
import dev.giuliobronson.desafio_itau_backend.infra.controller.dto.EstatisticasDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/estatistica")
public class EstatisticasController {

    private final CalcularEstatisticasUseCase usecase;

    public EstatisticasController(CalcularEstatisticasUseCase usecase) {
        this.usecase = usecase;
    }

    @GetMapping()
    public ResponseEntity<EstatisticasDto> calcularEstatisticas() {
        var stats = usecase.calcularEstatisticas();
        return ResponseEntity.ok(new EstatisticasDto(stats));
    }

}
