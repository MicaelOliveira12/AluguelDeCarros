package br.com.cars.model;

public class Car {
    public Car(String marca, String modelo, String ano, String opcionais) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        Opcionais = opcionais;
    }
    private String marca;
    private String modelo;
    private String ano;
    private String Opcionais;
    
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
        return Opcionais;
    }
    public void setOpcionais(String opcionais) {
        Opcionais = opcionais;
    }

    
}
