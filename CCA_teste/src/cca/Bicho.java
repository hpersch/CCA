
package cca;

import java.util.Calendar;
import java.text.*;
import java.util.Date;

public class Bicho{
    
    private int numAnimal;
    private double valorAnimal;
    private String raça;
    private String sexo;
    private Date dataCompra;

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }
    private String origemCompra;
    
    public Bicho (int num, double valor, String raça, String sexo, String origemCompra, Date dataCompra){
    this.numAnimal = num;
    this.valorAnimal = valor;
    this.raça = raça;
    this.sexo = sexo;
    this.origemCompra = origemCompra;
    this.dataCompra = dataCompra;
}

    public int getNumAnimal() {
        return numAnimal;
    }

    public void setNumAnimal(int numAnimal) {
        this.numAnimal = numAnimal;
    }

    public double getValorAnimal() {
        return valorAnimal;
    }

    public void setValorAnimal(double valorAnimal) {
        this.valorAnimal = valorAnimal;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getOrigemCompra() {
        return origemCompra;
    }

    public void setOrigemCompra(String origemCompra) {
        this.origemCompra = origemCompra;
    }
   
    
    //imprime
    public void mostra(){
        System.out.println("Numero da etiqueta: " + getNumAnimal());
        System.out.println("Preço: R$" + getValorAnimal() );
        System.out.println("Raça: " + getRaça());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Data da compra: " + getDataCompra());
        System.out.println("Origem: " + getOrigemCompra());
        //teste
    }
    
}


