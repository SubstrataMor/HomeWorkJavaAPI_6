import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("HP Pavilion dv7", 32, 2 ,  "Windows10", "Silver"));
        set.add(new Notebook("Asus VivoBook", 64, 4, "Windows11", "Black"));
        set.add(new Notebook("Dell Inspiron", 16, 2,  "Windows7", "Gray"));
        set.add(new Notebook("Lenovo IdeaPad", 8, 1,  "linux", "White"));

        FilteringMethods operation = new FilteringMethods(set);
        operation.start();
    }
}
