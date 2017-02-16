package labWork_3_1_1;

import java.io.*;

/**
 * Created by Bulik on 17.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Ivan");
        employee.setAddress("av.Komarova 1");
        employee.setSSN(20160003);
        employee.setNumber(1);

        File file = new File("employee.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(employee);

            Employee employee1 = new Employee();
            employee1.setNumber(2);
            employee1.setSSN(20000032);
            employee1.setAddress("av.Street 45");
            employee1.setName("Dasha");
            oos.writeObject(employee1);

        }catch (FileNotFoundException e){
            System.err.println("File not found!!!");;
        }catch (IOException ee){
            ee.printStackTrace();
        }



    }
}
