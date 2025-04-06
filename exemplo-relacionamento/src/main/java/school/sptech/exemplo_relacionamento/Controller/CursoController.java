package school.sptech.exemplo_relacionamento.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.sptech.exemplo_relacionamento.Dto.CursoAtualizacaoDto;
import school.sptech.exemplo_relacionamento.Dto.CursoCadastroDto;
import school.sptech.exemplo_relacionamento.Dto.CursoListagemDto;
import school.sptech.exemplo_relacionamento.Dto.CursoMapper;
import school.sptech.exemplo_relacionamento.Service.CursoService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService cursoService;
    private CursoMapper cursoMapper;

    @Autowired
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @PostMapping
    public ResponseEntity<CursoListagemDto> cadastrar(@RequestBody CursoCadastroDto cursoCadastroDto){
        CursoListagemDto cursoCadastrado = cursoMapper.deCursoParaListagemDto(
                cursoService.cadastrar(
                        cursoMapper.deCadastroDTOParaCurso(
                                cursoCadastroDto
                        )
                )
        );
        return ResponseEntity.status(201).body(cursoCadastrado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Integer id){
       cursoService.deletar(id);

       return ResponseEntity.status(200).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CursoListagemDto> buscarPorId(@PathVariable Integer id){
        CursoListagemDto  cursoProcurado = cursoMapper.deCursoParaListagemDto(
                cursoService.buscarPorId(id)
        );

        return ResponseEntity.status(200).body(cursoProcurado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CursoListagemDto> atualizar(
            @PathVariable Integer id,
            @RequestBody CursoAtualizacaoDto cursoAtualizacaoDto
    ){

        CursoListagemDto cursoAtualizado = cursoMapper.deCursoParaListagemDto(
                cursoService.atualizar(
                        id,
                        cursoMapper.deAtualizacaoDtoParaCurso(cursoAtualizacaoDto)
                )
        );

        return ResponseEntity.status(200).body(cursoAtualizado);
    }

    @GetMapping
    public ResponseEntity<List<CursoListagemDto>> listar(){
        List<CursoListagemDto> cursosListagens = cursoService.listar()
                .stream()
                .map(CursoMapper::deCursoParaListagemDto)
                .toList();

        return ResponseEntity.status(200).body(cursosListagens);
    }
}
