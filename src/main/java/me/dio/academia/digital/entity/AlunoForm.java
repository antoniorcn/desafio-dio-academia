package me.dio.academia.digital.entity;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class AlunoForm {

    @NotBlank(message = "Preencha o campo corretamente.")
    @Size(min=3, max = 100, message="'${validadtedValue}' precisa ter entre {min} e {max} caracteres.")
    private String nome;

    @NotBlank(message = "Preencha o cpf corretamente.")
    @CPF(message = "'${validatedValue}' número de CPF inválido")
    private String cpf;

    @NotBlank(message = "Preencha o campo corretamente.")
    @Size(min=3, max = 50, message="'${validadtedValue}' precisa ter entre {min} e {max} caracteres.")
    private String bairro;

    @NotNull(message = "Preencha o campo corretamente.")
    @Past(message="Data '${validadtedValue}' é invalida.")
    private LocalDate dataNascimento;
}
