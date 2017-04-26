/*
404TeamNotFound
Elver Iram Jiménez Rodríguez A01196327
Luis Mario de Leija Piñón         A01410385
Luis  Montiel Rocha                 A01410588
Pablo Serrano Hernandez        A01410753
Rubén Daniel Baez Muñíz        A01411504
*/
package spp.pkg404teamnotfound.pfinal3;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author elver
 */
public class SPP404TeamNotFoundPFinal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    menu();
    }
    
    public static void menu(){
     String [] opciones= { "Calcular Maximo Comun Divisor"," Calcular Minimo Comun Multiplo", "Salir"};
    
     int x=JOptionPane.showOptionDialog(null
                ,"Escoje entre las siguientes opciones"
                ,null
                ,JOptionPane.DEFAULT_OPTION
                ,JOptionPane.INFORMATION_MESSAGE
                ,null
                ,opciones
                ,null
             );
     switch(x){
         case 0:
             int n,n2;
             String d1 = "Ingrese el primer numero";
             String d2 = "Ingrese el segundo numero";
             n=pedirdato(d1);
             n2=pedirdato(d2);
             maximo(n,n2);
          
        break;
         case 1: 
             int b ,b2;
             String c1 = "Ingrese el primer numero";
             String c2 = "Ingrese el segundo numero";
             b=pedirdato(c1);
             b2=pedirdato(c2);
             minimo(b,b2);
             
                 break;
         case 2:
              JOptionPane.showMessageDialog(null, "Programa Finalizado");
                System.exit(0);
             break;
                 
     }
    }
    public static int pedirdato(String d){
        int n=0;
        Scanner kb= new Scanner(System.in);
        boolean flag;
        do{
            try{
        String x = JOptionPane.showInputDialog(null,d)    ;
        n= new Integer(x);
        flag= false;
            }catch(Exception er){
            JOptionPane.showMessageDialog(null,"Intentelo de nuevo");
            flag= true;
            kb.nextLine();
                    
            }
                
        }while(flag);
             return n;    
    }
    public static void maximo(int b, int b2){
        
        while(b != b2)
            if(b>b2)
                b= b-b2;
            else
                b2= b2 -b;
          JOptionPane.showMessageDialog(null,"El Maximo Comun Multiplo es: "+ b);
        
    }
        
        
             public static void minimo(int n, int n2){
                  int min = 1;
        int i = 2;
        while(i <= n || i <= n2)
        {
            if(n%i == 0 || n2%i == 0)
            {
            min = min * i;
            if(n%i == 0) n = n / i;
            if(n2%i == 0) n2 = n2 / i;
            }
            else
                i = i+1;               
        }
         JOptionPane.showMessageDialog(null,"El Maximo Comun Divisor es: "+ min); 
    }
              public static void preguntaContinuidad(){
        int respuesta = JOptionPane.showOptionDialog(null, "¿Desea seguir ejecutando el programa?", "Pregunta de Continuidad",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object []{"Si", "No"}, "Si");
       
        switch (respuesta){
            case 0:
                menu();
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO");
                System.exit(0);
        }
              }
}