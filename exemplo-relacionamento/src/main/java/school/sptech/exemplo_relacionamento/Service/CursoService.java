package school.sptech.exemplo_relacionamento.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.sptech.exemplo_relacionamento.Entity.Curso;
import school.sptech.exemplo_relacionamento.Exception.EntidadeNaoEncontradaException;
import school.sptech.exemplo_relacionamento.Exception.NaoContemCursosException;
import school.sptech.exemplo_relacionamento.Repository.CursoRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public Curso cadastrar(Curso curso){return cursoRepository.save(curso);}

    public List<Curso> listar(){
        List<Curso> cursos = cursoRepository.findAll();

        if(cursos.isEmpty()){
            throw new NaoContemCursosException("sem cursos cadastrados!");
        }

        return cursos;
    }

    public Curso buscarPorId(Integer id){
        Optional<Curso> possivelCurso = cursoRepository.findById(id);

        if(possivelCurso.isPresent()){

            Curso cursoAchado = possivelCurso.get();
            return cursoAchado;
        }

        throw new EntidadeNaoEncontradaException();
    }

    public void deletar(Integer id){


        if(cursoRepository.findById(id).isPresent()){
            cursoRepository.deleteById(id);
        }else{
            throw new EntidadeNaoEncontradaException();
        }

    }

    public Curso atualizar(Integer id, Curso curso){

        if(cursoRepository.findById(id).isPresent()){
            curso.setId(id);
            return cursoRepository.save(curso);
        }

        throw new EntidadeNaoEncontradaException();
    }


}
