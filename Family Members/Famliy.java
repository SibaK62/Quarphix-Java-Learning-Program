public class Famliy
{
    public static void main(String[] args) 
    {
        // Creating instances of Person and its subclasses
        Parent father = new Parent("Zola", 60);
        Child son = new Child("Sipho", 15);
        Uncle uncle = new Uncle("Peter", 45);
        

        // Accessing attributes and printing information
        System.out.println("Parent: " + father.getName() + ", Age: " + father.getAge());
        System.out.println("Child: " + son.getName() + ", Age: " + son.getAge());
        System.out.println("Uncle: " + uncle.getName() + ", Age: " + uncle.getAge());
        
    }
}        