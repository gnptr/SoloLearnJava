package moreclasses;

public class Machine {
    public static void main(String[] args) {
        Machine m = new Machine(){
            @Override public void start(){
                System.out.println("Hi");
            }
        };
    }
}
