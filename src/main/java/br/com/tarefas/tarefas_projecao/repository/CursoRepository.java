package br.com.tarefas.tarefas_projecao.repository;

import br.com.tarefas.tarefas_projecao.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
