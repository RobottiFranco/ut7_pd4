package com.example;

public interface IArista {

    double getCosto();

    Comparable getEtiquetaDestino();

    Comparable getEtiquetaOrigen();

    void setCosto(double costo);

    void setEtiquetaDestino(Comparable etiquetaDestino);

    void setEtiquetaOrigen(Comparable etiquetaOrigen);

}
