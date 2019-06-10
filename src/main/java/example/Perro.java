package example;

public class Perro extends Animal {

    public Perro(int nroPatas, String comida) {
        super(nroPatas, comida);
    }

    @Override
    public String sonido() {
        return "Woof!";
    }

    @Override
    public String feliz() {
        return "Mueve la cola!";
    }

    @Override
    public String enojado() {
        return "Muestro los dientes";
    }

    @Override
    public String comer() {
        return "Trago " + getComida();
    }

    @Override
    public String mover() {
        return "Camino en " + getNroPatas() + " patas";
    }
}
