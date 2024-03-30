package introducao.avaliacao1;

import java.util.ArrayList;

public class Obra {
    
    private ArrayList<FaseDaObra> listaFases = new ArrayList<>();

    public ArrayList<FaseDaObra> getListaFases() {
        return listaFases;
    }

    public void setListaFases(ArrayList<FaseDaObra> listaFases) {
        this.listaFases = listaFases;
    }

    public String listarDadosDaObra(){
        StringBuilder montadorString = new StringBuilder();

        for (FaseDaObra umaFaseDaObra : listaFases) {
            montadorString.append("\n");
            montadorString.append("\nNome fase da obra: " + umaFaseDaObra.getNome());
            
            for (ItemDeConstrucao umItemDeConstrucao : umaFaseDaObra.getListaItens()) {
                montadorString.append("\n");
                montadorString.append("\n Item usado: " + umItemDeConstrucao.getProduto().getNome());
                montadorString.append("\nPreço do item: " + umItemDeConstrucao.getProduto().getPreco());
                montadorString.append("\nQuantidade do item: " + umItemDeConstrucao.getQuantidade());

            }
            montadorString.append("\n");
            montadorString.append("\nEgenheiro: " + umaFaseDaObra.getEncarregado().getNome());
            montadorString.append("\nNumero do engenheiro: " + umaFaseDaObra.getEncarregado().getNumero());
            montadorString.append("\nSalario do engenheiro: " + umaFaseDaObra.getEncarregado().getSalario());
            montadorString.append("\nFormação do engenheiro: " + umaFaseDaObra.getEncarregado().getFormacao());

            for (Construtor umConstrutor : umaFaseDaObra.getListaConstrutores()) {
                
                montadorString.append("\n");
                montadorString.append("\nNome construtor: " + umConstrutor.getNome());
                montadorString.append("\nNumero construtor: " + umConstrutor.getNumero());
                montadorString.append("\nSalario construtor: " + umConstrutor.getSalario());
                montadorString.append("\nConstrutor Terceirizado: " + umConstrutor.isTerceirizado());

                
            }
            
            
        
        }

        

        return montadorString.toString();
    }

    public float calcularValorTotalDaObra(){
        
        float valorTotalObra = 0;
        for (var umaFaseDaObra : listaFases) {
            valorTotalObra =+ umaFaseDaObra.calcularValorTotalDaFaseDaObra();
        }

        return   valorTotalObra;

    }
}
