package com.example.gestorpessoal.entidades;

import java.io.Serializable;

public class Operacao implements Serializable {

    private static final long serialVersionUID = 1L;
    private Double valor;
    private String descricao;

    public Operacao(Double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
