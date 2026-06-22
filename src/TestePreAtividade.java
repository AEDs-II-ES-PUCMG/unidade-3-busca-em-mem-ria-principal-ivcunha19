import java.util.Arrays;
import java.util.Random;

public class TestePreAtividade {
    public static void main(String[] args) {
        Random gerador = new Random(42);
        int[] valores = new int[10000];
        int[] pedidosBusca = new int[1000];

        for(int i = 0; i < 10000; i++){
            valores[i] = gerador.nextInt();
        }

        for (int i = 0; i < pedidosBusca.length; i++) {
            pedidosBusca[i] = gerador.nextInt();    
        }

        ABB<Integer, Integer> abb = new ABB<Integer, Integer>();
        AVL<Integer, Integer> avl = new AVL<Integer, Integer>();

        for (int i = 0; i < valores.length; i++) {
            avl.inserir(valores[i], valores[i]);
            abb.inserir(valores[i], valores[i]);
        }

        for (int i = 0; i < pedidosBusca.length; i++) {
            avl.pesquisar(pedidosBusca[i]);
            abb.pesquisar(pedidosBusca[i]);
        }

        System.out.println("Na avl, tempo = "+ avl.getTempoTotal() + " e comparações = "+ avl.getComparacoesTotais());
        System.out.println("Na abb, tempo = "+ abb.getTempoTotal() + " e comparações = "+ abb.getComparacoesTotais());

        ABB<Integer, Integer> abbOrdenada = new ABB<Integer, Integer>();
        AVL<Integer, Integer> avlOrdenada = new AVL<Integer, Integer>();

        Arrays.sort(valores); 
        int valoresOrdenado[] = valores;

        for (int i = 0; i < valores.length; i++) {
            avlOrdenada.inserir(valoresOrdenado[i], valoresOrdenado[i]);
            abbOrdenada.inserir(valoresOrdenado[i], valoresOrdenado[i]);
        }

        for (int i = 0; i < pedidosBusca.length; i++) {
            avlOrdenada.pesquisar(pedidosBusca[i]);
            abbOrdenada.pesquisar(pedidosBusca[i]);
        }

        System.out.println("Na avl, tempo = "+ avlOrdenada.getTempoTotal() + " e comparações = "+ avlOrdenada.getComparacoesTotais());
        System.out.println("Na abb, tempo = "+ abbOrdenada.getTempoTotal() + " e comparações = "+ abbOrdenada.getComparacoesTotais());
    }


}   
