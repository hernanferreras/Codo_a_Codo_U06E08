
package u06e08;

import java.util.Scanner;

public class U06E08 {
    
    public static void main(String args[]) {
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        a=ingresarDato(a.length, 'A'); 
        b=ingresarDato(b.length, 'B');
        c=sumaArray(a, b);
        muestraArray(c, 'C');
        }
    static int[] ingresarDato(int x, char nombreArray){
        int z;
        int[] array = new int[x];
        Scanner entrada = new Scanner(System.in);
        for(z=0; z<x; z++){
            System.out.print("Ingrese el dato nro. "+(z+1)+" del array "+nombreArray+": ");
            array[z]=entrada.nextInt();
        }
        return(array);
    }
    static int [] sumaArray(int[] m, int[] n){
        int j;
        int[] k = new int[m.length];
        for (j=0; j<m.length; j++){
            k[j]=m[j]+n[j];
        }
        return(k);
    }
    static void muestraArray(int[] d, char nombreArray){
        int e;
        for (e=0; e<d.length; e++){
            System.out.println("El dato "+(e+1)+" del array "+nombreArray+" es: "+d[e]);
        }
    }
}