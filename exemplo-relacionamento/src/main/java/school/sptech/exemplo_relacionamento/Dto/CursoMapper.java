package school.sptech.exemplo_relacionamento.Dto;

import school.sptech.exemplo_relacionamento.Entity.Curso;


public class CursoMapper {
    public CursoMapper() {
    }

    public static Curso deCadastroDTOParaCurso(CursoCadastroDto cursoCadastroDto){
        return new Curso(
                cursoCadastroDto.getNome(),
                cursoCadastroDto.getDescricao(),
                cursoCadastroDto.getPreco(),
                cursoCadastroDto.getCategoria()
        );
    }

    public static CursoCadastroDto deCursoParaCadastroDTO(Curso curso){
        return new CursoCadastroDto(
                curso.getNome(),
                curso.getDescricao(),
                curso.getPreco(),
                curso.getCategoria()
        );
    }

    public static Curso deAtualizacaoDtoParaCurso(CursoAtualizacaoDto cursoAtualizacaoDto){
        return new Curso(
                cursoAtualizacaoDto.getNome(),
                cursoAtualizacaoDto.getDescricao(),
                cursoAtualizacaoDto.getPreco(),
                cursoAtualizacaoDto.getCategoria()
        );
    }

    public static CursoAtualizacaoDto deCursoParaAtualizacaoDto(Curso curso){
        return new CursoAtualizacaoDto(
                curso.getNome(),
                curso.getDescricao(),
                curso.getPreco(),
                curso.getCategoria()
        );
    }

    public static CursoListagemDto deCursoParaListagemDto(Curso curso){
        return new CursoListagemDto(
                curso.getId(),
                curso.getNome(),
                curso.getDescricao(),
                curso.getPreco(),
                curso.getCategoria()
        );
    }
}
