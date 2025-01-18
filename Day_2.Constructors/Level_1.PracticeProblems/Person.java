public class Person {
    String name;    
    double height;
    double weight;

    Person(String name, double height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    Person(Person previouPerson){
        this.name = previouPerson.name;
        this.height = previouPerson.height;
        this.weight = previouPerson.weight;
    }

    public void display(){
        System.out.println("Name: " + name  + "\t" + "Height: " + height +  "\t" + "Wieght" + weight);
    }

    public static void main(String[] args) {
        
        Person abhishek = new Person("Abhishek Vishwakarma" , 176 , 57);
        Person mrVishwakarma = new Person(abhishek);

        abhishek.display();
        mrVishwakarma.display();
    }
}
