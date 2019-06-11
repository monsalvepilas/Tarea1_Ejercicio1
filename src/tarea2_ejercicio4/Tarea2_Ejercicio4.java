
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
        
        
        while(numero1==numero2){
            
            System.out.println("Solo puedes introducir números diferenes ");
        
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
        
        
       
    }


}
