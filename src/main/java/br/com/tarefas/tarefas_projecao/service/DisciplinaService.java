package br.com.tarefas.tarefas_projecao.service;

import br.com.tarefas.tarefas_projecao.entity.Disciplina;
import br.com.tarefas.tarefas_projecao.repository.DisciplinaRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {
    private DisciplinaRepository disciplinaRepository;

    public DisciplinaService(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }

    public List<Disciplina> create(Disciplina disciplina){
        disciplinaRepository.save(disciplina);
        return list();
    }

    public List<Disciplina> list(){
        Sort sort = Sort.by("nome").ascending();
        return disciplinaRepository.findAll(sort);
    }

    public List<Disciplina> update(Disciplina disciplina){
        disciplinaRepository.save(disciplina);
        return list();
    }

    public List<Disciplina> delete(Integer id){
        disciplinaRepository.deleteById(id);
        return list();
    }
}
