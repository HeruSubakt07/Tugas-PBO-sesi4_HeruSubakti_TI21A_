/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesi4class;

/**
 *
 * @author ASUS
 */
public class Liga1Indonesia extends LigaIndonesia {
     @Override
     public void ligaINDO(){
        super.ligaINDO();
        System.out.println("PERSIB");
        System.out.println("PERSIPURA");
        System.out.println("PERSIJA");
        System.out.println("PERSEBAYA");
        System.out.println("AREMA");
        
    }

    public static void main(String[] args) {
        Liga1Indonesia L = new Liga1Indonesia();

        L.ligaINDO();
    }
}

