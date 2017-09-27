/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Banque {
    
    private String code;
    private List<Compte> listCompte;
    private List<Type> listTypes;

    public Banque(String code) {
        this.code = code;
        listCompte = new ArrayList<>();
        listTypes = new ArrayList<>();
    }

    public List<Compte> getListCompte() {
        return listCompte;
    }

    public void setListCompte(List<Compte> listCompte) {
        this.listCompte = listCompte;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public void addCompte(Compte compte){        
        listCompte.add(compte);
    }
    
    public void addType(Type type){
        listTypes.add(type);
    }
    
    public String listAll(){
        String exit = "";
        for (int i = 0; i < listCompte.size(); i++) {
            exit += "\n"+listCompte.get(i).toString() + listTypes.get(i).getCode() + 
                    listCompte.get(i).getListMov().get(i).toString();
        }        
        return exit;
    }
    
}
