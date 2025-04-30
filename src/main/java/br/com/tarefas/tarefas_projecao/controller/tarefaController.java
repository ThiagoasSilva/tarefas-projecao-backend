package br.com.tarefas.tarefas_projecao.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tarefas.tarefas_projecao.entity.Tarefa;
import br.com.tarefas.tarefas_projecao.service.TarefaService;

@RestController
@RequestMapping("/tarefas")
public class tarefaController {

    private TarefaService tarefaService;

    public tarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @PostMapping
    List<Tarefa> create(@RequestBody Tarefa tarefa){
        return tarefaService.create(tarefa);
    }

    @GetMapping
    List<Tarefa> list(){
        return tarefaService.list();
    }

    @PutMapping
    List<Tarefa> update(@RequestBody Tarefa tarefa){
     return tarefaService.update(tarefa);
    }

    @DeleteMapping("{id}")
    List<Tarefa> delete(@PathVariable("id") Integer id){
        return tarefaService.delete(id);
    }

}
