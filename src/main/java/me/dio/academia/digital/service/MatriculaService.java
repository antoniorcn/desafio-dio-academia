package me.dio.academia.digital.service;
import me.dio.academia.digital.entity.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface MatriculaService {
    Matricula create(MatriculaForm form);
    Matricula get(Long id);
    List<Matricula> getAll(@RequestParam(name = "bairro", required = false) String bairro);
    Matricula update(Long id, MatriculaUpdateForm formUpdate);
    void delete(Long id);
}
