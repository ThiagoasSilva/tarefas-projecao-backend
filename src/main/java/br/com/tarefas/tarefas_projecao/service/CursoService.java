package br.com.tarefas.tarefas_projecao.service;

import br.com.tarefas.tarefas_projecao.entity.Curso;
import br.com.tarefas.tarefas_projecao.repository.CursoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    private CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> create(Curso curso){
        cursoRepository.save(curso);
        return list();
    }

    public List<Curso> list(){
        Sort sort = Sort.by("nome").ascending();
        return cursoRepository.findAll(sort);
    }

    public List<Curso> update(Curso curso){
        cursoRepository.save(curso);
        return list();
    }

    public List<Curso> delete(Integer id){
        cursoRepository.deleteById(id);
        return list();
    }
}
