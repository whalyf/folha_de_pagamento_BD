package br.pro.bob.model;
import java.util.List;
import br.pro.bob.model.Salario;
import br.pro.bob.model.Funcionario;
import java.util.ArrayList;

public class FolhaDePagamento {
    private Integer id;
    private List<Funcionario>funcionarios;
    private List<Salario>salario = new ArrayList<>();
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Salario> getSalario() {
        return salario;
    }

    public void setSalario(List<Salario> salario) {
        this.salario = salario;
    }
    
    

    }
    
