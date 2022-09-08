import static java.lang.Math.*;

public class Esfera {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area() {
        return 4 * PI * pow(getRadio(), 2);
    }

    public double volumen() {
        return (4*((PI)*(pow(getRadio(), 3))))/3;
    }

    public double diametro() {
        return 2 * getRadio();
    }

    public double circunferencia() {
        return PI * diametro();
    }
}
