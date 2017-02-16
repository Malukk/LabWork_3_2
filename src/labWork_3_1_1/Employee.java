package labWork_3_1_1;

import java.io.Serializable;

/**
 * Created by Bulik on 17.09.2016.
 */
public class Employee implements Serializable {
        private String name, address;
        private int SSN;
        private int number;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getSSN() {
        return SSN;
    }
    public void setSSN(int SSN) {
        this.SSN = SSN;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return  "name=" + name + ", address=" + address + ", SSN=" + SSN + ", number=" + number;

    }

}
