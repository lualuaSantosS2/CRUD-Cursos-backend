package school.sptech.exemplo_relacionamento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import school.sptech.exemplo_relacionamento.Entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
