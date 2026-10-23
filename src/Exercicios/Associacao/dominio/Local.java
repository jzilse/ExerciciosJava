package Exercicios.Associacao.dominio;

public class Local {
    private String endereco;
    private Seminario[] seminario;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println("Local");
        System.out.println(this.endereco);
        for (Seminario seminarios: seminario){
            System.out.println("Seminarios: "+seminarios.getTitulo());
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}
