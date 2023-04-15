package Esercizi_OOP_Advanced._3;

public class Person {
    String name;
    Integer age;
    String address;

    public Person(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override

    public String toString(){
        return "Nome: "+getName()+" "+
                "Età: "+getAge()+" "+
                "Indirizzo: "+getAddress();
    }

    @Override

    public int hashCode(){
        if(getName()!=null&&getAge()!=null&&getAddress()!=null){
            StringBuilder hash = new StringBuilder();
            hash.append(getName());
            hash.append(getAge());
            hash.append(getAddress());
            return hash.hashCode();

        }else {
            return 0;
        }
    }
}
