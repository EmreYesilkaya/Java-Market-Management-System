import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_SiparisVeOdeme extends JFrame 
{      
    private JFrame pencere;
    private Container bilesenKonteyneri;
    private JPanel p_Panel;
    private JTextField p_siparisID, p_siparisMiktari, p_odenecekTutar, p_siparisTarihi, p_telefonNo, p_siparisDurumu,p_teslimatAdresi;
    private JLabel t_siparisID, t_siparisMiktari, t_odenecekTutar, t_siparisTarihi, t_telefonNo, t_siparisDurumu, t_teslimatAdresi;
    private JButton b_Kaydet;
    private OlayDinleyicisi olayDinleyici;
    KontrolorSiparisVeOdeme kontrolor;

    public GUI_SiparisVeOdeme (KontrolorSiparisVeOdeme p_kontrolor) 
    {
        kontrolor = p_kontrolor;
        olayDinleyici = new OlayDinleyicisi();
        pencereHazirla(pencere);
        menuBarHazirla(pencere);
        panelHazirla(pencere);
        pencere.setVisible(true);
    }

    public GUI_SiparisVeOdeme() 
    {
        olayDinleyici = new OlayDinleyicisi();
        pencereHazirla(pencere);
        menuBarHazirla(pencere); 
        panelHazirla(pencere);
        pencere.setVisible(true);
    }

    private void pencereHazirla(JFrame p_Pencere) 
    {
        pencere = new JFrame("Siparis ve Odeme Bilgi Giriş Ekranı");
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setSize(700, 400);
    }

    public void panelHazirla(JFrame p_Pencere) 
    {
        p_Panel  = new JPanel();
        b_Kaydet = new JButton("KAYDET");
        b_Kaydet.addActionListener(olayDinleyici);
        
        t_siparisID = new JLabel("Siparis ID'si :");
        p_siparisID = new JTextField(10);
        t_siparisMiktari = new JLabel("Siparis Miktari :");
        p_siparisMiktari = new JTextField(10);
        t_odenecekTutar = new JLabel("Odenecek Tutar:");
        p_odenecekTutar = new JTextField(10);
        t_siparisTarihi = new JLabel("Siparis Tarihi");
        p_siparisTarihi = new JTextField(10);
        t_telefonNo = new JLabel("Telefon No");
        p_telefonNo = new JTextField(10);
        t_siparisDurumu = new JLabel("Siparis Durumu");
        p_siparisDurumu = new JTextField(10);
        t_teslimatAdresi = new JLabel("Teslimat Adresi");
        p_teslimatAdresi = new JTextField(10);
        
        p_Panel.add(t_siparisID);
        p_Panel.add(p_siparisID);
        p_Panel.add(t_siparisMiktari);
        p_Panel.add(p_siparisMiktari);
        p_Panel.add(t_odenecekTutar);
        p_Panel.add(p_odenecekTutar);
        p_Panel.add(t_siparisTarihi);
        p_Panel.add(p_siparisTarihi);
        p_Panel.add(t_telefonNo);
        p_Panel.add(p_telefonNo);
        p_Panel.add(t_siparisDurumu);
        p_Panel.add(p_siparisDurumu);
        p_Panel.add(t_teslimatAdresi);
        p_Panel.add(p_teslimatAdresi);

        p_Panel.add(b_Kaydet);
        p_Pencere.add(p_Panel);
    }

    private void menuBarHazirla(JFrame p_Pencere) 
    {
        JMenuBar menuBar = new JMenuBar();

        JMenu p_siparisVeOdemeBilgisiMenusu = new JMenu("Odeme ve Siparis Bilgileri");
        JMenuItem p_u1, p_u2, p_u3, p_u4, p_u5, p_u6, p_u7;
        p_u1 = new JMenuItem("Siparis ID'si");
        p_u2 = new JMenuItem("Siparis Miktari");
        p_u3 = new JMenuItem("Odenecek Tutar");
        p_u4 = new JMenuItem("Siparis Tarihi");
        p_u5 = new JMenuItem("Telefon No");
        p_u6 = new JMenuItem("Siparis Durumu");
        p_u7 = new JMenuItem("Teslimat Adresi");

        p_siparisVeOdemeBilgisiMenusu.add(p_u1);
        p_siparisVeOdemeBilgisiMenusu.add(p_u2);
        p_siparisVeOdemeBilgisiMenusu.add(p_u3);
        p_siparisVeOdemeBilgisiMenusu.add(p_u4);
        p_siparisVeOdemeBilgisiMenusu.add(p_u5);
        p_siparisVeOdemeBilgisiMenusu.add(p_u6);
        p_siparisVeOdemeBilgisiMenusu.add(p_u7);

        menuBar.add(p_siparisVeOdemeBilgisiMenusu);
        p_Pencere.setJMenuBar(menuBar);
    }

    private class OlayDinleyicisi implements ActionListener 
    {
        public void actionPerformed(ActionEvent event) 
        {
            if (event.getSource() == b_Kaydet) 
            {
                kontrolor.siparisVeOdemeBilgileriKayit(p_siparisID.getText());
            }
        }
     }
}