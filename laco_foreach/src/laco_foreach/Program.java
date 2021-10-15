package laco_foreach;

public class Program {

	public static void main(String[] args) {
		String[] vect = new String[] {"Rodrigo","Luiz"};// instânciando um vetor com valores definidos

        for(int i=0;i<vect.length;i++) {//for comum imprimindo elementos do vetor de String vect.
        	System.out.println(vect[i]);
        }
        
        System.out.println("----------------------------------------------");
        
        for(String nomes : vect) {//laço for each - Colocamos o tipo, o apelido do repetidor e a coleção, fazendo percorrer todos
        	//elementos no vetor selecionado (vect), chamando cada elemento pelo apelido dado(nomes).
        	//sintaxe: para cada elemento dentro de vect faça :
        	System.out.println(nomes);
        }
	}

}
