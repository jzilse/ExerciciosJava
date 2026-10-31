package Exercicios.Heranca.dominio;

public class MembroRegular extends Membro{
    public MembroRegular(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void validarAcesso() {
        super.validarAcesso();
        System.out.println("Acesso Liberado");
    }
}
