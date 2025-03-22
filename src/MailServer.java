public class MailServer {

    public void sendEmail() {
        connect();
        disconnect();
        authenticate();
    }

    private void connect() {
        System.out.println("Connect");
    }

    private void disconnect() {
        System.out.println("Disconnect.");
    }

    private void authenticate() {
        System.out.println("Authenticate");
    }

}
