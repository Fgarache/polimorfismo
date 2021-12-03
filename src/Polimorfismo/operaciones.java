package Polimorfismo;

import java.util.Scanner;

public abstract class operaciones {
    protected int valor1,valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    public void pedirdatos(){
        System.out.println("Primer valor: ");
        valor1 = entrada.nextInt();

        System.out.println("Segundo valor: ");
        valor2 = entrada.nextInt();
    }
    public abstract void operaciones();
    public void mostrarresultado(){
        System.out.println(resultado);
    }

    public abstract void operacciones();
}
