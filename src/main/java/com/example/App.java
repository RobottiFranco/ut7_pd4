package com.example;

public final class App {

    public static void main(String[] args) {
        TGrafoDirigido gd = (TGrafoDirigido) UtilGrafos.cargarGrafo("aeropuertos_2.txt", "conexiones_2.txt", false,
                TGrafoDirigido.class);
        /*
         * Double[][] matriz = UtilGrafos.obtenerMatrizCostos(gd.getVertices());
         * UtilGrafos.imprimirMatrizMejorado(matriz, gd.getVertices(), "Matriz vuelos");
         */
        TCaminos caminoMontevideoCuritiva = gd.todosLosCaminos("Asuncion", "Montevideo");
        TCaminos caminoPorto_AlegreSantos = gd.todosLosCaminos("San_Pablo", "Santos");

        caminoMontevideoCuritiva.imprimirCaminosConsola();
        caminoPorto_AlegreSantos.imprimirCaminosConsola();
    }
}
