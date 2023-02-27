/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;

import javax.swing.JOptionPane;


/**
 *
 * @author Emerson Lidio Melo
 * RA- 21020130-5
 */
public class Calculadora {

    public static void main(String[] args) {
       int opc;
       int num1;
       int num2;
       int result;
       
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a operação desejada:\n 1-Soma\n 2-Subtração\n 3-Multiplicação\n 4-Divisão\n 5-Elevar ao Quadrado\n 0-Sair"));
            
            Calculos calculos = new Calculos();
            
            if(opc == 1){
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
                result = calculos.somar(num1, num2);
                JOptionPane.showMessageDialog(null, "O resultado da soma é: " + result);
                
            }else if(opc == 2){
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
                result = calculos.subtracao(num1, num2);
                JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + result);
                
            }else if(opc == 3){
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
                result = calculos.multiplicacao(num1, num2);
                JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + result);
            
            }else if(opc == 4){
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
                result = calculos.divisao(num1, num2);
                JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + result);
            
            }else if(opc == 5){
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero:"));
                result = calculos.elevado(num1);
                JOptionPane.showMessageDialog(null, "O resultado do numero elevado ao quadrado é: " + result);
            
            }
        }while(opc != 0);
    }
}
