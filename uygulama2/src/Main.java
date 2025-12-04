public class Main {
    public static void main(String[] args) {
        DatabaseConnecter mySQLDBConnecter=new MySQLDatabaseConnecter(new MySQLConnection());
        mySQLDBConnecter.connect();
        mySQLDBConnecter.executeQuery("SELECT * FROM tbl.users");

        DatabaseConnecter postreDBConnecter=new PostreDatabaseConnecter(new PostreConnection());
        postreDBConnecter.connect();
        postreDBConnecter.executeQuery("SELECT * FROM tbl.users");
    }
}