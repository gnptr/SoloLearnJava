package last;

import java.io.File;
public class workingwithfiles {
    public static void main(String[] args) {
        File file = new file("a.txt");
        if(file.exists()){
            System.out.println("yes");
        }
    }
}
