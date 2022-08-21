package me.dio.academia.digital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

    @NotBlank(message = "Preencha o campo corretamente.")
    @Positive(message="O Id precisa ser positivo")
    private Long alunoId;

    @NotBlank(message = "Preencha o campo corretamente.")
    @Positive(message="O campo precisa ser positivo")
    private double peso;

    @NotBlank(message = "Preencha o campo corretamente.")
    @Positive(message="O campo precisa ser positivo")
    private double altura;
}
