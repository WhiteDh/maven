package goit;

import com.google.gson.Gson;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Gson gson = new Gson();
            String json = gson.toJson(new Person("Dmitro", "Itsko"));
            System.out.println(json);
        }
    }

class Person{
    private String name;
    private String lastName;
    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }


}