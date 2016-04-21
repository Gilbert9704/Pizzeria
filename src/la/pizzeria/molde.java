/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la.pizzeria;

import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */abstract public class  molde {
    
    private String pizza;
    private String masa;
    private String salsa;
    public String[] ingredientes;
    private String tamaño ;
    private String corte ;
    private  int numeroPedido;
   private static int idsiguiiente=1;

    public molde(String pizza,  String masa, String salsa,String[] ingredientes   ) {
        this.pizza=pizza;
        this.masa = masa;
        this.salsa = salsa;
        this.ingredientes=ingredientes;
        numeroPedido=idsiguiiente;
        idsiguiiente++;
       
      
    }

    public String[] getIngredientes(        ) {
        
    return ingredientes;
    }      

    public int getNumeroPedido() {
        return numeroPedido;
    }
    

    public void setIngredientes(String[] ingredientes) {
       
       this.ingredientes=ingredientes; 
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    


    public void setCorte(String corte) {
        this.corte = corte;
    }

    public String getPizza() {
        return pizza;
    }

   

  
      public String getTamaño() {
        return tamaño;
    }

    public String getCorte() {
        return corte;
    }

   

 }
    

  

    

    
   
 
 

   
    
    
    
    
    
