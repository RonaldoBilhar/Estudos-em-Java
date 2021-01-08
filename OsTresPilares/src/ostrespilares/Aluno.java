package ostrespilares;
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    
    public void pagarMens(){
        System.out.println("Pagando mensalidade do aluno  " + this.nome); //só funciona o this.nome porque na classe mão o atributo
                                                                          //está como protected se fosse private ai teria que usar setter
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
