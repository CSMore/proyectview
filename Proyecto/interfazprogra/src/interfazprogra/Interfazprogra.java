/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazprogra;


public class Interfazprogra {
private  static forminterfaz formulario;
private static Persona persona[];
private static int contador;
    public static void main(String[] args) {
        formulario =new forminterfaz();
        persona= new Persona[20];
       for(int i=0;i<20;i++){
           persona[i]=new Persona();
                   
           
       }
       contador = 0;
       formulario.setVisible(true);
    
    
    }
      public static void guardar(String n,String a,String c){
        persona[contador].setNombre(n);
        persona[contador].setApellido(a);
        persona[contador].setNickname(c);
       
        contador++;
      } 

}