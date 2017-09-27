/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Compte {
    
    private  int numberCompte;
    private  double soldeCourant;
    private  Date dateCreation;
    private String nomClient;
    private List<Mouvement> listMov;

    public Compte(int numberCompte, double soldeCourant, Date dateCreation, String nomClient) {
        this.numberCompte = numberCompte;
        this.soldeCourant = soldeCourant;
        this.dateCreation = dateCreation;
        this.nomClient = nomClient;
        listMov = new ArrayList<>();
    }

    public List<Mouvement> getListMov() {
        return listMov;
    }

    public void setListMov(List<Mouvement> listMov) {
        this.listMov = listMov;
    }
    
    

    public int getNumberCompte() {
        return numberCompte;
    }

    public void setNumberCompte(int numberCompte) {
        this.numberCompte = numberCompte;
    }

    public double getSoldeCourant() {
        return soldeCourant;
    }

    public void setSoldeCourant(double soldeCourant) {
        this.soldeCourant = soldeCourant;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public void addMove(Mouvement mouvement){
        listMov.add(mouvement);
    } 

    @Override
    public String toString() {
        return "NumeroCuenta= " + numberCompte + ", SaldoCuenta= " + soldeCourant + 
                ", FechaCreacion= " + dateCreation + ", nomClient= " + nomClient + "  ";
    }
    
    
}
