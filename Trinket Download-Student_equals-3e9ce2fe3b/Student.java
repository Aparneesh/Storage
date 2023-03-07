/*
 * Activity 4.9.7
 */ 
public class Student 
{ 
  private String name = "";  
  private int id;
  private int grade;

  // Constructor 
  Student(String inputName, int id, int gradeLvl) 
  { 
    name = inputName;
    this.id = id;
    grade = gradeLvl;
  } 

  public String toString(){
    return name;
  }

  public boolean equals(Student s){
    if(id == s.id){
      return true;
    }

    return false;
  }
} 