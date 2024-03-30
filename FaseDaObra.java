package introducao.avaliacao1;

import java.util.ArrayList;

public class FaseDaObra {
    
    private String nome;
    private ArrayList<ItemDeConstrucao> listaItens = new ArrayList<>();
    private ArrayList<Construtor> listaConstrutores = new ArrayList<>();
    private Engenheiro encarregado;
    

    public Engenheiro getEncarregado() {
        return encarregado;
    }

    public void setEncarregado(Engenheiro encarregado) {
        this.encarregado = encarregado;
    }

    public ArrayList<ItemDeConstrucao> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemDeConstrucao> listaItens) {
        this.listaItens = listaItens;
    }

    public ArrayList<Construtor> getListaConstrutores() {
        return listaConstrutores;
    }

    public void setListaConstrutores(ArrayList<Construtor> listaConstrutores) {
        this.listaConstrutores = listaConstrutores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float calcularValorTotalDaFaseDaObra(){
        
        float valorTotalFase = 0;
        
        for (var umItem : listaItens) {
            float valorTotalProduto = 0;
            valorTotalProduto = umItem.getProduto().getPreco() * umItem.getQuantidade();
            
            valorTotalFase = valorTotalFase + valorTotalProduto;
            
        }
        float totalSalariosConstrutores = 0;
        
        for (var umConstrutor : listaConstrutores) {
            totalSalariosConstrutores = totalSalariosConstrutores + umConstrutor.getSalario();
        }
            
        valorTotalFase = valorTotalFase +  totalSalariosConstrutores;
        valorTotalFase = valorTotalFase + getEncarregado().getSalario(); 
        
        return valorTotalFase;
    }
}
