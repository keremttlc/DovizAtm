/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.View;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Pencere extends JFrame{
    
    public Pencere(){
        this.setTitle("Döviz Atm");// Pencerenin adını ayarlar
        this.setSize(1366 , 768);//Açılacak pencerenin boyutunu 1366x768 ayarlar
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);//Ekranı yeniden boyutlandırmayı devre dışı bırakır
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Uygulamayı kapatınca build'u da durdurur.
    }
    
}
