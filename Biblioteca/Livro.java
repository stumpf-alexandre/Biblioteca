package Biblioteca;

import java.util.Scanner;

/**
 * Created by als on 09/08/2017.
 */
public class Livro {
    public String nome;
    public String descricao;
    public double valor;
    public String isbn;
    public Autor autor=new Autor();

    public void ler(){
        Scanner tc=new Scanner(System.in);
        System.out.println("Digite o nome do livro: ");
        this.nome=tc.next();
        System.out.println("Digite a descrição do livro: ");
        this.descricao=tc.next();
        autor.ler();
        System.out.println("Digite o valor do livro: ");
        this.valor=tc.nextDouble();
        System.out.println("Digite o isbn: ");
        this.isbn=tc.next();
    }

    public void mostrar(){
        System.out.println("Nome "+this.nome);
        System.out.println("Descrição "+this.descricao);
        autor.mostrar();
        System.out.println("Valor "+this.valor);
        System.out.println(this.isbn);
    }

    public void aplicarDesconto(double p){
        System.out.println("Aplicando um desconto");
        this.valor-=this.valor*p;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;

        Livro livro = (Livro) o;

        if (nome != null ? !nome.equals(livro.nome) : livro.nome != null) return false;
        return isbn != null ? isbn.equals(livro.isbn) : livro.isbn == null;
    }
}
