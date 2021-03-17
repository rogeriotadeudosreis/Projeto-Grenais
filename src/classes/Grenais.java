/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Scanner;
/**
 *
 * @author roger
 */
public class Grenais {

    public static void main(String[] args) {

        int grenais = 0;
        int gremio, vitoriaGremio = 0;
        int inter, vitoriaInter = 0;      
        int resp;
        int empate = 0;
        String vencedor = "", semVencedor = "";

        Scanner teclado = new Scanner(System.in);

        do {
          //  System.out.println("Gols do Inter --> ");
            inter = teclado.nextInt();
          //  System.out.println("Gols do Grêmio --> ");
            gremio = teclado.nextInt();

            if (inter > gremio) {
                vitoriaInter++;
                vencedor = "Inter";
            } else if(gremio > inter) {
                vitoriaGremio++;
                vencedor = "Gremio";
            }
            if (inter == gremio){
                empate++;
                semVencedor = "Nao houve vencedor";
            }

           // System.out.println("Novo Grenal ? (1-sim 2-não)");
            resp = teclado.nextInt();
            grenais++;            
            
        } while (resp != 2);
        
        for (int i = 0; i < grenais; i++) {
            System.out.println("Novo grenal (1-sim 2-nao)");
        }
        
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vitoriaInter);
        System.out.println("Gremio:" + vitoriaGremio);
        System.out.println("Empates:" + empate);
        
        if (vitoriaInter != vitoriaGremio){
        System.out.println(vencedor + " venceu mais");
        }
        else{
            System.out.println(semVencedor);
        }

    }
}
