package br.pro.bob.model;
import br.pro.bob.model.Classe;
import br.pro.bob.model.Ps;
import br.pro.bob.model.Funcionario;
import br.pro.bob.model.Salario;
import br.pro.bob.model.Sexo;
import br.pro.bob.model.FolhaDePagamento;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Principal {
    public static void main(String[] args) {
        
    Funcionario fulano = new Funcionario();
        fulano.setCpf("999.999.999-99");
        fulano.setNome("Paulo Queiroz Rocha Junior");
        fulano.setSexo(Sexo.M);
        
     Funcionario ciclano = new Funcionario();
        ciclano.setCpf("888.888.888-88");
        ciclano.setNome("Ciclano Da silva silva");
        ciclano.setSexo(Sexo.M);
        
    Classe classe = new Classe();
        classe.setId(01);
        classe.setSigla("A1");
    
    Classe classe2 = new Classe();
        classe2.setId(02);
        classe2.setSigla("E4");
  
    Ps ps = new Ps();
        ps.setId(1);
        ps.setSigla("P01");
    
     Ps ps1 = new Ps();
        ps1.setId(2);
        ps1.setSigla("P49");
                
    Salario salario = new Salario();
        salario.setId(1);
        salario.setPosicao(1);
        salario.setClasse(classe);
        salario.setValor(1326.72);
        salario.setPs(ps);
        salario.setAno(2017);
    
    Salario salario1 = new Salario();
        salario1.setId(2);
        salario1.setPosicao(4);
        salario1.setPs(ps1);
        salario1.setClasse(classe2);
        salario1.setValor(8323.87);
        salario1.setAno(2017);
        
    fulano.getSalario().add(salario);
    ciclano.getSalario().add(salario1);
    
        System.out.println("Nome: " +fulano.getNome());
        for(Salario s: fulano.getSalario()){
            System.out.println("Classe: "+s.getClasse().getSigla());
            System.out.println("Nível: "+s.getPosicao());
            System.out.println("Piso: "+s.getPs().getSigla());
            System.out.println("Salário: R$ "+s.getValor());
            System.out.println("Ano: "+s.getAno());
        }

        System.out.println("Nome: " +ciclano.getNome());
        for(Salario s: ciclano.getSalario()){
            System.out.println("Classe: "+s.getClasse().getSigla());
            System.out.println("Nível: "+s.getPosicao());
            System.out.println("Piso: "+s.getPs().getSigla());
            System.out.println("Salàrio: R$ "+s.getValor());
            System.out.println("Ano: "+s.getAno());
        }
    }
    
    
}
