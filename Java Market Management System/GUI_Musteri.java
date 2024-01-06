import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_Musteri extends JFrame 
{
    private JFrame pencere;
    private Container bilesenKonteyneri;
    private JPanel p_Panel;
    private JTextField t_MusteriAdi, t_MusteriSoyad, t_TelefonNu, t_Adres;
    private JLabel l_MusteriAdi, l_MusteriSoyad, l_TelefonNu, l_Adres;
    private JButton b_Kaydet;
    private OlayDinleyicisi olayDinleyici;
    KontrolorMusteri kontrolor;

    public GUI_Musteri(KontrolorMusteri p_kontrolor)
    {
        kontrolor = p_kontrolor;
        olayDinleyici = new OlayDinleyicisi();
        pencereHazirla(pencere);
        panelHazirla(pencere);
        pencere.setVisible(true);
    }
    
    public GUI_Musteri()
    {
        olayDinleyici = new OlayDinleyicisi();
        pencereHazirla(pencere);
        menuBarHazirla(pencere);
        panelHazirla(pencere);
        pencere.setVisible(true);
    }
    
    private void pencereHazirla(JFrame p_Pencere) 
    {
        pencere = new JFrame("Müşteri Bilgi Giriş Ekranı");
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setSize(700, 400);
    }
    
    public void panelHazirla(JFrame p_Pencere) 
    {
        p_Panel  = new JPanel();
        b_Kaydet = new JButton("KAYDET");
        b_Kaydet.addActionListener(olayDinleyici);

        l_MusteriAdi = new JLabel("Müşteri AD :");
        t_MusteriAdi = new JTextField(10);
        l_MusteriSoyad = new JLabel("Müşteri SOYAD :");
        t_MusteriSoyad = new JTextField(10);
        l_TelefonNu = new JLabel("Telefon Numarası:");
        t_TelefonNu = new JTextField(10);
        l_Adres = new JLabel("Müşteri ADRES:");
        t_Adres = new JTextField(10);

        p_Panel.add(l_MusteriAdi);
        p_Panel.add(t_MusteriAdi);
        p_Panel.add(l_MusteriSoyad);
        p_Panel.add(t_MusteriSoyad);
        p_Panel.add(l_TelefonNu);
        p_Panel.add(t_TelefonNu);
        p_Panel.add(l_Adres);
        p_Panel.add(t_Adres);
        
        p_Panel.add(b_Kaydet);
        p_Pencere.add(p_Panel);
    }
    
    private void menuBarHazirla(JFrame p_Pencere) 
    {
        JMenuBar menuBar = new JMenuBar();

        JMenu m_MusteriBilgiMenusu = new JMenu("Müşteri Bilgileri");
        JMenuItem mi_m1, mi_m2, mi_m3;
        mi_m1 = new JMenuItem("Müşteri Ad/Soyad Bilgileri");
        mi_m2 = new JMenuItem("Müşteri İletişim Bilgileri");
        mi_m3 = new JMenuItem("Müşteri Diğer Bilgileri");

        m_MusteriBilgiMenusu.add(mi_m1);
        m_MusteriBilgiMenusu.add(mi_m2);
        m_MusteriBilgiMenusu.add(mi_m3);

        menuBar.add(m_MusteriBilgiMenusu);
        p_Pencere.setJMenuBar(menuBar);
    }
    
    private class OlayDinleyicisi implements ActionListener 
    {
        public void actionPerformed(ActionEvent event) 
        {
            if (event.getSource() == b_Kaydet) 
            {
                kontrolor.MusteriBilgileriKayıt(t_MusteriAdi.getText(), t_MusteriSoyad.getText(), t_TelefonNu.getText(), t_Adres.getText());
            }
        }
    }
}


