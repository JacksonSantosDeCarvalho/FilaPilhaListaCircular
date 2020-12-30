package Fila;

public class Fila {
	
	public static void main(String[] args) {
        FilaContato fila =new FilaContato();
        fila.inserir(new Contato("Jackson", "(87) 99999999", null));
        fila.inserir(new Contato("Elizeu", "(87) 99999999", null));
        fila.inserir(new Contato("Charles", "(87) 99999999", null));
        fila.inserir(new Contato("Iallyson", "(87) 99999999", null));
        fila.inserir(new Contato("Andreia", "(87) 99999999", null));
        fila.inserir(new Contato("João", "(87) 99999999", null));
        fila.inserir(new Contato("Thiago", "(87) 99999999", null));
        System.out.println("");
        fila.imprimir();

        fila.remover();
        fila.remover();
        
        System.out.println("Imprimindo depois de remover 2x");
         fila.imprimir();
    }

}
