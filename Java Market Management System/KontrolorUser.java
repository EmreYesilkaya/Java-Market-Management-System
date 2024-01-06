public class KontrolorUser 
{
    private GUI_User guiUser;
    private User p_user;

    public KontrolorUser() 
    {
        guiUser = new GUI_User(this); 
        p_user = new User(" "); 
    }

    protected void userBilgileriKayit (String p_kullaniciID, String p_kullaniciAdi, String p_kullaniciSoyadi, String p_kullaniciSifresi) 
    {
        System.out.println(p_kullaniciID + " id'li kullanıcının" + " adı: " + p_kullaniciAdi + " soyadi: " + p_kullaniciSoyadi + " sifresi: " + p_kullaniciSifresi + " olarak kaydedilmistir.");
    }
}