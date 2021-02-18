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

    /**
     O m�todo uniao, que cria um terceiro conjunto com a uni�o te�rica 
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
     o m�todo interseccao, que cria um terceiro conjunto 
     com a intersec��o te�rica de dois conjuntos existentes;   
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

    /**
     o m�todo insereElemento que insere um novo elemento num conjunto;
     * @param i
     */
    public void insereElemento(int i) {
        a[i] = true;
    }


    /**
     o m�todo deleteElemento que exclui um elemento de um conjunto;
     * @param i
     */
    public void deleteElemento(int i) {
        a[i] = false;
    }

    /**
     e o m�todo toSetString que retorna uma string 
     contendo os elementos do conjunto, ou um - caso a 
     posi��o daquele elemento seja false.
     * @return
     */
    public String toSetString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= MAX; ++i) {
            if (a[i])
                sb.append(i).append(",");
            else
                sb.append("-").append(",");
        }
        return sb.toString();
    }

    /**
     o m�todo ehIgualTo que determina se dois conjuntos s�o iguais,   
     * @param c1
     * @param c2
     * @return
     */
    public static boolean ehIgualTo(InteiroSet c1, InteiroSet c2) {
        return Arrays.equals(c1.a, c2.a);
    }

}