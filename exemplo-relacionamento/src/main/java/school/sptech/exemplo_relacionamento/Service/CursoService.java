package school.sptech.exemplo_relacionamento.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import school.sptech.exemplo_relacionamento.Entity.Curso;
import school.sptech.exemplo_relacionamento.Repository.CursoRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoService {
    private final CursoRepository cursoRepository;

    public Curso cadastrar(Curso curso){

        return cursoRepository.save(curso);
    }

    public List<Curso> listar(){
        List<Curso> cursos = cursoRepository.findAll();
        if (cursos.isEmpty()){
            return null;
        }
        return null;
    }
}
