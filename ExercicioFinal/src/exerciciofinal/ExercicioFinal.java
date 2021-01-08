package exerciciofinal;
public class ExercicioFinal {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula de PHP");
        v[1] = new Video("Aula de HTML5");
        v[2] = new Video("Aula de Java");
        
        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("João", 32, "M", "Jão");
        g[1] = new Gafanhoto("José", 45, "M", "Zé");
        g[2] = new Gafanhoto("Maria", 28, "F", "Má");
        
        Vizualizacao vis[] = new Vizualizacao[4];
        vis[0] = new Vizualizacao(g[0],v[1]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Vizualizacao(g[1],v[2]);
        vis[1].avaliar(10);
        System.out.println(vis[1].toString());
        
        vis[2] = new Vizualizacao(g[1],v[0]);
        vis[2].avaliar(80.5f);
        System.out.println(vis[2].toString());
        
        vis[3] = new Vizualizacao(g[2],v[2]);
        vis[3].avaliar(8);
        System.out.println(vis[3].toString());
        //System.out.println(v[0].toString());
        // System.out.println(g[1].toString());
       
    }
}
