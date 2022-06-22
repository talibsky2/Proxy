public class Server implements Request{
    String path;

    public Server(String path) {
        this.path = path;
        load();
    }

    void load (){
        System.out.println("Loading.... " + path);
    }

    @Override
    public void saveAs() {
        System.out.println("Saving.... " + path);
    }
}
