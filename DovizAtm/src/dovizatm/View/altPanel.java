/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dovizatm.View;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author krmtt
 */
public class altPanel extends JPanel{
    
    public JButton Btn_TLCebeAt, Btn_EuroCebeAt, Btn_ParaYatir, Btn_KartTak;
    public int Eldeki_TL,Eldeki_Euro;
    public JLabel label_EldekiTL, label_EldekiEuro;
    public Border blackline = BorderFactory.createLineBorder(Color.black);
    
    private static altPanel altpanel = new altPanel();
  
    private altPanel(){
        this.setBounds(300, 500, 766, 268); // Alt Panel 766x268
        this.setBorder(blackline);
        this.setLayout(null);
        
        Btn_TLCebeAt = new JButton("Eldeki TL'yi Cebe At");
        Btn_EuroCebeAt = new JButton("Eldeki Euro'yu Cebe At");
        Btn_ParaYatir = new JButton("Elindeki Paraları Yatır");
        Btn_KartTak = new JButton("Atm'ye Kartı Tak");
        
        Btn_TLCebeAt.setBounds(0,0,170,40);
        Btn_ParaYatir.setBounds(210,40,170,30);
        Btn_KartTak.setBounds(395,40,170,30);
        Btn_EuroCebeAt.setBounds(596,0,170,40);
        
        label_EldekiTL = new JLabel("Elindeki TL : "+Integer.toString(Eldeki_TL) + " TL");
        label_EldekiEuro = new JLabel("Elindeki Euro : "+Integer.toString(Eldeki_Euro)+ " Euro");
        
        label_EldekiTL.setBorder(blackline);
        label_EldekiEuro.setBorder(blackline);
        
        label_EldekiTL.setBounds(0,40,170,100);
        label_EldekiEuro.setBounds(596,40,170,100);
        
        
        this.add(Btn_TLCebeAt);
        this.add(Btn_EuroCebeAt);
        this.add(Btn_ParaYatir);
        this.add(Btn_KartTak);
        
        this.add(label_EldekiTL);
        this.add(label_EldekiEuro);
        
    }

    public static altPanel getAltpanel() {
        return altpanel;
    }
    
}
