public class KontrolorMusteri
{
    private GUI_Musteri  guiMusteri;
    private Musteri p_musteri;
    

    public KontrolorMusteri() 
    {
        guiMusteri = new GUI_Musteri (this);
        p_musteri = new Musteri (" ");
    }
    
    protected void MusteriBilgileriKayıt (String musteriAdi, String musteriSoyadi, String telefonNu, String adresi)
    {
        System.out.println("Müşteri Adı: " + musteriAdi + "\nMüşteri Soyadı: " + musteriSoyadi + "\nTelefon No: " + telefonNu + "\nAdresi: "  + adresi);
    }
}