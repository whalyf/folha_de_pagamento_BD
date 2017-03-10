package br.pro.bob.model;

import br.pro.bob.model.Classe;
import br.pro.bob.model.Ps;
import br.pro.bob.model.Ano;
import java.util.ArrayList;
import java.util.List;

public class Salario {
    private Integer id;
    private Integer posicao;
    private Double valor;
    private Classe classe;
    private Ps Ps;
    private Funcionario funcionario;
    private int ano;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Ps getPs() {
        return Ps;
    }

    public void setPs(Ps Ps) {
        this.Ps = Ps;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
}
