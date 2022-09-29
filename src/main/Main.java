package main;

import model.Carro;

public class Main {
    public static void main(String[] args) {
        Carro primerCarro = new Carro();
        System.out.println(primerCarro);

        Carro segundoCarro = new Carro("Rojo", 10, 200);
        segundoCarro.acelerar();
        System.out.println(segundoCarro);
    }
}
