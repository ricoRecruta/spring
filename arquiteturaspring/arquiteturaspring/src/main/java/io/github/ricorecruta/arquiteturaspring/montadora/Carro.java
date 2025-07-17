package io.github.ricorecruta.arquiteturaspring.montadora;

import java.awt.*;

public class Carro {

    private String modelo;
    private Color cor;
    private Motor motor;
    private Montadora montador;


    public Carro(Motor motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Montadora getMontador() {
        return montador;
    }

    public void setMontador(Montadora montador) {
        this.montador = montador;
    }
}
