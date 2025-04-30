package br.com.tarefas.tarefas_projecao.controller;

import br.com.tarefas.tarefas_projecao.entity.Usuario;
import br.com.tarefas.tarefas_projecao.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @PostMapping
    List<Usuario> create(@RequestBody Usuario usuario){
        return usuarioService.create(usuario);
    }

    @GetMapping
    List<Usuario> List(){
        return usuarioService.list();
    }

    @PutMapping
    List<Usuario> update(@RequestBody Usuario usuario){
        return usuarioService.udpate(usuario);
    }

    @DeleteMapping("{id}")
    List<Usuario> delete(@PathVariable("id") Integer id){
        return usuarioService.delete(id);
    }
}
