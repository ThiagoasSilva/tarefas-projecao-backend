package br.com.tarefas.tarefas_projecao.controller;

import br.com.tarefas.tarefas_projecao.entity.Curso;
import br.com.tarefas.tarefas_projecao.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @PostMapping
    List<Curso> create(@RequestBody Curso curso){
        return cursoService.create(curso);
    }

    @GetMapping
    List<Curso> List(){
        return cursoService.list();
    }

    @PutMapping
    List<Curso> update(@RequestBody Curso curso){
        return cursoService.update(curso);
    }

    @DeleteMapping("{id}")
    List<Curso> delete(@PathVariable Integer id){
        return cursoService.delete(id);
    }
}
