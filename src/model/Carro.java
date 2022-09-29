package model;

public class Carro {
    private static int numRuedas = 4;
    private String color;
    private int posX;
    private int posY;
    private int velocidad;

    public Carro(String pColor, int pPosx, int pPosy) {
        this.color = pColor;
        this.posX = pPosx;
        this.posY = pPosy;
        this.velocidad = 0;
    }

    public Carro() {
        this.color = "";
        this.posX = 0;
        this.posY = 0;
        this.velocidad = 0;
    }

    public static int getNumRuedas() {
        return numRuedas;
    }

    public String getColor() {
        return this.color;
    }

    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setColor(String pColor) {
        this.color = pColor;
    }

    public void setPosX(int pPosX) {
        this.posX = pPosX;
    }

    public void setPosY(int pPosY) {
        this.posY = pPosY;
    }

    public void setVelocidad(int pVelocidad) {
        this.velocidad = pVelocidad;
    }

    public void mover(int pX, int pY) {
        if (pX != getPosX()) {
            setPosX(pX);
        }
        if (pY != getPosY()) {
            setPosY(pY);
        }
    }

    public void acelerar() {
        setVelocidad(getVelocidad() + 10);
    }

    public void frenar() {
        if (getVelocidad() > 10) {
            setVelocidad(getVelocidad() - 10);
        } else {
            setVelocidad(0);
        }
    }

    public String toString() {
        return "\nDATOS DEL CARRO: \nNum. Ruedas: " + numRuedas + "\nColor: " + color
                + "\nPos. X: " + posX
                + "\nPos. Y: " + posY + "\nVelocidad: " + velocidad;
    }

}
