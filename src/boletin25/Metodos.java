package boletin25;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Metodos {
    
    public static ArrayList numerosPremiados(){
        ArrayList <Integer> numerosPremiados = new ArrayList();
        int numero,cont = 0;
        while(cont<6){
            numero = (int) (Math.random() * 49) + 1;
            numerosPremiados.add(numero);
            cont++;
        }
        return numerosPremiados;
    }
    
    public static void comprobar(ArrayList <Integer> listaNumeros){
        ArrayList <Integer> numerosPremiados = numerosPremiados();
        int aciertos=0;
        String premiados = "";
        for (int i=0;i<listaNumeros.size();i++){
            for (int j=0;j<numerosPremiados.size();j++){
                if (listaNumeros.get(i)==numerosPremiados.get(j)){
                    aciertos++;
                }
            }
        }
        for (int j=0;j<numerosPremiados.size();j++){
            premiados = premiados+" "+numerosPremiados.get(j);
        }
        JOptionPane.showMessageDialog(null, "Los numeros premiados son: "+premiados+"\nHas tenido "+aciertos+" aciertos");
    }
}
