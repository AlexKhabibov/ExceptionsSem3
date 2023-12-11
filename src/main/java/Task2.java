import javax.imageio.IIOException;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"1", "2", "ert", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        try {
            System.out.println(Task4.sumArray2D(array));
        }catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }
//        try (Counter counter = new Counter()) {
//            counter.add();
//            counter.add();
//            counter.add();
//            System.out.println(counter.getCount());
//            counter.close();
//            counter.add();
//        } catch (IIOException e){
//            System.out.println(e.getMessage());
//        }
    }
}
