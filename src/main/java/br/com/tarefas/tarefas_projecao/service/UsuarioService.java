package br.com.tarefas.tarefas_projecao.service;

import br.com.tarefas.tarefas_projecao.entity.Usuario;
import br.com.tarefas.tarefas_projecao.repository.UsuarioRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> create(Usuario usuario){
        usuarioRepository.save(usuario);
        return list();
    }

    public List<Usuario> list(){
        Sort sort = Sort.by("id").ascending().and(
            Sort.by("nome").ascending());
        return usuarioRepository.findAll(sort);
    }

    public List<Usuario> udpate(Usuario usuario){
        usuarioRepository.save(usuario);
        return list();
    }

    public List<Usuario> delete(Integer id){
        usuarioRepository.deleteById(id);
        return list();
    }
}
