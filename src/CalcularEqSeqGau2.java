/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prjeqseggrau_pooi;

/**
 *
 * @author Iftm
 */
public class CalcularEqSeqGau2 {
    
    public void delta(DadosEntrada de, DadosSaida ds){
        ds.setDelta(de.getB()*de.getB() - (4*de.getA()* de.getC()));    
    }
    
    public void x1L(DadosEntrada de, DadosSaida ds){
        ds.setX1L(((-de.getB()) + Math.sqrt(ds.getDelta())) / (2*de.getA()));
    }
    
    public void x2L(DadosEntrada de, DadosSaida ds){
        ds.setX2L(((-de.getB()) - Math.sqrt(ds.getDelta())) / (2*de.getA()));
    }
    
    public void xV(DadosEntrada de, DadosSaida ds){
        ds.setxV(-de.getB() / (2*de.getA()));
    }
    
    public void yV(DadosEntrada de, DadosSaida ds){
        ds.setyV(-ds.getDelta() / (4*de.getA()));
    }
    
}
