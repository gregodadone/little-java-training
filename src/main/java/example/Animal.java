package example;

public abstract class Animal {
    private int nroPatas;
    private String comida;

    public Animal(int nroPatas, String comida) {
        this.nroPatas = nroPatas;
        this.comida = comida;
    }

    public int getNroPatas() {
        return nroPatas;
    }

    public void setNroPatas(int nroPatas) {
        this.nroPatas = nroPatas;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public abstract String sonido();

    public abstract String feliz();

    public abstract String enojado();

    public abstract String comer();

    public abstract String mover();
}
