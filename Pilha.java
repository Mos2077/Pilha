public class Pilha{

    private Object[] elementos;
    private int quantidade = 0;

    public Pilha (int maximo){
        elementos = new Object[maximo];
    }
    private boolean estaVazia() {
        return quantidade == 0;   
    }

    public int tamanho() {
        return quantidade;
    
    }

    public void empilha(Object elementos) {
        if(quantidade == elemento.legth)
          throw new PilhaCheiaException("Não é possível empilhar mais elementos")
        this.elementos = elemento;
        quantidade++;
    }

    public Object topo() {
       return elementos[quantidade-1];
    }

    public Object desempilha() {
        Object topo = topo();
        if(estaVazia())
           throw new PilhaVaziaException("Não é possível desempilhar.");
        quantidade--;
        return topo;
    }
}