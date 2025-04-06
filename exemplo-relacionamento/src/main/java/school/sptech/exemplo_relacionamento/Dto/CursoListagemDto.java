package school.sptech.exemplo_relacionamento.Dto;

import jakarta.validation.constraints.NotBlank;

public class CursoListagemDto {
    @NotBlank
    private Integer id;
    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    @NotBlank
    private Double preco;
    @NotBlank
    private String categoria;

    public CursoListagemDto() {
    }

    public CursoListagemDto(Integer id, String nome, String descricao, Double preco, String categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
