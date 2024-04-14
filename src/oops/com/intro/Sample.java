package oops.com.intro;

public class Sample {
    String name ;
    int age;
    String address;

    public Sample(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }

    public static void main(String[] args) {
        Sample stud1 = new Sample("vignesh", 24, "kodad");
        System.out.println(stud1.getName());
        System.out.println(stud1.getAge());
        System.out.println(stud1.getAddress());
        System.out.println(stud1.name);
//        oops.com.intro.Sample.setName("krishna");
//        System.out.println(oops.com.intro.Sample.getName());

    }
}
