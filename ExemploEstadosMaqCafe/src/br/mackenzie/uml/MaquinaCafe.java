package br.mackenzie.uml;

public class MaquinaCafe {

    private EstadoMaquina estado;

    public MaquinaCafe() {
        this.estado = EstadoMaquina.OCIOSA;
        System.out.println("A máquina está pronta! Estado atual: " + this.estado);
    }

    public void inseriroeda() {
        if (this.estado == EstadoMaquina.OCIOSA) {
            this.estado = EstadoMaquina.SELECIONANDO;
            System.out.println("Meio de pagamento ok... Escolha a bebida...");
        } else {
            System.out.println("Ação inválida. A máquina precisa estar ociosa para essa ação!");
            System.out.println("Estado atual: " + this.estado);
        }
    }

    public void bebidaSelecionada() {
        if (estado == EstadoMaquina.SELECIONANDO) {
            estado = EstadoMaquina.PREPARANDO;
            System.out.println("Preparando sua bebida....! :D");
        } else {
            System.out.println("Açao inválida: Para preparar a bebida, é preciso selecionr a opção!");
            System.out.println("Estado atual: " + estado);
        }
    }

    public void bebidaPreparada() {
        if (estado == EstadoMaquina.PREPARANDO) {
            estado = EstadoMaquina.DISPENSANDO;
            System.out.println("Bebida pronta.. dispensando!");
        } else {
            System.out.println("Ação inválida. Para dispensar a bebida é preciso estar preparando!");
            System.out.println("Estado atual: " + estado);
        }
    }

    public void bebidaEntregue() {
        if (estado == EstadoMaquina.DISPENSANDO) {
            estado = EstadoMaquina.OCIOSA;
            System.out.println("Máquina de volta ao estado ociosa! Pode levar sua bebida!");
        } else {
            System.out.println("Ação inválida. Para retornar a ociosa ela precisa estar dispensando!");
            System.out.println("Estado atual: " + estado);
        }
    }

}
