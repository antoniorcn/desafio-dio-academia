package me.dio.academia.digital.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AlunoUpdateForm {
    private Long id;
    private String nome;
    private String cpf;
    private String bairro;
    private LocalDate dataNascimento;
}
