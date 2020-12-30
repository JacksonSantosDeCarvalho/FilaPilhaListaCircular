package Listacircular;


public class ListaCircularContato {
	
	 public Contato cabeca;
	 public int tamanho=0;

	    public void inserirCabeca(Contato novo) {
	        if (cabeca == null) {
	            cabeca = novo;
	            novo.anterior = novo;
	            novo.proximo = novo;
	            
	        } else if (tamanho >= 1) {
	            novo.proximo = cabeca;
	            novo.anterior = cabeca.anterior;
	            cabeca.anterior.proximo = novo;
	            cabeca.anterior = novo;
	            cabeca = novo;
	            
	        }
	        tamanho++;
	    }
	    
	    public void inserir(Contato novo, int indice){
	        Contato aux = cabeca;
	        for (int i =0; i<indice; i++){
	            aux = aux.proximo;
	        }
	        novo.anterior=aux;
	        novo.proximo=aux.proximo;
	        aux.proximo=novo;
	        novo.proximo.anterior=novo;
	        tamanho++;
	    }
	    
	    public int tamanho01() {
	    	return tamanho;
	    }
	    
	    public void imprimir () {
			Contato aux = cabeca;
			do {
				System.out.print(" | "+"Nome: "+ aux.nome +" / Telefone: "+aux.telefone+" | ");
				aux = aux.proximo;
				
			}while(aux!=cabeca);
			System.out.println(" ");
		}
		
	    
	    
	    public Contato removerCabeca(){
	        if (cabeca==null){
	            System.out.println("Lista está vazia");
	            return null;
	        }
	        else if (tamanho==1){
	            Contato aux = cabeca;
	            cabeca=null;
	            tamanho--;
	            return aux;
	        }
	        
	        else {
	            Contato aux = cabeca;
	            aux.anterior.proximo=aux.proximo;
	            aux.proximo.anterior=aux.anterior;
	            cabeca = aux.proximo;
	            aux.anterior = null;
	            aux.proximo=null;
	            tamanho--;
	            return aux;
	        }
	    }
	    
	    public Contato removerEmQualquerIndice(int i) {
	    	if(i <= 0 || i == 1) {
	    		 return removerCabeca();
	    	} else {
	    		Contato aux = cabeca;
	    		for(int j = 0; j < i-2; j++) {
	    			aux=aux.proximo;
	    		}
	    		Contato remova = aux.proximo;
				aux.proximo = remova.proximo;
				aux.proximo.anterior = aux;
				remova.proximo = null;
				remova.anterior = null;
				tamanho--;
				return remova;
	    	}
	    	
	    }

}
