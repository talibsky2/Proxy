public class Proxy implements Request{
    String path;
    Server server;

    public Proxy(String path) {
        this.path = path;
    }

    @Override
    public void saveAs() {
        if (server == null){
            server = new Server(path);
        }
        server.saveAs();
    }
}
