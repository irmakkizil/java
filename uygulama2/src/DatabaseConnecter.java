public interface DatabaseConnecter {
    void connect();


    void executeQuery(String query);
}
