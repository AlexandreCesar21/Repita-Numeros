/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Xande Barros
 */
public class ExercicioRepita {

    public static void main(String[] args) {
       
       int numero, resultado = 0, totalValores = 0, p = 0, i = 0, acimade100 = 0;
       do{
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
         if (numero != 0) {
                resultado += numero;
                totalValores++;
            }
         
         if(resultado % 2 == 0){
             if (numero != 0) {
                 p++;
             }
         }
         
         if(resultado % 3 == 0){
             if (numero != 0) {
                 i++;
             }
         }
         
         if (numero >= 100){
             acimade100++;
         }
         
        
        
        
       } while(numero != 0);
       int media = totalValores > 0 ? resultado / totalValores : 0;
       JOptionPane.showMessageDialog(null, "<html>Resultado final <hr> "
               + "<br> Total de Valores: " + totalValores + "<br>Total de Pares: " + p + 
               "<br>Total de Ímpares: " + i + "<br>Acima de 100: " + acimade100 + 
                       "<br>Média dos valores: " + media);
    }
    
}

