/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.View;

import dovizatm.Controller.ustPanelMethods;
import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author burak
 */
public class ElektrikOdeEkrani extends FaturaveHavale{
    
    private static ElektrikOdeEkrani elektrikodeekrani = new ElektrikOdeEkrani();
    
    private ElektrikOdeEkrani(){
        ustPanelMethods.tasarla(this);
        
        no = new JLabel("Abone Numarası : ");
        
        no.setBounds(0,0,200,40);
        Txtfield_No.setBounds(200,0,100,40);
        Btn_Ode.setBounds(0,110,200,100);
        Btn_GeriDon.setBounds(0,220,200,100);
        Btn_AnaEkranaDon.setBounds(0,330,200,100);
        
        this.add(no);
        this.add(Txtfield_No);
        this.add(Btn_Ode);
        this.add(Btn_GeriDon);
        this.add(Btn_AnaEkranaDon);
    }

    public static ElektrikOdeEkrani getElektrikodeekrani() {
        return elektrikodeekrani;
    }
    
}
