import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("selecciona el tamaño del primer array");
        Scanner escaneado = new Scanner(System.in);
        int tamañoArray1= escaneado.nextInt();
        System.out.println("selecciona el tamaño del segundo array");
        int tamañoArray2= escaneado.nextInt();

        Array matriz[][]= new Array [tamañoArray1][tamañoArray2];

        System.out.println("selecciona el tamaño del primer array de la segunda matriz");
        int tamañoArray3= escaneado.nextInt();
        System.out.println("selecciona el tamaño del segundo array de la segunda matriz");
        int tamañoArray4= escaneado.nextInt();

        Array matriz2[][]= new Array [tamañoArray1][tamañoArray2];

        //Haria lo de rellena matriz pero... se me ha olvidado como era el math.random...



    }
}
