package br.com.tarefas.tarefas_projecao.controller;

import br.com.tarefas.tarefas_projecao.entity.Disciplina;
import br.com.tarefas.tarefas_projecao.service.DisciplinaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {
    private DisciplinaService disciplinaService;

    public DisciplinaController(DisciplinaService disciplinaService) {
        this.disciplinaService = disciplinaService;
    }

    @PostMapping
    List<Disciplina> create(@RequestBody Disciplina disciplina){
        return disciplinaService.create(disciplina);
    }

    @GetMapping
    List<Disciplina> List(){
        return disciplinaService.list();
    }

    @PutMapping
    List<Disciplina> update(@RequestBody Disciplina disciplina){
        return disciplinaService.update(disciplina);
    }

    @DeleteMapping("{id}")
    List<Disciplina> delete(@PathVariable("id") Integer id){
        return disciplinaService.delete(id);
    }
}
