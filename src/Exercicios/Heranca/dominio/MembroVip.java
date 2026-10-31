package Exercicios.Heranca.dominio;

public class MembroVip extends Membro{
    public MembroVip(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void calcularMensalidade() {
        super.valorBase += (super.valorBase *0.15);
        super.calcularMensalidade();
    }


    @Override
    public void validarAcesso() {
        super.validarAcesso();
        System.out.println("Acesso VIP Liberado");
    }
}
