package br.com.tarefas.tarefas_projecao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.tarefas.tarefas_projecao.entity.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer>{

}
