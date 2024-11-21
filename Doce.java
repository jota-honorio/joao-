package Entidades;

public class Doce extends produto {

    private String marca;

    public Doce(int codigo, String nome, String marca) {
        super(codigo, nome);
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}