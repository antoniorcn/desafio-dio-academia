package me.dio.academia.digital.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;

@Data
public class MatriculaForm {

    @NotBlank(message = "Preencha o campo corretamente.")
    @Positive(message="O Id precisa ser positivo")
    private Long alunoId;

    @NotNull(message = "Preencha o campo corretamente.")
    @Past(message="Data '${validadtedValue}' é invalida.")
    private LocalDateTime dataMatricula;
}
