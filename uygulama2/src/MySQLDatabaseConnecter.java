public class MySQLDatabaseConnecter implements DatabaseConnecter {
    protected  DatabasePlatform platform;
    public MySQLDatabaseConnecter(DatabasePlatform platform) {
        this.platform = platform;
    }
    @Override
    public void connect(){
        System.out.println("MySql vt baglantı saglanıyor");
        platform.configureConnection();
    }
    @Override
    public void executeQuery(String query){
        System.out.println("sorgu çalıştırıldı sonuçlar bekleniyor"+query);
    }
}
