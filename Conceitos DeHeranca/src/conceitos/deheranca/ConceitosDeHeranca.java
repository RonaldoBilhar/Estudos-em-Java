package conceitos.deheranca;
public class ConceitosDeHeranca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("João");
        p2.setNome("Pedro");
        p3.setNome("Maria");
        p4.setNome("Santos");
        
        p1.setSexo("M");
        p2.setSexo("M");
        p3.setSexo("F");
        p4.setSexo("M");
        
        p1.setIdade(25);
        p2.setIdade(32);
        p3.setIdade(29);
        p3.setIdade(18);

        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
