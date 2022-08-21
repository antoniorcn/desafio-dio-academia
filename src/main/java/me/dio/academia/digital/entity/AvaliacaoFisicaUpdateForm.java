package me.dio.academia.digital.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class AvaliacaoFisicaUpdateForm {
    private Long id;
    private Aluno aluno;
    private LocalDateTime dataAvaliacao = LocalDateTime.now();
    private double peso;
    private double altura;
}
