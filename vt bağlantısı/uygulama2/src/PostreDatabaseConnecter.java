public class PostreDatabaseConnecter implements DatabaseConnecter {
    protected  DatabasePlatform platform;
    public PostreDatabaseConnecter(DatabasePlatform platform) {
        this.platform = platform;
    }
    @Override
    public void connect(){
        System.out.println("Postre vt baglantı saglanıyor");
        platform.configureConnection();
    }
    @Override
    public void executeQuery(String query){
        System.out.println("sorgu çalıştırıldı sonuçlar bekleniyor"+query);
    }
}
