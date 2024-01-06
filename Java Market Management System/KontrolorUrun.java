public class KontrolorUrun
{
    private GUI_Urun guiUrun;
    private Urun p_Urun;
    
    public KontrolorUrun()
    {
      guiUrun = new GUI_Urun(this);
      p_Urun = new Urun(" ");
    }

    protected void urunBilgileriKayit (String p_urunID, String p_urunAdi)
    {
        System.out.println(p_urunID + " id'li ürünün" + " adı: " + p_urunAdi+ " olarak kaydedilmistir.");
    }
}
