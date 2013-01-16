
package cca;

import java.util.Calendar;
import java.text.*;
import java.util.Date;

public class Bicho{
    
    private int numAnimal;
    private float valorAnimal;
    private String raça;
    private String sexo;
    private Date dataCompra;
    private String origemCompra;
    
    public Bicho (){
    this.numAnimal = 0;
    this.valorAnimal = 0;
    this.raça = " ";
    this.sexo = " ";
    this.origemCompra = " ";
}

    public int getNumAnimal() {
        return numAnimal;
    }

    public void setNumAnimal(int numAnimal) {
        this.numAnimal = numAnimal;
    }

    public float getValorAnimal() {
        return valorAnimal;
    }

    public void setValorAnimal(float valorAnimal) {
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
    
}


