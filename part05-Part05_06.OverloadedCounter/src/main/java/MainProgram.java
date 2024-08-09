
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(0);
        
        counter.decrease();
        counter.increase();
        counter.increase();
        
        System.out.println(counter.value());
    }
}
