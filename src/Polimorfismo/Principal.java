package Polimorfismo;

public class Principal {
    public static void main(String[] args) {

        operaciones mensajesuma = new Suma();
        mensajesuma.pedirdatos();
        mensajesuma.operaciones();
        mensajesuma.mostrarresultado();

        operaciones mensajeresta = new Resta();
        mensajeresta.pedirdatos();
        mensajeresta.operaciones();
        mensajeresta.mostrarresultado();

    }

}
