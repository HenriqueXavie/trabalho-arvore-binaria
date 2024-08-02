public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    /**
     * método responsável por incluir um valor na árvore binária
     * @param valor
     */
    public void incluir(int valor) {
        this.raiz = incluir(this.raiz, valor);
    }

    private No incluir(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }
        if (valor < no.getValor()) {
            no.setSae(incluir(no.getSae(), valor));
        } else if (valor > no.getValor()) {
            no.setSad(incluir(no.getSad(), valor));
        }
        return no;
    }

    /**
     * método que realiza a exclusão de um valor específico da árvore binária
     * @param valor
     */
    public void excluir(int valor) {
        this.raiz = excluir(this.raiz, valor);
        System.out.println("\nvalor excluído \n"+valor);
    }

    private No excluir(No no, int valor) {
        if (no == null) {
            return null;
        }
        if (valor < no.getValor()) {
            no.setSae(excluir(no.getSae(), valor));
        } else if (valor > no.getValor()) {
            no.setSad(excluir(no.getSad(), valor));
        } else {
            if (no.getSae() == null) {
                return no.getSad();
            } else if (no.getSad() == null) {
                return no.getSae();
            }
            no.setValor(minValor(no.getSad()));
            no.setSad(excluir(no.getSad(), no.getValor()));
        }
        return no;
    }

    private int minValor(No no) {
        int minv = no.getValor();
        while (no.getSae() != null) {
            minv = no.getSae().getValor();
            no = no.getSae();
        }
        return minv;
    }

    /**
     * método de buscar valor na árvore binária
     * @param valor
     * @return
     */
    public boolean buscar(int valor) {
        return buscar(this.raiz, valor);
    }

    private boolean buscar(No no, int valor) {
        if (no == null) {
            return false;
        }
        if (valor == no.getValor()) {
            return true;
        }
        return valor < no.getValor() ? buscar(no.getSae(), valor) : buscar(no.getSad(), valor);
    }

    /**
     * metodo responsável por colocar a árvore binária em listaPreOrdem
     */
    public void listarPreOrdem() {
        System.out.println("\nListarPreOrdem");
        listarPreOrdem(this.raiz);

    }

    private void listarPreOrdem(No no) {
        if (no != null) {
            System.out.print(no.getValor() + " ");
            listarPreOrdem(no.getSae());
            listarPreOrdem(no.getSad());
        }
    }
    /**
     * metodo responsável por colocar a árvore binária em listarInOrdem
     */
    public void listarInOrdem() {
        System.out.println("\nListarInOrdem");
        listarInOrdem(this.raiz);
    }

    private void listarInOrdem(No no) {
        if (no != null) {
            listarInOrdem(no.getSae());
            System.out.print(no.getValor() + " ");
            listarInOrdem(no.getSad());
        }
    }
    /**
     * metodo responsável por colocar a árvore binária em listarPosOrdem
     */
    public void listarPosOrdem() {
        System.out.println("\nListarPosOrdem");

        listarPosOrdem(this.raiz);
    }

    private void listarPosOrdem(No no) {
        if (no != null) {
            listarPosOrdem(no.getSae());
            listarPosOrdem(no.getSad());
            System.out.print(no.getValor() + " ");
        }
    }
}
