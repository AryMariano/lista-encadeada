package one.digitalinnovation;

public class No<T> {

    private T conteudo;
    private No noRef;

    public No() {

    }

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.noRef = null;
    }

    public No(T conteudo, No noRef) {
        this.conteudo = conteudo;
        this.noRef = noRef;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getNoRef() {
        return noRef;
    }

    public void setNoRef(No noRef) {
        this.noRef = noRef;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }

    public String toStringEncadeado() {
        String str = "No [conteudo=" + conteudo + "]";
        if (noRef != null) {
            str += "->" + noRef.toString();
        } else {
            str += "->null";
        }
        return str;
    }

}
