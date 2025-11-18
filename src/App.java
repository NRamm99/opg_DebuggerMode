import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            runSimulation();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void runSimulation() throws IOException {
        loadData();
    }

    private static void loadData() throws IOException {
        throw new IOException("This is an IOException!");
    }
}
