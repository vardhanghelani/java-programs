import java.util.Scanner;
public class Bank_Acc {
    
  static String accountNo,userName,email,accountType,balance;
    public static void main(String[] args) {
        
       
        getAccountDetails();
        displayAccountDetails();
    }
     static void getAccountDetails(){
        Scanner st= new Scanner(System.in);
 System.out.println("ENTER ACCOUNT NO.");
  accountNo=st.nextLine();
  System.out.println("enter username");
  userName=st.nextLine();
  System.out.println("enetr email");
  email=st.nextLine();
  System.out.println("enter account type");
  accountType=st.nextLine();
  System.out.println("balance");
  balance=st.nextLine();

    }
    static void displayAccountDetails(){

        System.out.println("account no.="+accountNo);
        System.out.println("username="+userName);
        System.out.println("email="+email);
        System.out.println("account type="+accountType);
        System.out.println("balane="+balance);
        
    }
}
