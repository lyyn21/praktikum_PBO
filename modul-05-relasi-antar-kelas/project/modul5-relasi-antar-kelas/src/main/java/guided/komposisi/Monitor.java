package guided.komposisi;

public class Monitor {
    private String brand;
    
    public Monitor(String brand){
        this.brand = brand;
    }

    public void DisplaySpec() {
        System.out.println(this.brand);
    }
}
