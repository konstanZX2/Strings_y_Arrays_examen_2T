import java.util.Scanner;

public class StringEj2 {
    public static void main(String[] args) {
        Scanner escaneado= new Scanner(System.in);
        System.out.println("Introduce el archivo con la extension");
        String cadena1= escaneado.next();
        System.out.println("La extension es: "+cadena1.substring(cadena1.indexOf(".")+1,cadena1.length()));
        System.out.println("El nombre del archivo es: "+cadena1.substring(0,cadena1.indexOf(".")));
        //He puesto el +1 para que no se vea el punto como aparece en el ejemplo del ejercicio.
    }
}
