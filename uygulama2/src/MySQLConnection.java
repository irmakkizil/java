public class MySQLConnection implements DatabasePlatform {
    @Override
    public void configureConnection() {
        System.out.println("MySQL veritabanı için bağlantı sağlandı");
    }
}
