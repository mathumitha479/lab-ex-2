/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author windows
 */
public class EBbill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        electricBill b=new electricBill();
        b.input_data();
        b.Calculate_bill();
        b.display();
                
        // TODO code application logic here
    }
    
}
class electricBill
        {
    int consumernum;
    String consumername;
    int prevreading;
    int currreading;
    String EBconn;
    double bill;
    void input_data()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter constumer no:");
        consumernum=sc.nextInt();
        System.out.println("enter teh consumer name:");
        consumername=sc.next();
        System.out.println("enter the previous units:");
        prevreading=sc.nextInt();
        System.out.println("enter the current units:");
        currreading=sc.nextInt();
        System.out.println("enter teh types of EB connections(domestic & commercial)");
        EBconn=sc.next();
    }
    double Calculate_bill()
    {
        int choice;
        if(EBconn=="domestic")
            choice=1;
        else
            choice=2;
        switch(choice)
        {
            case 1:
                if(currreading>=0 && currreading<=100)
                    bill=currreading*1;
                else if(currreading>100 && currreading<=200)
                    bill=(100*1)+((currreading-100)*2.50);
                else if(currreading>200 && currreading<=500)
                    bill=(100*1)+(100*2.50)+((currreading-200)*4);
                else
                    bill=(100*1)+(100*2.50)+(300*4)+((currreading-500)*6);
                break;
                
            case 2:
                if(currreading>=0 && currreading<=100)
                    bill=currreading*2;
                else if(currreading>100 && currreading<=200)
                    bill=(100*1)+((currreading-100)*4.50);
                else if(currreading>200 && currreading<=500)
                    bill=(100*1)+(100*2.50)+((currreading-200)*6);
                else
                    bill=(100*1)+(100*2.50)+(300*4)+((currreading-500)*7);
                break;
        }
        return bill;
    }
    void display()
    {
        System.out.println("______________________");
        System.out.println("ELECTRICITY BILL");
        System.out.println("______________________");
        System.out.println("CONSUMER NUMBER:"+consumernum);
        System.out.println("CONSUMER NAME:"+consumername);
        System.out.println("CONSUMER PREVIOUS UNITS:"+prevreading);
        System.out.println("CONSUMER CURRENT UNITS:"+currreading);
        System.out.println("TYPE OF EB CONNECTION:"+EBconn);
        System.out.println("_______________________");
        System.out.println("TOTAL AMOUNT(RS):"+bill);
    }
}

                
                
      
        // TODO code application logic here
    
