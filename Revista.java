package Entidades;

public class Revista extends produto {

    private String editora;

    public Revista(int codigo, String nome, String editora) {
        super(codigo, nome);
        this.editora = editora;
    }
    
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

}