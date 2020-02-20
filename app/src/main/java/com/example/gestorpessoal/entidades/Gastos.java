package com.example.gestorpessoal.entidades;

import java.io.Serializable;
import java.util.ArrayList;

public class Gastos implements Serializable {

    private ArrayList<Operacao> listaGastos = new ArrayList<>();;

    public Gastos() {

    }
    public ArrayList<Operacao> getListaGastos() {
        return listaGastos;
    }
    public void addOperacao(Double valor, String descricao) {
        listaGastos.add(new Operacao(valor, descricao));
    }
}
