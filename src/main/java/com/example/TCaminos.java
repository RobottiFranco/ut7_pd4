package com.example;
import java.util.Collection;
import java.util.LinkedList;

public class TCaminos {

   private Collection<TCamino> caminos;

   public TCaminos() {
       this.caminos = new LinkedList<>();
   }

   public String imprimirCaminos() {
       StringBuilder sb = new StringBuilder();
       for (TCamino camino : caminos) {
           sb.append(camino.imprimirEtiquetas() + "\n");
       }
       return sb.toString();
   }

   public void imprimirCaminosConsola() {
       System.out.println(imprimirCaminos());
   }

   public Collection<TCamino> getCaminos() {
       return caminos;
   }

   public TCamino getCaminoCritico() {
       Double max = 0.0;
       TCamino result = null;
       for (TCamino tCamino : caminos) {
           if (tCamino.getCostoTotal() > max) {
               max = tCamino.getCostoTotal();
               result = tCamino;
           }
       }
       return result;
   }

   public String listarHolguras() {
       StringBuilder sb = new StringBuilder();
       TCamino caminoCritico = getCaminoCritico();
       for (TCamino tCamino : caminos) {
           if (tCamino.getCostoTotal() < caminoCritico.getCostoTotal()) {
               sb.append(tCamino.imprimirEtiquetas() + "\n");
               sb.append("Costo total: " + tCamino.getCostoTotal() + "\n");
               sb.append(
                       "Holgura: " + Double.toString(caminoCritico.getCostoTotal() - tCamino.getCostoTotal()) + "\n");
           }
       }
       return sb.toString();
   }

   public void listarHolgurasConsola() {
       System.out.println(listarHolguras());
   }
}
