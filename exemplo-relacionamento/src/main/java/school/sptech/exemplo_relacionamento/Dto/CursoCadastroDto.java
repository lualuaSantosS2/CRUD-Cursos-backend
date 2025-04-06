package school.sptech.exemplo_relacionamento.Dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

public class CursoCadastroDto {
    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    @NotBlank
    @DecimalMin("1.00")
    private Double preco;
    @NotBlank
    private String categoria;

    public CursoCadastroDto() {
    }

    public CursoCadastroDto(String nome, String descricao, Double preco, String categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
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
