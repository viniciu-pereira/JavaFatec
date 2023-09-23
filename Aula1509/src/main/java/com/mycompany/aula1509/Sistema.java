/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula1509;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1091392313042
 */
public class Sistema {
    
    public static void main(String...strings) {
        FechamentoFatec fechamento = new FechamentoFatec();
        
        List<Double> notas = new ArrayList<Double>();
        notas.add(5.0);
        notas.add(6.0);
        notas.add(7.0);
        notas.add(8.0);
        notas.add(9.0);
        notas.add(4.0);
        
        Double media = fechamento.calcularMedia(notas);
        System.out.println("Notas: " + media);
    }
    
}
