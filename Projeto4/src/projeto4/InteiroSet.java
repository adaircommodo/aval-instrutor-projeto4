package projeto4;

import java.util.Arrays;

public class InteiroSet {

    private static final int MIN = 0;

    private static final int MAX = 100;

    private boolean[] a; // [0...100]

   /**
     O construtor sem argumento 
     inicializa o array java como conjunto vazio (isto �, um 
     conjunto cuja representa��o de array cont�m todos os 
     valores false).
     */
    public InteiroSet() {
        a = new boolean[MAX + 1];
    }

}