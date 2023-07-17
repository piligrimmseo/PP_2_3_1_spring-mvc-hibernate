package Model;

public class Car {
    private int id;
    private String marca;
    private String model;

    public Car(int id, String marca, String model) {
        this.id = id;
        this.marca = marca;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
