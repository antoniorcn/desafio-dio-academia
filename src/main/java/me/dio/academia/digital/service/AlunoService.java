package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AlunoForm;
import me.dio.academia.digital.entity.AlunoUpdateForm;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AlunoService {
    Aluno create(AlunoForm form);
    Aluno get(Long id);
    List<Aluno> getAll();
    List<Aluno> getAll(String dataNascimento);
    Aluno update(Long id, AlunoUpdateForm formUpdate);
    void delete(Long id);
    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
