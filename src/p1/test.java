/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class test {
    
    public static void main(String[] args) {
        Banque banque = new Banque("Sucursal");
        Compte C1 = new Compte(1, 2000, new Date("15/05/2015"), "Camilo");
        Compte C2 = new Compte(2, 5000, new Date("08/10/2014"), "Brian");
        Type T1 = new Type("Consignacion");
        Type T2 = new Type("Retiro");
        Mouvement M1 = new Mouvement(new Date("25/05/2017 10:00 "), 3000, 40000);
        Mouvement M2 = new Mouvement(new Date("28/07/2017 8:00 " ), 4000, 30000);        
        Mouvement M3 = new Mouvement(new Date("02/04/2017 10:00 "), 2000, 20000);
        Mouvement M4 = new Mouvement(new Date("24/09/2017 8:00 "), 5000, 10000);
        
        banque.addCompte(C1);
        banque.addCompte(C2);
        banque.addType(T1);
        banque.addType(T2);
        C1.addMove(M1);
        C1.addMove(M2);
        C2.addMove(M3);
        C2.addMove(M4);
        
        JOptionPane.showMessageDialog(null, banque.listAll());
    }
}
