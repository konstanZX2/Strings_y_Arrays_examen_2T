import java.util.Scanner;

public class StringsEj4 {
    public static void main(String[] args) {
        Scanner escaneado = new Scanner(System.in);
        String cadena1 = escaneado.next();
        String cadena2 = "a";
        String cadena3 = "a";
        String cadena4 = "a";
        String cadena5 = "a";
        String cadena6 = "a";
        String cadena7 = "a";
        String cadena8 = "a";
        String cadena9 = "a";
        String cadena10 = "a";
        String cadena11 = "a";
        char a = 'a', e = 'e', i = 'i', o = 'o', u = 'u', A = 'A', E = 'E', I = 'I', O = 'O', U = 'U';
        char b = '@', c = '3', d = '1', f = '0', g = '*';
        for (int j = 0; j < cadena1.length(); j++) {
            cadena2 = cadena1.replace(a, b);
            cadena3 = cadena2.replace(e, c);
            cadena4 = cadena3.replace(i, d);
            cadena5 = cadena4.replace(o, f);
            cadena6 = cadena5.replace(u, g);
            cadena7 = cadena6.replace(A, b);
            cadena8 = cadena7.replace(E, c);
            cadena9 = cadena8.replace(I, d);
            cadena10 = cadena9.replace(O, f);
            cadena11 = cadena10.replace(U, g);


        }
        System.out.println(cadena11);

        //Seguramente haya una forma el triple de facil pero no se me ocurre, soy muy malo con eso de los algoritmos y las matematicas
    }
}
