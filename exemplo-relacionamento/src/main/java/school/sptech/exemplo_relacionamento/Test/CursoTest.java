package school.sptech.exemplo_relacionamento.Test;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
//@Data
@ToString
@Builder // é um padrão criacional de projeto
public class CursoTest {
    private Integer id;
    private String nome;
    private final String desc;

    public static void main(String[] args) {
        CursoTest curso = new CursoTest("kkkkkk");
        curso.setNome("mamam");

        CursoTest curso1 = new CursoTest(1, "bananan", "kkkkkk");

        CursoTest curso2 = CursoTest.builder()
                .nome("nanan")
                .id(2)
                .desc("ok")
                .build();
    }
}
