/*
 * Activity 4.9.7
 */ 
public class StudentRunner
{ 
  public static void main(String args[]) 
  { 
    Student s = new Student("TestName", 00123, 12); 
    Student t = new Student("Testname", 00123, 9);
    Student r = new Student("New Name", 00123, 11);

    // Below two statements are equivalent 
    System.out.println(s.equals(t)); 
    System.out.println(s.equals(r)); 

    System.out.println(s.toString());
    System.out.println(t.toString());
    System.out.println(r.toString());
  } 
} 