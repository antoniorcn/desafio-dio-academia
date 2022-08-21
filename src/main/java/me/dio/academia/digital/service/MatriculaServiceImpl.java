package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.MatriculaForm;
import me.dio.academia.digital.entity.MatriculaUpdateForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class MatriculaServiceImpl implements MatriculaService {
    @Autowired
    MatriculaRepository matriculaRepository;

    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        Matricula m = new Matricula();
        Aluno a = alunoRepository.findById(form.getAlunoId()).get();
        m.setAluno(a);
        m.setDataMatricula(form.getDataMatricula());
        return matriculaRepository.save(m);
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.findById(id).get();
    }

    @Override
    public List<Matricula> getAll(@RequestParam(name = "bairro", required = false) String bairro) {
        if (bairro != null) {
            return matriculaRepository.findByAlunoMatriculadosBairro(bairro);
        } else {
            return matriculaRepository.findAll();
        }
    }

    @Override
    public Matricula update(Long id, MatriculaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {
        matriculaRepository.deleteById(id);
    }
}
