package projeto4;

import java.util.Arrays;

public class InteiroSet {

    private static final int MIN = 0;

    private static final int MAX = 100;

    private boolean[] a; // [0...100]

   /**
     O construtor sem argumento 
     inicializa o array java como conjunto vazio (isto é, um 
     conjunto cuja representação de array contém todos os 
     valores false).
     */
    public InteiroSet() {
        a = new boolean[MAX + 1];
    }

    /**
     O método 
     union, que cria um terceiro conjunto com a união teórica 
     de dois conjuntos existentes
     * @param c1
     * @param c2
     * @return
     */
    public static InteiroSet uniao(InteiroSet c1, InteiroSet c2) {
        InteiroSet r = new InteiroSet();
        for (int i = 0; i <= MAX; ++i) {
            r.a[i] = c1.a[i] | c2.a[i];
        }
        return r;
    }

    /**
     o método intersection, que cria um terceiro conjunto 
     com a intersecção teórica de dois conjuntos existentes;   
     * @param c1
     * @param c2
     * @return
     */
    public static InteiroSet interseccao(InteiroSet c1, InteiroSet c2) {
        InteiroSet r = new InteiroSet();
        for (int i = 0; i <= MAX; ++i) {
            r.a[i] = c1.a[i] & c2.a[i];
        }
        return r;
    }

}