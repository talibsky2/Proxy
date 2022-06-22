public class Test {
    public static void main(String[] args) {
        Request r = new Proxy("https://pro.com/java/tutorial/file.pdf");
        r.saveAs();

//        Request rr = new Server("https://pro.com/java/tutorial/file.pdf");
//        rr.saveAs();
    }
}