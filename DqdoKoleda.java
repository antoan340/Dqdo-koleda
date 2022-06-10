public class DqdoKoleda {

    private static DqdoKoleda instance;

    private DqdoKoleda() {
        // TODO Auto-generated constructor stub
    }

    public static DqdoKoleda getInstance() {

        if(instance == null) {
            instance = new DqdoKoleda();
        }

        return instance;
    }

    public void postMessage(String message) {
        System.out.println("Posting a message" + message);
    }

}