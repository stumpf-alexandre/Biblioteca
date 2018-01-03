package Biblioteca;

import java.util.Scanner;

/**
 * Created by als on 09/08/2017.
 */
public class Autor {
    Scanner tc=new Scanner(System.in);
    public String nome;
    public String email;

    public void ler(){
        System.out.println("Nome do autor: ");
        this.nome=tc.next();
        System.out.println("E-mail do autor: ");
        this.email=tc.next();
    }

    public void mostrar(){
        System.out.println("Nome: "+this.nome);
        System.out.println("E-mail: "+this.email);
    }
}
