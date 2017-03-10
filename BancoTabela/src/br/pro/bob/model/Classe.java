package br.pro.bob.model;

import java.util.ArrayList;

public class Classe {
    private Integer id;
    private String sigla;

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }
    
    ArrayList<String>siglas = new ArrayList<>();
        
}
