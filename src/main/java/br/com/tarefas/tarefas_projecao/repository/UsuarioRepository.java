package br.com.tarefas.tarefas_projecao.repository;

import br.com.tarefas.tarefas_projecao.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
