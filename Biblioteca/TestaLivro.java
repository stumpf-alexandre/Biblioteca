package Biblioteca;

/**
 * Created by als on 09/08/2017.
 */
public class TestaLivro {
    public static void main(String[] args) {
        Livro livro1=new Livro();
        livro1.ler();

        Livro livro2=new Livro();
        livro2.ler();

        livro1.aplicarDesconto(0.1);
        livro1.mostrar();
        livro2.mostrar();
    }
}
