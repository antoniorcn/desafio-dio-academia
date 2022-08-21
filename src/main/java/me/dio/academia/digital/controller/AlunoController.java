package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AlunoForm;
import me.dio.academia.digital.entity.AlunoUpdateForm;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @GetMapping
    public List<Aluno> getAll(@RequestParam(name = "dataDeNascimento", required = false) String dataNascimento) {
        if (dataNascimento != null) {
            return service.getAll(dataNascimento);
        } else {
            return service.getAll();
        }
    }

    @PostMapping Aluno create(@RequestBody AlunoForm form) {
        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvavaliacaoFisicaId(@PathVariable Long id) {
        return service.getAllAvaliacaoFisicaId(id);
    }

    @PostMapping Aluno update(@RequestBody AlunoUpdateForm form) {
        return service.update(form.getId(), form);
    }


}
