package denniscg;
import java.util.Scanner;
public class Denniscg {
public static void main(String[] args) {
    Scanner leer= new Scanner (System.in);
    float n1, n2, n3, n4, n5, r;
    System.out.print("Ingresa primer precio: ");
    n1= leer.nextFloat ();
    System.out.print("Ingresa segundo precio: ");
    n2= leer.nextFloat ();
    System.out.print("Ingresa tercer precio: ");
    n3= leer.nextFloat ();
    System.out.print("Ingresa cuarto precio: ");
    n4= leer.nextFloat ();
    System.out.print("Ingresa quinto precio: ");
    n5= leer.nextFloat ();
    r=(n1+n2+n3+n4+n5);
    System.out.println("El resultado es: "+r);
    
    
    
    
    }
    
}
