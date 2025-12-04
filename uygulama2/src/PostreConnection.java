public class PostreConnection implements DatabasePlatform {
    @Override
    public void configureConnection() {
        System.out.println("Postre veritabanı için bağlantı sağlandı");
    }
}
