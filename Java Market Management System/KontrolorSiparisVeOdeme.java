public class KontrolorSiparisVeOdeme
{
    private GUI_SiparisVeOdeme guiSiparisVeOdeme;
    private SiparisVeOdeme p_siparisVeOdeme;
    
    public KontrolorSiparisVeOdeme()
    {
      guiSiparisVeOdeme = new GUI_SiparisVeOdeme (this);
      p_siparisVeOdeme = new SiparisVeOdeme (" ");
    }

    protected void siparisVeOdemeBilgileriKayit (String p_siparisID)
    {
        System.out.println(p_siparisID + " id'li ürünün siparisi kaydedilmiştir.");
    }
}