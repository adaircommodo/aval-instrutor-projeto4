package projeto4;

public class InteiroSetTeste {

	public static void main(String[] args) {
		
		int array1[] = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int array2[] = {0, 10, 20, 30, 35, 45, 55, 65, 75, 80, 90, 100};

		InteiroSet s1 = new InteiroSet ();
        InteiroSet s2 = new InteiroSet ();
        for (int x : array1) {
            s1.insereElemento (x);
        }
        System.out.println (s1.toSetString());
        
        for (int x : array2) {
            s2.insereElemento (x);
        }
        System.out.println (s2.toSetString());
        
        InteiroSet uniao = InteiroSet.uniao (s1, s2);
        System.out.println (uniao.toSetString());
        
        InteiroSet interseccao = InteiroSet.interseccao (s1, s2);
        System.out.println (interseccao.toSetString());
        
        System.out.println (InteiroSet.ehIgualTo (s1, s2));

	}

}
