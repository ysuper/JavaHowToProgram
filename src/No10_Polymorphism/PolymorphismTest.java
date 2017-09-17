package No10_Polymorphism;

// Fig. 10.1: PolymorphismTest.java
// Assigning superclass and subclass references to superclass and
// subclass variables.

public class PolymorphismTest  
{
   public static void main( String args[] ) 
   {
      // assign superclass reference to superclass variable
      CommissionEmployee3 commissionEmployee = new CommissionEmployee3( 
         "Sue", "Jones", "222-22-2222", 10000, .06 );                    

      // assign subclass reference to subclass variable
      BasePlusCommissionEmployee4 basePlusCommissionEmployee = 
         new BasePlusCommissionEmployee4( 
         "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );         

      // invoke toString on superclass object using superclass variable
      System.out.printf( "%s %s:\n\n%s\n\n", 
         "Call CommissionEmployee3's toString with superclass reference ",
         "to superclass object", commissionEmployee.toString() );

      // invoke toString on subclass object using subclass variable      
      System.out.printf( "%s %s:\n\n%s\n\n", 
         "Call BasePlusCommissionEmployee4's toString with subclass",
         "reference to subclass object", 
         basePlusCommissionEmployee.toString() );

      // invoke toString on subclass object using superclass variable
      CommissionEmployee3 commissionEmployee2 = 
         basePlusCommissionEmployee; 
      System.out.printf( "%s %s:\n\n%s\n", 
         "Call BasePlusCommissionEmployee4's toString with superclass",
         "reference to subclass object", commissionEmployee2.toString() );
//      BasePlusCommissionEmployee4 commissionEmployee3 = 
//    		  commissionEmployee; 
   } // end main
} // end class PolymorphismTest

/**************************************************************************
 * (C) Copyright 1992-2007 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
