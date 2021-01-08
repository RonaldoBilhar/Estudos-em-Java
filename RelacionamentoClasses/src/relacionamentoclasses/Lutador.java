package relacionamentoclasses;
public class Lutador implements InterfaceLuta{
    //atributos
    private String nome;
    private String nascionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;    //três variaveis in line
   
    
    //metodos especiais
    public Lutador(String nome, String nascionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNascionalidade(nascionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascionalidade() {
        return this.nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();    //chamada do método automaticamente
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {       //Usa o atributo externo do objeto
        if (this.peso <= 52.2){
            this.categoria = "Inválida";
        }else if (this.peso <= 70.3){
            this.categoria = "Leve";
        }else if (this.peso <= 83.9){
            this.categoria = "Médio";
        }else if (this.peso <=120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválida";
        } 
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public void apresentar() {
        System.out.println("-------------------------------");
        System.out.println("--------It´s Time!!!!----------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNascionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }

    @Override
    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria() + ", com " + this.getVitorias()
            + " vitórias, " + this.getEmpates() + " empates e " + this.getDerrotas() + " derrotas.");
    }
    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
            
}
