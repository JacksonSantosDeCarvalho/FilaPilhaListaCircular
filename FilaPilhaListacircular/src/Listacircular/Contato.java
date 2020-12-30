package Listacircular;

public class Contato {
	
	  public String nome;
	  public String telefone;
	  public Contato proximo;
	  public Contato anterior;

	    public Contato(String nome, String telefone) {
	        this.nome = nome;
	        this.telefone = telefone;
	        this.proximo = null;
	        this.anterior=null;
	    }

}
