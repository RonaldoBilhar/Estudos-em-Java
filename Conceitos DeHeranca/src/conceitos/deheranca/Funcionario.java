package conceitos.deheranca;
public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;
    
    public void mudaTrabalho(){
        this.trabalhando = ! this.trabalhando;  // o atributo recebe o valor inverso ao valor dele no momento
    }
            //métodos especiais
    /*public Funcionario(String setor, boolean trabalhando, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }*/

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
