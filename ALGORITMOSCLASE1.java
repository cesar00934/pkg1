/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmos.clase.pkg1;

import java.util.Scanner;


/**
 *
 * @author User
 */
public class ALGORITMOSCLASE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner a = new Scanner(System.in);
    char datos[][]=new char [10][10];
    int t=1;
    for (int f = 0; f < 10; f++) {
        for (int c = 0; c < 10; c++) {
            datos[f][c]='K';}}
        System.out.println("Bienvenido al CinePlus\nA continuavion le mostramos los asientos\n\"k\" Es libre y \"L\" es reservado");
    esquema(datos); 
      
    while(t==1){
        System.out.println("Ingrese fila y asiento");
        System.out.println("ingrese fila del (0a9)");
        int e=a.nextInt();
            if(e>=0 && e<10){ 
                System.out.println("Bien,numero valido");
                System.out.println("Ingrese asiento del (0a9)");
                int o=a.nextInt();
                if(o>=0 && o<10){  
                    if(o!=datos[e][o] && e!=datos[e][o] ){
                        if( datos[e][o]=='K'){
                            datos[e][o]='L';
                            esquema(datos); 
                            System.out.println("Asiento reservado \n Desea 1.Salir 2.Continuar comprando");
                            int w=a.nextInt();
                            if (w==1){
                                break;}}
                    else{
                        System.out.println("El asiento ya esta reservado");}}
                }
                else{
                     System.out.println("Ingrese un numero de asiento valido");}}
            else{
                System.out.println("Ingrese un numero de fila valido");}
    }
    }
    static void esquema(char datos[][]){
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+i);
            for (int j = 0; j < 10; j++) {
                System.out.print("[ "+datos[i][j]+" "+"]");}
                    System.out.println(" ");}}
}
