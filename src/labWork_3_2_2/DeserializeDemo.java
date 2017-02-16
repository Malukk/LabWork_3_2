package labWork_3_2_2;

import labWork_3_1_1.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by Bulik on 17.09.2016.
 */
public class DeserializeDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        Employee employee = null;
        try (ObjectInputStream ois = new ObjectInputStream( new FileInputStream("employee.ser"))) {
            while ((employee = (Employee)ois.readObject()) !=null){
            System.out.println(employee);
            }
        }catch (IOException ee){
            ee.printStackTrace();
        }
    }
}
