import java.util.ListIterator;

/**
 * Write a description of class AlgoritmosAnimados here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlgoritmosAnimados
{
    public static Gravador buscaSequencial(int[] arranjo, int chave) {
        Gravador anim = new Gravador(); // instância do gravador
        anim.gravarArranjo(arranjo, "Inicio de busca sequencial"); // inicializa o arranjo para desenhar os retangulos

        int i = 0; // inicializa variável contadora
        anim.gravarIndiceDestacado(arranjo, i, "Busca sequencial");// loop para procurar a chave no arranjo
        while (i < arranjo.length && arranjo[i] != chave) {
            i++;// próximo index.
            anim.gravarIndiceDestacado(arranjo, i, "Busca sequencial");// pinta de amarelo o retangulo atual do arranjo
        }
        
        if (i < arranjo.length) {// verificação de indice
            anim.gravarIndiceDestacado(arranjo, i, "Chave encontrada");//Pinta de amarelo e indice atual e informa que a chave nao foi encontrada
        } else {
            anim.gravarArranjo(arranjo, "Chave não encontrada");// indice maior e não foi achado a chave no arranho.
        }
        
        return anim;
    }
    
    
    public static Gravador ordenarPorBolha(int[] arranjo) {
        Gravador anim = new Gravador();
        anim.gravarArranjo(arranjo, "Disposição inicial");// Diposição Inicial
                                                            // do arranjo
        boolean trocou;
        do {
            trocou = false;
            for (int i = 1; i < arranjo.length; i++) {
                anim.gravarComparacaoSimples(arranjo, i - 1, i); // dois
                                                                    // elementos
                                                                    // sendo
                                                                    // comparado, pinta eles.
                if (arranjo[i - 1] > arranjo[i]) {
                    trocar(arranjo, i - 1, i);
                    anim.gravarPosTrocas(arranjo, i - 1, i);// marcando arranjo
                                                            // pós troca
                    trocou = true;
                }
            }
        } while (trocou);
        anim.gravarArranjo(arranjo, "Disposição final");// disposição final do
                                                        // arranjo
        return anim;
    }
    
    
	public static Gravador ordenarPorSelecao(int[] arranjo) {
		Gravador anim = new Gravador();
		anim.gravarArranjo(arranjo, "Disposição inicial");// Diposição Inicial
															// do arranjo
		for (int i = 0; i < arranjo.length; i++) {
			int minimum = i;
			int j = i + 1;
			while (j < arranjo.length) {
				anim.gravarComparacao(arranjo, i, j, minimum); // tres elementos
																// sendo
																// comparado,
																// sendo um fixo
																// e um menor
				if (arranjo[minimum] > arranjo[j]) {
					minimum = j;
					anim.gravarComparacao(arranjo, i, j, minimum); // tres
																	// elementos
																	// sendo
																	// comparado,
																	// sendo um
																	// fixo e um
																	// menor
				}
				j++;

			}
			trocar(arranjo, i, minimum);
			anim.gravarPosTrocas(arranjo, i, minimum);// marcando arranjo pós
														// troca
		}
		anim.gravarArranjo(arranjo, "Disposição final");// disposição final do
														// arranjo
		return anim;
    }
    
    public static Gravador buscaBinária(int[] arranjo, int chave) {
    		int num = chave;
    		Gravador anim = new Gravador();
    		anim.gravarArranjo(arranjo, "Disposição inicial");// Diposição Inicial
    															// do arranjo
    		int lim_i = 0, lim_s = arranjo.length;
    		do {
    			int meio = ((lim_s) + lim_i) / 2;
    			anim.gravarComparacao(arranjo, lim_i, lim_s - 1, meio - 1);// Marcando
    																		// o
    																		// inicio
    																		// do
    																		// arranjo
    																		// e o
    																		// fim
    																		// dele
    			if (arranjo[meio] == num) {
    				anim.gravarIndiceDestacado(arranjo, meio, "chave encontrada");// Marcando
    																				// o
    																				// inicio
    																				// do
    																				// arranjo
    																				// e
    																				// o
    																				// fim
    																				// dele
    			    return anim;
    			} else if (arranjo[meio] < num) {
    			    lim_i = meio + 1;
    			} else if (arranjo[meio] > num) {
    				lim_s = meio;
    			}
    		} while ((lim_s - lim_i) > 0);
    		anim.gravarArranjo(arranjo, "Disposição final");// disposição final do
    														// arranjo
    		return anim;
    }

	public static Gravador ordenarPorInsercao(int[] arranjo) {
		Gravador anim = new Gravador();
		anim.gravarArranjo(arranjo, "Disposição inicial");// Diposição Inicial
															// do arranjo
		for (int i = 1; i < arranjo.length; i++) {
			int anterior = i - 1;
			int atual = i;
			while (anterior >= 0 && arranjo[anterior] > arranjo[atual]) {
				anim.gravarComparacaoSimples(arranjo, anterior, atual); // dois
																		// elementos
																		// sendo
																		// comparado
				trocar(arranjo, anterior, atual);
				anterior--;
				atual--;
			}
			anim.gravarPosTrocas(arranjo, i - 1, i);// marcando arranjo pós
													// troca
		}
		anim.gravarArranjo(arranjo, "Disposição final");// disposição final do
														// arranjo
		return anim;
	}


	public static Gravador ordenarPorMergesort(int[] arranjo) {
		Gravador anim = new Gravador();
		anim.gravarArranjo(arranjo, "Disposição inicial");// Diposição Inicial
															// do arranjo

		sort(arranjo, 0, arranjo.length - 1, anim);

		anim.gravarArranjo(arranjo, "Disposição final");// disposição final do
														// arranjo
		return anim;
	}

	public static void sort(int[] arranjo, int inicio, int fim, Gravador anim) {

		if (fim <= inicio) {
			return;
		}
		int meio = (inicio + fim) / 2;
		anim.gravarIndiceDestacado(arranjo, meio, "meio"); //marcando o meio dos arranjos
		sort(arranjo, inicio, meio, anim);
		sort(arranjo, meio + 1, fim, anim);
		//copias de arranjos
		int[] A = new int[meio - inicio + 1]; //arrajo metade
		int[] B = new int[fim - meio];        //outra metade
		//Preenchemos
		for (int i = 0; i <= meio - inicio; i++) {
			A[i] = arranjo[inicio + i];      
		}
		for (int i = 0; i <= fim - meio - 1; i++) {
			B[i] = arranjo[meio + 1 + i];
		}
		int i = 0;
		int j = 0;
		for (int k = inicio; k <= fim; k++) {
			if (i < A.length && j < B.length) {
				if (A[i] < B[j]) {
					arranjo[k] = A[i++];
				} else {
					arranjo[k] = B[j++];
				}
			} else if (i < A.length) {
				arranjo[k] = A[i++];
			} else if (j < B.length) {
				arranjo[k] = B[j++];
			}
			anim.gravarComparacao(arranjo,i, j,k);
		}
	}
	
	public static Gravador ordenarPorQuicksort(int[] arranjo) {
		Gravador anim = new Gravador();
		anim.gravarArranjo(arranjo, "Disposição inicial");// Diposição Inicial
															// do arranjo
		ordenar(arranjo, 0, arranjo.length - 1, anim);

		anim.gravarArranjo(arranjo, "Disposição final");// disposição final do
														// arranjo
		return anim;
	}

	private static void ordenar(int[] arranjo, int indiceEsquerda, int indiceDireita, Gravador anim) {
		anim.gravarComparacaoSimples(arranjo, indiceEsquerda, indiceDireita); // marcando pivo i e j
		if (indiceEsquerda < indiceDireita) {
		    int principal = arranjo[(indiceEsquerda+indiceDireita)/2];
		    int indice = separar(arranjo, indiceEsquerda, indiceDireita, principal, anim);
		    ordenar(arranjo, indiceEsquerda, indice-1,anim);
		    ordenar(arranjo, indice, indiceDireita,anim);
		}
	}

	private static int separar(int[] arranjo, int indiceEsquerda, int indiceDireita,int principal,Gravador anim) {
		
        int[] marcadores =  {indiceEsquerda, indiceDireita, principal};
       
        while (indiceEsquerda <= indiceDireita){
            while (arranjo[indiceEsquerda] < principal){
                indiceEsquerda++;
            }
            while (arranjo[indiceDireita] > principal){
                indiceDireita--;
            }
           
            if (indiceEsquerda <= indiceDireita){
                trocar(arranjo, indiceEsquerda++, indiceDireita--);
            }
            anim.gravarPosTrocas(arranjo, indiceDireita, indiceEsquerda);    // marcando como estao o inicio
													// e o fim do pivot
        }
        anim.gravarComparacaoSimples(arranjo, indiceEsquerda, indiceDireita);
        return indiceEsquerda;
    }
    
	private static void trocar(int[] ordenado, int i, int j) {
		int seguro = ordenado[i];
		ordenado[i] = ordenado[j];
		ordenado[j] = seguro;
    }   
    
}