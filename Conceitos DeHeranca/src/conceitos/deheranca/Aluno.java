package conceitos.deheranca;
public class Aluno extends Pessoa{
    private int matr;
    private String curso;
    
    public void cancelarMatr(){
        System.out.println("Matricula será cancelada.");
        this.setMatr(0);
    }
        //métodos especiais
   /* public Aluno(int matr, String curso, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.matr = matr;
        this.curso = curso;
    }*/
    

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
