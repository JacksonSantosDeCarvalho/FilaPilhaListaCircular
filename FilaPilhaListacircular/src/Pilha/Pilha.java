package Pilha;

public class Pilha {
	
	   public static void main(String[] args) {
	        PilhaContato pilha =new PilhaContato();
	        pilha.inserir(new Contato("Jackson", "(87) 99999999", null));
	        pilha.inserir(new Contato("Elizpilhaeu", "(87) 99999999", null));
	        pilha.inserir(new Contato("Charles", "(87) 99999999", null));
	        pilha.inserir(new Contato("Iallyson", "(87) 99999999", null));
	        pilha.inserir(new Contato("Andreia", "(87) 99999999", null));
	        pilha.inserir(new Contato("João", "(87) 99999999", null));
	        pilha.inserir(new Contato("Thiago", "(87) 99999999", null));
	        System.out.println("");
	        pilha.imprimir();

	        pilha.remover();
	        pilha.remover();
	        
	        System.out.println("Imprimindo depois de remover 2x");
	         pilha.imprimir();
	    }

}
