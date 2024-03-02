/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymophismpakaian;

/**
 *
 * @author user
 */
public class PolymophismPakaian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pakaian PKN = new Pakaian ();
        BajuKaos BK = new BajuKaos ();
        BajuBatik BB = new BajuBatik ();
        BajuOlahraga BO = new BajuOlahraga ();
        
        PKN.tampilharga();
        BK.tampilharga();
        BB.tampilharga();
        BO.tampilharga();
    }
    
}
