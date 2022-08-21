package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AlunoForm;
import me.dio.academia.digital.entity.AlunoUpdateForm;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.infra.utils.JavaTimeUtils;
import me.dio.academia.digital.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoServiceImpl implements AlunoService {
    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno a = new Aluno();
        a.setNome(form.getNome());
        a.setCpf(form.getCpf());
        a.setBairro(form.getBairro());
        a.setDataNascimento(form.getDataNascimento());
        return alunoRepository.save(a);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        return alunoRepository.findAll();
    }

    @Override
    public List<Aluno> getAll(String dataNascimento) {
        LocalDate data = LocalDate.parse(dataNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
        return alunoRepository.findByDataDeNascimento(data);
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        Optional<Aluno> a = alunoRepository.findById(id);
        if (a.isPresent()) {
            return a.get().getAvaliacoes();
        }
        return new ArrayList<AvaliacaoFisica>();
    }
}
