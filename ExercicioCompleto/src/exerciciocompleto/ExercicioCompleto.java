package exerciciocompleto;
public class ExercicioCompleto {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Fulano", 30, "Masculino");
        p[1] = new Pessoa("Ciclana", 35, "Feminino");
        
        l[0] = new Livro("Java Completo", "Pedro Coelho", 300, p[0]);
        l[1] = new Livro("Javascript Total", "João Machado", 410, p[1]);
        l[2] = new Livro("POO DeMais", "Silva Jardim", 360, p[1]);
        
        l[1].folhear(25);
        System.out.println(l[1].detalhes());
    }
    
}
