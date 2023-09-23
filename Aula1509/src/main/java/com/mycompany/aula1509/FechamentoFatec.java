/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula1509;

import java.util.List;

/**
 *
 * @author 1091392313042
 */
public class FechamentoFatec implements FechamentoLetivoInterface {

    @Override
    public Double calcularMedia(List<Double> notas) {
        Double somarnotas = 0D ;
        Double media;
        
        for (Double n : notas) {
            somarnotas += n;
        }
        
        if (notas.size() > 5) {
            media = (somarnotas/notas.size()) * 1.1;
        } else {
            media = somarnotas / notas.size();
        }
        
        return media;
    }
    
}
