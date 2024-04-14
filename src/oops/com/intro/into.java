package oops.com.intro;

//import oops.com.access_modifiers.Test;

public class into {
    public static void main(String[] args) {
//        Test t = new Test();
//        t.display();
        car benz = new car();
        benz.color = "White";
        benz.speed = 320;
        benz.seats = 5;
        car audi = new car();
        car bmw = new car("Black",240,7);
//        audi.print_attribute();
//        benz.print_attribute();
        bmw.print_attribute();

        student s1 = new student(1,"vignesh","viggumurari@gamil.com","9903378",9);
//        s1.print();
    }

     static class car{
        String color;
        int speed;
        int seats;
        car(){
            color = "red";
            speed = 180;
//            seats = 4;
        }
        car(String color , int speed,int s){
            this.color = color;
            this.speed = speed;
            seats = s;
        }
         void print_attribute(){
            System.out.println(color);
            System.out.println(speed);
            System.out.println(seats);
        }


    }
    static class student{
        int id;
        String name;
        String email;
        String phone_num;
        int standard;
        student(int i,String n,String e,String p,int s){
            id = i;
            name = n;
            email = e;
            phone_num = p;
            standard = s;

        }





        void print(){
            System.out.println("id:"+id);
            System.out.println("name:"+name);
            System.out.println("email:"+email);
            System.out.println("Phone number:"+phone_num);
            System.out.println("class:"+standard);
        }

    }
}
