package conceitos.deheranca;
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public void receberAum(float aum){
        this.salario += aum;
    }
            // metodos especiais
    /*public Professor(String especialidade, float salario, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }*/

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
