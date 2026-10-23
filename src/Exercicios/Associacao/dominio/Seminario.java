package Exercicios.Associacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void imprime(){
        System.out.println("Seminário");
        System.out.println("Titulo: "+ this.titulo);
        if (professor != null){
            System.out.println("Professor: "+professor.getNome());
        }
        for (Aluno aluno : alunos){
            System.out.println("Alunos: "+aluno.getNome());
        }
        if (local != null){
            System.out.println("Local: "+local.getEndereco());
        }

    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
