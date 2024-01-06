import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_Urun extends JFrame 
{
    private JFrame pencere;
    private Container bilesenKonteyneri;
    private JPanel p_Panel;
    private JTextField p_urunID, p_urunAdi, p_urunGrubu, p_tedarikci, p_satisBirimi;
    private JTextField p_urunfiyati, p_satisMiktari, p_subeKodu;
    private JLabel t_urunID, t_urunAdi, t_urunGrubu, t_tedarikci, t_satisBirimi;
    private JLabel t_urunfiyati, t_satisMiktari, t_subeKodu;
    private JButton b_Kaydet;
    private OlayDinleyicisi olayDinleyici;
    KontrolorUrun kontrolor;

    public GUI_Urun (KontrolorUrun p_kontrolor) 
    {
        kontrolor = p_kontrolor;
        olayDinleyici = new OlayDinleyicisi();
        pencereHazirla(pencere);
        menuBarHazirla(pencere);
        panelHazirla(pencere);
        pencere.setVisible(true);
    }

    public GUI_Urun() 
    {
        olayDinleyici = new OlayDinleyicisi();
        pencereHazirla(pencere);
        menuBarHazirla(pencere); 
        panelHazirla(pencere);
        pencere.setVisible(true);
    }

    private void pencereHazirla(JFrame p_Pencere) 
    {
        pencere = new JFrame("Ürün Bilgi Giriş Ekranı");
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setSize(700, 400);
    }

    public void panelHazirla(JFrame p_Pencere) 
    {
        p_Panel  = new JPanel();
        b_Kaydet = new JButton("KAYDET");
        b_Kaydet.addActionListener(olayDinleyici);

        t_urunID = new JLabel("Urun ID'si :");
        p_urunID = new JTextField(10);
        t_urunAdi = new JLabel("Urun Adı :");
        p_urunAdi = new JTextField(10);
        t_urunGrubu = new JLabel("Urun Türü :");
        p_urunGrubu = new JTextField(10);
        t_urunfiyati = new JLabel("Urun Fiyati:");
        p_urunfiyati = new JTextField(10);

        p_Panel.add(t_urunID);
        p_Panel.add(p_urunID);
        p_Panel.add(t_urunAdi);
        p_Panel.add(p_urunAdi);
        p_Panel.add(t_urunGrubu);
        p_Panel.add(p_urunGrubu);
        p_Panel.add(t_urunfiyati);
        p_Panel.add(p_urunfiyati);

        p_Panel.add(b_Kaydet);
        p_Pencere.add(p_Panel);
    }

    private void menuBarHazirla(JFrame p_Pencere) 
    {
        JMenuBar menuBar = new JMenuBar();

        JMenu p_urunBilgisiMenusu = new JMenu("Ürün Bilgileri");
        JMenuItem p_u1, p_u2, p_u3, p_u4;
        p_u1 = new JMenuItem("Urun ID'si");
        p_u2 = new JMenuItem("Urun Adi");
        p_u3 = new JMenuItem("Urun Grubu");
        p_u4 = new JMenuItem("Urun Satis Fiyati");

        p_urunBilgisiMenusu.add(p_u1);
        p_urunBilgisiMenusu.add(p_u2);
        p_urunBilgisiMenusu.add(p_u3);
        p_urunBilgisiMenusu.add(p_u4);

        menuBar.add(p_urunBilgisiMenusu);
        p_Pencere.setJMenuBar(menuBar);
    }

    private class OlayDinleyicisi implements ActionListener 
    {
        public void actionPerformed(ActionEvent event) 
        {
            if (event.getSource() == b_Kaydet) 
            {
                kontrolor.urunBilgileriKayit (p_urunID.getText(),p_urunAdi.getText());
            }
        }
    }
}
