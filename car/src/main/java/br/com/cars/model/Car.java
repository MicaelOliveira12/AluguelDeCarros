package br.com.cars.model;

public class Car {

    private String marca;
    private String modelo;
    private String ano;
    private String opcionais;
    private String transmissao;

    public Car(String marca, String modelo, String ano, String opcionais, String transmissao) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.opcionais = opcionais;
        this.transmissao = transmissao;
    }

    public String getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

}
