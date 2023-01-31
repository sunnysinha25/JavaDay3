package JavaAssignment4.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Employee {
    String empid;
    String empname;
    double empsalary;
      
    public Employee(String empid, String empname, double empsalary) {
        this.empid = empid;
        this.empname = empname;
        this.empsalary = empsalary;
    }
    
    public Employee() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ENTER EMPLOYEE ID: ");
        empid=sc.next();
        System.out.print("ENTER EMPLOYEE NAME: ");
        empname=sc.next();
        System.out.print("ENTER EMPLOYEE SALARY: ");
        this.empsalary=sc.nextDouble();
    }
    
    public final String getId() {
        return empid;
    }
    public final void setId(String empid) {
        this.empid = empid;
    }
    public final String getName() {
        return empname;
    }
    public final void setName(String empname) {
        this.empname = empname;
    }
    public final double getSalary() {
        return empsalary;
    }
    public final void setSalary(double empsalary) {
        this.empsalary = empsalary;
    }
    
    public final void display() {
        System.out.println("\nEMPLOYEE ID: " + this.empid);
        System.out.println("EMPLOYEE NAME: " + this.empname);
        System.out.println("EMPLOYEE SALARY: " + this.empsalary);
    }
    
}

public class ArrayListDemo {
	
    public static void main(String[] args) 
    {
        ArrayList<Employee> arr = new ArrayList<Employee>();
        int choice = 2;
        
        while(choice!=0) {
            System.out.println("\n\n0->EXIT");
            System.out.println("1->INSERT");
            System.out.println("2->DISPLAY");
            System.out.println("3->SEARCH");
            System.out.println("4->DELETE");
            System.out.println("5->UPDATE");
            
            System.out.print("ENTER YOUR CHOICE: ");
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
            if(choice==1) {
                Employee temp = new Employee();
                arr.add(temp);
            } 
            else if(choice==2) {
                System.out.print("ARRAYLIST CONTAINS: ");
                Iterator<Employee> iter=arr.iterator();
                while(iter.hasNext()) {
                    iter.next().display();
                }
            } 
            else if(choice==3) {
                System.out.print("ENTER EMPLOYEE ID TO BE CHECKED: ");
                String query=sc.next();
                Iterator<Employee> iter = arr.iterator();
                boolean found = false;
                while (iter.hasNext()) {
                    Employee curr=iter.next();
                    if (curr.getId().equals(query)) {
                        System.out.println("FOUND");
                        curr.display();
                        found=true;
                        break;
                    }
                }
                if(!found) {
                    System.out.println("NOT FOUND");
                }
            } 
            else if(choice==4) {
                System.out.print("ENTER EMPLOYEE ID TO BE DELETED: ");
                String query=sc.next();
                Iterator<Employee> iter=arr.iterator();
                boolean found=false;
                while(iter.hasNext()) {
                    Employee curr=iter.next();
                    if(curr.getId().equals(query)) {
                        arr.remove(curr);
                        System.out.println("EMPLOYEE REMOVED");
                        found=true;
                        break;
                    }
                }
                if(!found) {
                    System.out.println("EMPLOYEE NOT FOUND");
                }    
            } 
            else if(choice==5) {
                System.out.print("ENTER EMPLOYEE ID TO BE UPDATED: ");
                String query=sc.next();
                Iterator<Employee> iter=arr.iterator();
                boolean found=false;
                Employee curr=new Employee("0", "0", 0);
                while(iter.hasNext()) {
                    curr=iter.next();
                    if(curr.getId().equals(query)) {
                        System.out.println("EMPLOYEE FOUND");
                        curr.display();
                        found=true;
                        break;
                    }
                }
                if(found==false) {
                    System.out.println("ARRAYLIST DOES NOT CONTAIN EMPLOYEE ID");
                } 
                else {
                    arr.set(arr.indexOf(curr), new Employee());
                }
            } 
            else {
                break;
            }
        }
        
    }

}



/*
EXPECTED INPUT/OUTPUT


0->EXIT
1->INSERT
2->DISPLAY
3->SEARCH
4->DELETE
5->UPDATE
ENTER YOUR CHOICE: 1
ENTER EMPLOYEE ID: 101
ENTER EMPLOYEE NAME: SUNNY
ENTER EMPLOYEE SALARY: 25000


0->EXIT
1->INSERT
2->DISPLAY
3->SEARCH
4->DELETE
5->UPDATE
ENTER YOUR CHOICE: 1
ENTER EMPLOYEE ID: 102
ENTER EMPLOYEE NAME: ANIKET
ENTER EMPLOYEE SALARY: 30000


0->EXIT
1->INSERT
2->DISPLAY
3->SEARCH
4->DELETE
5->UPDATE
ENTER YOUR CHOICE: 2
ARRAYLIST CONTAINS: 
EMPLOYEE ID: 101
EMPLOYEE NAME: SUNNY
EMPLOYEE SALARY: 25000.0

EMPLOYEE ID: 102
EMPLOYEE NAME: ANIKET
EMPLOYEE SALARY: 30000.0


0->EXIT
1->INSERT
2->DISPLAY
3->SEARCH
4->DELETE
5->UPDATE
ENTER YOUR CHOICE: 3
ENTER EMPLOYEE ID TO BE CHECKED: 101
FOUND

EMPLOYEE ID: 101
EMPLOYEE NAME: SUNNY
EMPLOYEE SALARY: 25000.0


0->EXIT
1->INSERT
2->DISPLAY
3->SEARCH
4->DELETE
5->UPDATE
ENTER YOUR CHOICE: 3
ENTER EMPLOYEE ID TO BE CHECKED: 103
NOT FOUND


0->EXIT
1->INSERT
2->DISPLAY
3->SEARCH
4->DELETE
5->UPDATE
ENTER YOUR CHOICE: 4
ENTER EMPLOYEE ID TO BE DELETED: 102
EMPLOYEE REMOVED


0->EXIT
1->INSERT
2->DISPLAY
3->SEARCH
4->DELETE
5->UPDATE
ENTER YOUR CHOICE: 2
ARRAYLIST CONTAINS: 
EMPLOYEE ID: 101
EMPLOYEE NAME: SUNNY
EMPLOYEE SALARY: 25000.0


0->EXIT
1->INSERT
2->DISPLAY
3->SEARCH
4->DELETE
5->UPDATE
ENTER YOUR CHOICE: 5
ENTER EMPLOYEE ID TO BE UPDATED: 101
EMPLOYEE FOUND

EMPLOYEE ID: 101
EMPLOYEE NAME: SUNNY
EMPLOYEE SALARY: 25000.0
ENTER EMPLOYEE ID: 101
ENTER EMPLOYEE NAME: SUNNY
ENTER EMPLOYEE SALARY: 30000


0->EXIT
1->INSERT
2->DISPLAY
3->SEARCH
4->DELETE
5->UPDATE
ENTER YOUR CHOICE: 2
ARRAYLIST CONTAINS: 
EMPLOYEE ID: 101
EMPLOYEE NAME: SUNNY
EMPLOYEE SALARY: 30000.0


0->EXIT
1->INSERT
2->DISPLAY
3->SEARCH
4->DELETE
5->UPDATE
ENTER YOUR CHOICE: 0
*/