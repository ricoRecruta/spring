package io.github.ricorecruta.arquiteturaspring.montadora;

import java.awt.*;

public class HondaHRV extends Carro{


    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRV");
        setCor(Color.BLACK);
        setMontador(Montadora.HONDA);
    }
}
