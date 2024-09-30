package one.digitalinnovation;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }
    
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);

        if (this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;

        for(int i = 0; i< this.size()-1; i++){
            noAuxiliar = noAuxiliar.getNoRef();
        }
        noAuxiliar.setNoRef(novoNo);
    }

    public No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        

        for(int i = 0; i< this.size()-1; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getNoRef();
        }

        return noRetorno;

    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;

        while(true){
            if(referenciaAux != null){
                tamanhoLista ++;
                if(referenciaAux.getNoRef() != null){
                    referenciaAux = referenciaAux.getNoRef();
                }
                else{
                    break;
                }
            }
            else{
                break;
            }
        }
        return tamanhoLista;
    }

    private void validaIndice(int index){

        if(index >= size()){
            int ultimoIndex= this.size() -1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice: "+ index +"\n a Lista só vai até o índice : " + ultimoIndex);
        }

    }


    public boolean isEmpty(){
        return referenciaEntrada == null? true : false;
    }

}
