/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Mouvement {
    
    private Date date;
    private double soldePrecedent;
    private double montant;

    public Mouvement(Date date, double soldePrecedent, double montant) {
        this.date = date;
        this.soldePrecedent = soldePrecedent;
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getSoldePrecedent() {
        return soldePrecedent;
    }

    public void setSoldePrecedent(double soldePrecedent) {
        this.soldePrecedent = soldePrecedent;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "FechaMov= " + date + ", SaldoAnterior= " + soldePrecedent + ", Cantidad= " + montant;
    }
    
    
    
}
