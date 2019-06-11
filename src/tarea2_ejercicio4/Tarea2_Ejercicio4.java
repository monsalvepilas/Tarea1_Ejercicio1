
package tarea2_ejercicio4;
import com.sun.jmx.snmp.agent.SnmpTableEntryFactory;
import java.util.Scanner;


public class Tarea2_Ejercicio4 {

    
    public static  void main(String[] args) {
        
       
        
        Scanner entradanumeros=new Scanner(System.in);
        
        
        
        int numero1=0;  
        int numero2=0;
        int mayor=0;
        int menor=0;
     int contador; 
      
    
        
        
        while(numero1==numero2){
            
            System.out.println("Solo puedes introducir números diferentes ");
        
        System.out.print("Introduce el primer número: ");
        
        numero1=entradanumeros.nextInt();
        
       
        
        System.out.print("Introduce el segundo número, distinto del primero: ");
        
        numero2=entradanumeros.nextInt();
        
        
        
        
        
    }
        
        if (numero1>numero2){
            
            mayor=numero1;
        menor=numero2;
        }else {
            
                menor=numero1;
                mayor=numero2;
        }
        
        System.out.print("El numero mayor es:  "+mayor + " y el menor es: " + menor);
        
        int media = (mayor+menor)/2;
        
        System.out.println("");
        
        System.out.print("Lista ascendente desde  "+menor + " hasta " + mayor + " es: ");
        
        do{
        for (contador=menor; contador<media+1;contador++) {
 
           int sumatorio=contador; 
           
           System.out.print(sumatorio +" " );
             
        }
       
        }
        
        while(contador<media+1);
        
   System.out.println("");
        
        System.out.print("Lista descendente desde  "+mayor + " hasta " + menor + " es: ");
      
        do{
            for (contador=mayor; contador>media-1;contador--) {
     
               int sumatorio=contador; 
               
               System.out.print(sumatorio +" " );
                 
            }
           
            }
            
            while(contador<media-1);
        
        
        
        
        
    
        
        
        }

}



