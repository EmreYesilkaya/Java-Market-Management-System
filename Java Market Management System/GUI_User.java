import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_User extends JFrame 
{
    private JFrame pencere;
    private Container bilesenKonteyneri;
    private JPanel p_Panel;
    private JTextField p_kullaniciID, p_kullaniciAdi, p_kullaniciSoyadi, p_kullaniciSifresi;
    private JLabel t_kullaniciID, t_kullaniciAdi, t_kullaniciSoyadi, t_kullaniciSifresi;
    private JButton b_Kaydet;
    private OlayDinleyicisi olayDinleyici;
    KontrolorUser kontrolor;
    
    public GUI_User (KontrolorUser p_kontrolor)
    {
        kontrolor = p_kontrolor;
        olayDinleyici = new OlayDinleyicisi();
        pencereHazirla(pencere);
        panelHazirla(pencere);
        pencere.setVisible(true);
    }

    public GUI_User() 
    {
        olayDinleyici = new OlayDinleyicisi();
        pencereHazirla(pencere);
        menuBarHazirla (pencere); 
        panelHazirla(pencere);
        pencere.setVisible(true);
    }

    private void pencereHazirla(JFrame p_Pencere) 
    {
        pencere = new JFrame("User Bilgi Giriş Ekranı");
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setSize(700, 400);
    }

    public void panelHazirla(JFrame p_Pencere) 
    {
        p_Panel  = new JPanel();
        b_Kaydet = new JButton("KAYDET");
        b_Kaydet.addActionListener(olayDinleyici);
        
        t_kullaniciID = new JLabel("Kullanıcı ID'si :");
        p_kullaniciID = new JTextField(10);
        t_kullaniciAdi = new JLabel("Kullanıcı Adı :");
        p_kullaniciAdi = new JTextField(10);
        t_kullaniciSoyadi = new JLabel("Kullanıcı Soyadı :");
        p_kullaniciSoyadi = new JTextField(10);
        t_kullaniciSifresi = new JLabel("Kullanıcı Rolü:");
        p_kullaniciSifresi = new JTextField(10);

        p_Panel.add(t_kullaniciID);
        p_Panel.add(p_kullaniciID);
        p_Panel.add(t_kullaniciAdi);
        p_Panel.add(p_kullaniciAdi);
        p_Panel.add(t_kullaniciSoyadi);
        p_Panel.add(p_kullaniciSoyadi);
        p_Panel.add(t_kullaniciSifresi);
        p_Panel.add(p_kullaniciSifresi);

        p_Panel.add(b_Kaydet);
        p_Pencere.add(p_Panel);
    }
    
    private void menuBarHazirla(JFrame p_Pencere) 
    {
        JMenuBar menuBar = new JMenuBar();

        JMenu p_userBilgisiMenusu = new JMenu("Kullanıcı Bilgileri");
        JMenuItem p_u1, p_u2, p_u3, p_u4;
        p_u1 = new JMenuItem("Kullanıcı ID'si");
        p_u2 = new JMenuItem("Kullanıcı Adı");
        p_u3 = new JMenuItem("Kullanıcı Soyadı");
        p_u4 = new JMenuItem("Kullanıcı Rolü");

        p_userBilgisiMenusu.add(p_u1);
        p_userBilgisiMenusu.add(p_u2);
        p_userBilgisiMenusu.add(p_u3);
        p_userBilgisiMenusu.add(p_u4);

        menuBar.add(p_userBilgisiMenusu);
        p_Pencere.setJMenuBar(menuBar);
    }
    
    private class OlayDinleyicisi implements ActionListener 
    {
        public void actionPerformed(ActionEvent event) 
        {
            if (event.getSource() == b_Kaydet) 
            {
                kontrolor.userBilgileriKayit(p_kullaniciID.getText(), p_kullaniciAdi.getText(), p_kullaniciSoyadi.getText(), p_kullaniciSifresi.getText());
            }
        }
    }
}