public class No {
    private No sae;
    private No sad;
    private Integer valor;

    public No(Integer valor) {
        this.valor = valor;
        this.sae = null;
        this.sad = null;
    }

    public No getSae() {
        return sae;
    }

    public void setSae(No sae) {
        this.sae = sae;
    }

    public No getSad() {
        return sad;
    }

    public void setSad(No sad) {
        this.sad = sad;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
