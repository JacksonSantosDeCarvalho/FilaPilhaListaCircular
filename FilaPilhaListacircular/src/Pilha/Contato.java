package Pilha;

public class Contato {
	
	  public String nome;
	    public String telefone;
	    public Contato proximo;

	    public Contato(String nome, String telefone, Contato proximo) {
	        this.nome = nome;
	        this.telefone = telefone;
	        this.proximo = proximo;
	    }

}
