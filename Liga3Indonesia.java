/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesi4class;


    public class Liga3Indonesia extends LigaIndonesia{
    @Override
    public void ligaINDO(){
        super.ligaINDO();
        System.out.println("PERSIKABUMI");
        System.out.println("PERSI KOTA SUKABUMI");
        System.out.println("PERSIKAB");
        System.out.println("BOGOR RAYA");
        System.out.println("SUKABUMI 28");
        
    }

    public static void main(String[] args) {
        Liga2Indonesia n = new Liga2Indonesia();

        n.ligaINDO();
    }
}
