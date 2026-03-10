package com.poo.prjeqseggrau_pooi;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class PrjEqSegGrau_POOI {

    public static void main(String[] args) {
        
         Scanner menu = new Scanner(System.in);
         
         DadosEntrada de = new DadosEntrada();
         
         System.out.println("Digete o valor de A: ");
         de.setA(menu.nextDouble());
         System.out.println("Digete o valor de B: ");
         de.setB(menu.nextDouble());
         System.out.println("Digete o valor de C: ");
         de.setC(menu.nextDouble());
         
         /*de.setA(5);
         de.setB(6);
         de.setC(1);
         
         System.out.println("A: " + de.getA());
         System.out.println("B: " + de.getB());
         System.out.println("C: " + de.getC());
         
         CalcularEqSeqGrau esg = new CalcularEqSeqGrau();
         DadosSaida ds = esg.delta(de);
         esg.x1L(de);
         esg.x2L(de);
         esg.xV(de);
         esg.yV(de);*/
         
         DadosSaida ds = new DadosSaida();
         CalcularEqSeqGau2 esg2 = new CalcularEqSeqGau2();
         
         esg2.delta(de, ds);
         esg2.x1L(de, ds);
         esg2.x2L(de, ds);
         esg2.xV(de, ds);
         esg2.yV(de, ds);
         
         System.out.println("Delta: "+ds.getDelta());
         System.out.println("X': "+ds.getX1L());
         System.out.println("X'': "+ds.getX2L());
         System.out.println("xv: "+ds.getxV()); 
         System.out.println("Delta: "+ds.getyV());

    }
}
