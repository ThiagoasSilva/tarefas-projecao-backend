package br.com.tarefas.tarefas_projecao.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.tarefas.tarefas_projecao.entity.Tarefa;
import br.com.tarefas.tarefas_projecao.repository.TarefaRepository;

@Service
public class TarefaService {
    private TarefaRepository tarefaRepository;

    // injeção de dependencia com construtor
    public TarefaService(TarefaRepository tarefaRepository){
        this.tarefaRepository = tarefaRepository;
    }

    public List<Tarefa> create(Tarefa tarefa){
        tarefaRepository.save(tarefa);
        return list();
    }   

    public List<Tarefa> list(){
        // método de ordenação de lista
        Sort sort = Sort.by("prioridade").descending().and(
            Sort.by("disciplina").ascending());
        return tarefaRepository.findAll(sort);
    }

    public List<Tarefa> update(Tarefa tarefa){
        tarefaRepository.save(tarefa);
        return list();
    }

    public List<Tarefa> delete(Integer id){
        tarefaRepository.deleteById(id);
        return list();
    }

}
