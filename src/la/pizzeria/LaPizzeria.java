/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la.pizzeria;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author jose
 */
public class LaPizzeria {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  
       
         
      boolean TipoPiza = true;
      
         
      molde[]simple=new molde [1];
         
      while(TipoPiza ){
         
         System.out.println("       Elija el tipo de piza que quiere  "+"\n"+
                                                 "\n"+
                                     "  Vegetariana"   +"\n" +
                                                "\n"+
                                     "  Peperoni" +"\n" +
                                              "\n"+
                                     "  queso " );
          
      
            String escoja =  JOptionPane.showInputDialog("Escriba el tipo de pizza que quiere  Vegetariana,  Peperoni o Queso");
                
              if( escoja.equalsIgnoreCase("Vegetariana")){
                
                 String[] ingredientes1 = {"\n","mozzarella,  ","parmesano rallado,  ", "cebolla picada,","\n", "hongos en rebanadas "," pimienta  roja en rodajas", "aceitunas negras rebanadas"};    
                         
                   vegetariana pizza1= new vegetariana(ingredientes1 );
                      lavegetariana abrir =new lavegetariana();
                     abrir.setVisible(true); 
                     simple[0]= pizza1 ;
                     TipoPiza =false;
                         
                  }else if(escoja.equalsIgnoreCase("Peperoni")){
                     
                     String[] ingredientes1 ={"rodajasde pepperoni ", "  rodajas de cebolla", "queso parmesano rallado"};
                    
                     peperoni pizza1= new peperoni(ingredientes1 ); 
                    lapeperoni abrir =new lapeperoni();
                     abrir.setVisible(true);
                     simple[0]= pizza1 ;
                     TipoPiza =false;
                     
                }else if(escoja.equalsIgnoreCase("Queso")){
                  
                     laqueso  abrir =new laqueso();
                     abrir.setVisible(true);
                    
                    
                    TipoPiza =false; 
                    String[] ingredientes1 ={"Queso Mozzarella, ", "fresco Parmesano"};
                   queso pizza1= new queso( ingredientes1);
                  
                    simple[0]= pizza1 ;
                    
                    
                }else{  System.out.println("  El tipo de pizza introducido no es válido  vuelva a intentarlo "); 
        }
        }
           System.out.println("la pizza que uste nos solicita es la siguente "+"\n" +
                               "EL tipo es "+ simple[0].getPizza());
              
        
                boolean condicion =true;
                         while(condicion){
                        simple[0].setTamaño(JOptionPane.showInputDialog("Escriba  el tamaño de la pizza Que desea  Grande, Mediana o Pequeña"));
               if(simple[0].getTamaño().equalsIgnoreCase("Grande")){
                        condicion =false;
                      }else if(simple[0].getTamaño().equalsIgnoreCase("Mediana")){
                        condicion =false;
                      }else if(simple[0].getTamaño().equalsIgnoreCase("Pequeña")){
                        condicion =false;
                      }else{
                                System.out.println("el tamaño es incorreto vuelva intentarlo"  );}}
                              System.out.println("EL tamaño "+simple[0].getTamaño()  );
                         
               
               boolean gabo=true;
                while(gabo){
                        simple[0].setCorte(JOptionPane.showInputDialog("Escoja el Tipo de corte Triangular, Cuadrada y Espiral  "));
               if(simple[0].getCorte().equalsIgnoreCase("triangular")){
                        gabo =false;
                      }else if(simple[0].getCorte().equalsIgnoreCase("cuadrada")){
                        gabo =false;
                      }else if(simple[0].getCorte().equalsIgnoreCase("Espiral")){
                        gabo =false;
                      }else{
                                System.out.println("eltipo de corte  es incorreto vuelva intentarlo"  );
                         
                            }}
                
                
              System.out.println(  
                      "\n" +"\n" +"la pizza que uste nos solicita es la siguente "+"\n" +
                      "EL tipo de pizza  "+ simple[0].getPizza()+"\n" +
                      "EL tamaño "+simple[0].getTamaño()+"\n" +
                      "El cotete "+simple[0].getCorte()+"\n"+
                      "los ingredietes son"+Arrays.toString(simple[0].getIngredientes())+"\n"+
                      "su pizza estara 15 minutos" +"\n"+
                       "el numero de su orden es"+simple[0].getNumeroPedido()        );
              
              
       
                // for (String e:simple[0].getIngredientes()){
          
                     
                 // System.out.println( e.i );
                        
              
              
//}
    
}
}
       
    
        
        // TODO code application logic here
    
    

