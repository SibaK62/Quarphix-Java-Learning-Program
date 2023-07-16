//Assigning superclass and subclass refernce to superclass and
//cubclass varaibles

public class PolymorphismTest
{
    public static void main(String[] args)
    {
        //assign superclass reference to superclass variable
        CommissionEmployee commissionEmployee = new CommissionEmployee(
            "Sue","Jones","222-22-2222",10000,.06);

        //assign subclass refernce to subclass variable
        BasePlusCommissionEmployee basePlusCommissionEmployee =
         new BasePlusCommissionEmployee(
            "Bob","Lewis","333-33-3333",5000,.04,300);

        //invoke to String on superclass object using superclass varaibles     
        System.out.printf("%s %s:%n%n%s%n%n", 
 "Call CommissionEmployee's toString with superclass reference ",
        "to superclass object", commissionEmployee.toString());

        // invoke toString on subclass object using subclass variable 
        System.out.printf("%s %s:%n%n%s%n%n", 
 "Call BasePlusCommissionEmployee's toString with subclass",
        "reference to subclass object",
            basePlusCommissionEmployee.toString());

        // invoke toString on subclass object using superclass variable
        CommissionEmployee commissionEployee2 = 
            basePlusCommissionEmployee;
        System.out.printf("%s %s:%n%n%s%n", 
 "Call BasePlusCommissionEmployee's toString with superclass",
        "reference to subclass object", commissionEployee2.toString());
       } // end main
 } // end class PolymorphismTest   
            
    