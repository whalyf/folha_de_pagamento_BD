
package br.pro.bob.model;

import br.pro.bob.model.Salario;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa{
    private String id;
    private List<Salario>salario = new ArrayList<>();
    private List<Funcionario>folha;

    public List<Funcionario> getFuncionario() {
        return folha;
    }

    public void setFuncionario(List<Funcionario> Funcionario) {
        this.folha = folha;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<Salario> getSalario() {
        return salario;
    }

    public void setSalario(List<Salario> salario) {
        this.salario = salario;
    }

    public List<Funcionario> getFolha() {
        return folha;
    }

    public void setFolha(List<Funcionario> folha) {
        this.folha = folha;
    }
        
}
