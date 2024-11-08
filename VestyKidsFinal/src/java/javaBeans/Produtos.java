package javaBeans;

import java.io.InputStream;

public class Produtos {

    int pkProd;
    String descricao;
    InputStream foto;
    double valor;
    String nome;

    public boolean buscar() {
        return true;
    }

    public void incluir() {
    }

    public void alterar() {
    }

    public void deletar() {
    }

    public void gravar() {

        if (buscar()) {
            alterar();
        } else {
            incluir();
        }
    }
}

 
