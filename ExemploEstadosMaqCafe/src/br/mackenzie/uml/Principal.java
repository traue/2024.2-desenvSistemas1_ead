package br.mackenzie.uml;

public class Principal {

    public static void main(String[] args) {
        MaquinaCafe maquina = new MaquinaCafe();

        //caminho "ideal"
        maquina.inseriroeda();
        maquina.bebidaSelecionada();
        maquina.bebidaPreparada();
        maquina.bebidaEntregue();

        //teste de caminho alternativo
        //maquina.inseriroeda();
        //maquina.bebidaSelecionada();
        //maquina.bebidaEntregue();
        //maquina.inseriroeda();

        //testem a vontade os estados para entender melhor esta código!

    }

}
