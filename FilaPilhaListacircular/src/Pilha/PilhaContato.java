package Pilha;

public class PilhaContato {
	
	 public Contato cabeca = null;
	    public Contato cauda = null;
	    public int tamanhoDaLista = 0;

	    public void inserir(Contato novo) {
	        if (cabeca == null) { // se a lista estiver vazia
	            cabeca = novo;
	            cauda = novo;
	        } else { // se a lista N�O estiver vazia
	            novo.proximo = cabeca;
	            cabeca = novo;
	        }
	        tamanhoDaLista++;
	    }

	    public int tamanho() {
	        return tamanhoDaLista;
	    }

	    public Contato remover() {
	        Contato aux = cabeca;
	        if (cabeca == null) {
	            System.out.println("Lista Vazia");
	            return null;
	        } else if (cabeca == cauda) { // tamanhoO1 == 1
	            cabeca = null;
	            cauda = null;
	            tamanhoDaLista--;
	            return aux;
	        } else {
	            cabeca = aux.proximo;
	            aux.proximo = null;
	            tamanhoDaLista--;
	            return aux;
	        }
	    }


	    public void imprimir() {
	        if (cauda == null) {
	            System.out.println("Lista Vazia!");
	        } else {
	            //impressao:   Ana, Jo�o, Maria
	            //            aux 
	            Contato aux = cabeca;// Ana, Jo�o, Maria
	            while (aux != null) {
	                System.out.print("| " + aux.nome + " | ");
	                aux = aux.proximo;
	            }
	        }
	    }

}
