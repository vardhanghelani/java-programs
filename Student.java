import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no.of students");
        int n =sc.nextInt();
        studentDetails obj[]=new studentDetails[n];
        for(int i=0;i<n;i++){
            obj[i]=new studentDetails();
            obj[i].Scan_Details();
        }
        
    }
}
class studentDetails{
    String id_no;
    int  no_of_subjects_registered;
    String subject_code[]= new String[no_of_subjects_registered];
    int subject_credits[]=new int[no_of_subjects_registered];
    String grade_obtained[]= new String[no_of_subjects_registered];
    Double spi;

    void Scan_Details(){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER ID NO.");
        id_no=sc.nextLine();
        System.out.println("enter no. of subjects registered");
        no_of_subjects_registered=sc.nextInt();
       for(int i=0;i<no_of_subjects_registered;i++){
        System.out.println("etner code of subject"+(i+1));
        subject_code[i]=sc.nextLine();
        System.out.println("enter subject credit"+(i+1));
        subject_credits[i]=sc.nextInt();
        System.out.println("enter grade obrtained "+(i+1));
        grade_obtained[i]=sc.nextLine();
       }
     }
     void spi(){
        int totalcredits=0;
        for(int i=0;i<no_of_subjects_registered;i++){
            switch(grade_obtained[i]){
         case "A+":totalcredits=totalcredits+subject_credits[i]*10;
         break;
         case "A":totalcredits=totalcredits+subject_credits[i]*9;
         break;
         case "B+":totalcredits=totalcredits+subject_credits[i]*8;
         break;
         case "B":totalcredits=totalcredits+subject_credits[i]*8;
         break;
         case "C+":totalcredits=totalcredits+subject_credits[i]*8;
         break;
         case "C":totalcredits=totalcredits+subject_credits[i]*8;
         break;
            }
            
        }
     }
}
   