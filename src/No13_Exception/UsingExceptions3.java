package No13_Exception;

// Fig. 13.7: UsingExceptions.java
// Demonstrating getMessage and printStackTrace from class Exception.

public class UsingExceptions3 
{
   public static void main( String args[] )
   {
      try 
      { 
         method1(); // call method1 
      } // end try
      catch ( Exception exception ) // catch exception thrown in method1
      { 
         System.out.printf( "¡i1¡j%s\n\n", exception.getMessage() );
         exception.printStackTrace(); // print exception stack trace

         // obtain the stack-trace information
         StackTraceElement[] traceElements = exception.getStackTrace();
         
         System.out.println( "¡i2¡j\nStack trace from getStackTrace:" );
         System.out.println( "¡i3¡jClass\t\tFile\t\t\tLine\tMethod" );

         // loop through traceElements to get exception description
         for ( StackTraceElement element : traceElements ) 
         {
            System.out.printf( "¡i4¡j%s\t", element.getClassName() );
            System.out.printf( "¡i5¡j%s\t", element.getFileName() );
            System.out.printf( "¡i6¡j%s\t", element.getLineNumber() );
            System.out.printf( "¡i7¡j%s\n", element.getMethodName() );
         } // end for
      } // end catch
   } // end main

   // call method2; throw exceptions back to main
   public static void method1() throws Exception
   {
      method2();
   } // end method method1

   // call method3; throw exceptions back to method1
   public static void method2() throws Exception
   {
      method3();
   } // end method method2

   // throw Exception back to method2
   public static void method3() throws Exception
   {
      throw new Exception( "Exception thrown in method3" );
   } // end method method3
} // end class UsingExceptions

/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
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
