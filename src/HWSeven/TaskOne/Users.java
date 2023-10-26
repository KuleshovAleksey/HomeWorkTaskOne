package HWSeven.TaskOne;

import java.util.Objects;

public class Users {

    public String name;
    public String PhoneNumber;
    public int age;

    public Users(String name, String phoneNumber, int age) {
        this.name = name;
        this.PhoneNumber = phoneNumber;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return age == users.age && name.equals(users.name) && PhoneNumber.equals(users.PhoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, PhoneNumber, age);
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Users[] users = new Users[5];
        users[0] = new Users("Ivan", "+375299876532", 18);
        users[1] = new Users("Petr", "+375331234578", 33);
        users[2] = new Users("Semen", "+375253332211", 45);
        users[3] = new Users("Ivan", "+375299876532", 18);
        users[4] = new Users("Aleks", "+375291112233", 18);

        Users whatLooking1 = new Users("Ivan", "+375299876532", 18);
        Users whatLooking2 = new Users("Petr", "+375331234578", 33);

for(int i =0; i< users.length; i++){
    if (whatLooking1.equals(users[i])) {
        System.out.println(users[i] + " на позиции " + i + " имеет хешкод " + users[i].hashCode());
    }
}
for(int i =0; i< users.length; i++){
    if(whatLooking2.hashCode()==users[i].hashCode()){
        System.out.println("Искомый объект " + users[i].toString() + " имеет hashCode " + users[i].hashCode());
    }
}



        }
    }


