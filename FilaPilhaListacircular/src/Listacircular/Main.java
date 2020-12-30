package Listacircular;

public class Main {

	public static void main(String[] args) {
		
		ListaCircularContato lista =new ListaCircularContato();
        lista.inserirCabeca(new Contato("Jackson", "(87) 99999999"));
        lista.inserirCabeca(new Contato("Elizeu", "(87) 99999999"));
        lista.inserirCabeca(new Contato("Charles", "(87) 99999999"));
        lista.inserirCabeca(new Contato("Iallyson", "(87) 99999999"));
        lista.inserir(new Contato("Andreia", "(87) 99999999"),2);
        lista.inserirCabeca(new Contato("João", "(87) 99999999"));
        lista.inserir(new Contato("Thiago", "(87) 99999999"),2);
        System.out.println("");
        lista.imprimir();

        lista.removerCabeca();
        lista.removerCabeca();
        lista.removerEmQualquerIndice(7);
        
        System.out.println("Imprimindo depois de remover");
        lista.imprimir();	
		

	}

}
