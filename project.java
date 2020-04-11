import java.util.*;
class Project {
    public static void main(String args[]) 
{
   Scanner sc = new Scanner(System.in);
  // Random r = new Random();
    int count1=0, count4=0, count2=0, count3=0;
   int n=0;
    do{
       System.out.println("\n Enter your element : rock/paper/scissor");
       String p1 = sc.nextLine();
       String p2 = sc.nextLine();
       String p3 = sc.nextLine();
       String p4 = sc.nextLine();
       if(p1.getChoice().equals("rock"))
       {
            if(p2.getChoice().equals("scissors"))
            {
              count1++;
            } 
           else if(p2.getChoice().equals("paper")) 
           {
                count2++;
            }
            if(p3.getChoice().equals("scissors"))
            {
                 count1++;
            } 
           else if(p3.getChoice().equals("paper")) 
           {
                count3++;
            }
            if(p4.getChoice().equals("scissors"))
            {
                 count1++;
            } 
           else if(p4.getChoice().equals("paper")) 
           {
                count4++;
            }
        } 
      else if(p1.getChoice().equals("paper"))
      {
            if(p2.getChoice().equals("rock")) 
           {
                count1++;
            } 
           else if(p2.getChoice().equals("scissors")) 
           {
               count2++;
            }
           if(p3.getChoice().equals("rock")) 
           {
                count1++;
            } 
           else if(p3.getChoice().equals("scissors")) 
           {
                count3++;
            }
          if(p4.getChoice().equals("rock")) 
           {
               count1++;
            } 
           else if(p4.getChoice().equals("scissors")) 
           {
              count4++;    
            }
        } 
      else if(p1.getChoice().equals("scissors")) 
       {
            if(p2.getChoice().equals("paper")) 
            {
                count1++;
            } 
           else if(p2.getChoice().equals("rock")) 
           {
                count2++;
            }
           if(p3.getChoice().equals("paper")) 
            {
                count1++;
            } 
           else if(p3.getChoice().equals("rock")) 
           {
               count3++;
            }
          if(p4.getChoice().equals("paper")) 
            {
               count1++;  
            } 
           else if(p4.getChoice().equals("rock")) 
           {
                count4++;
            }
        }
      if(p2.getChoice().equals("rock"))
       {
            if(p1.getChoice().equals("scissors"))
            {
              count2++;
            } 
           else if(p1.getChoice().equals("paper")) 
           {
                count1++;
            }
            if(p3.getChoice().equals("scissors"))
            {
                 count2++;
            } 
           else if(p3.getChoice().equals("paper")) 
           {
                count3++;
            }
            if(p4.getChoice().equals("scissors"))
            {
                 count2++;
            } 
           else if(p4.getChoice().equals("paper")) 
           {
                count4++;
            }
        } 
      else if(p2.getChoice().equals("paper"))
      {
            if(p1.getChoice().equals("rock")) 
           {
                count2++;
            } 
           else if(p1.getChoice().equals("scissors")) 
           {
               count1++;
            }
           if(p3.getChoice().equals("rock")) 
           {
                count2++;
            } 
           else if(p3.getChoice().equals("scissors")) 
           {
                count3++;
            }
          if(p4.getChoice().equals("rock")) 
           {
               count2++;
            } 
           else if(p4.getChoice().equals("scissors")) 
           {
              count4++;    
            }
        } 
      else if(p2.getChoice().equals("scissors")) 
       {
            if(p1.getChoice().equals("paper")) 
            {
                count2++;
            } 
           else if(p1.getChoice().equals("rock")) 
           {
                count1++;
            }
           if(p3.getChoice().equals("paper")) 
            {
                count2++;
            } 
           else if(p3.getChoice().equals("rock")) 
           {
               count3++;
            }
          if(p4.getChoice().equals("paper")) 
            {
               count2++;  
            } 
           else if(p4.getChoice().equals("rock")) 
           {
                count4++;
            }
        }
        if(p3.getChoice().equals("rock"))
       {
            if(p2.getChoice().equals("scissors"))
            {
              count3++;
            } 
           else if(p2.getChoice().equals("paper")) 
           {
                count2++;
            }
            if(p1.getChoice().equals("scissors"))
            {
                 count3++;
            } 
           else if(p1.getChoice().equals("paper")) 
           {
                count1++;
            }
            if(p4.getChoice().equals("scissors"))
            {
                 count3++;
            } 
           else if(p4.getChoice().equals("paper")) 
           {
                count4++;
            }
        } 
      else if(p3.getChoice().equals("paper"))
      {
            if(p2.getChoice().equals("rock")) 
           {
                count3++;
            } 
           else if(p2.getChoice().equals("scissors")) 
           {
               count2++;
            }
           if(p1.getChoice().equals("rock")) 
           {
                count3++;
            } 
           else if(p1.getChoice().equals("scissors")) 
           {
                count1++;
            }
          if(p4.getChoice().equals("rock")) 
           {
               count3++;
            } 
           else if(p4.getChoice().equals("scissors")) 
           {
              count4++;    
            }
        } 
      else if(p3.getChoice().equals("scissors")) 
       {
            if(p2.getChoice().equals("paper")) 
            {
                count3++;
            } 
           else if(p2.getChoice().equals("rock")) 
           {
                count2++;
            }
           if(p1.getChoice().equals("paper")) 
            {
                count3++;
            } 
           else if(p1.getChoice().equals("rock")) 
           {
               count1++;
            }
          if(p4.getChoice().equals("paper")) 
            {
               count3++;  
            } 
           else if(p4.getChoice().equals("rock")) 
           {
                count4++;
            }
        }
   if(p4.getChoice().equals("rock"))
       {
            if(p2.getChoice().equals("scissors"))
            {
              count4++;
            } 
           else if(p2.getChoice().equals("paper")) 
           {
                count2++;
            }
            if(p3.getChoice().equals("scissors"))
            {
                 count4++;
            } 
           else if(p3.getChoice().equals("paper")) 
           {
                count3++;
            }
            if(p1.getChoice().equals("scissors"))
            {
                 count4++;
            } 
           else if(p1.getChoice().equals("paper")) 
           {
                count1++;
            }
        } 
      else if(p4.getChoice().equals("paper"))
      {
            if(p2.getChoice().equals("rock")) 
           {
                count4++;
            } 
           else if(p2.getChoice().equals("scissors")) 
           {
               count2++;
            }
           if(p3.getChoice().equals("rock")) 
           {
                count4++;
            } 
           else if(p3.getChoice().equals("scissors")) 
           {
                count3++;
            }
          if(p1.getChoice().equals("rock")) 
           {
               count4++;
            } 
           else if(p1.getChoice().equals("scissors")) 
           {
              count1++;    
            }
        } 
      else if(p4.getChoice().equals("scissors")) 
       {
            if(p2.getChoice().equals("paper")) 
            {
                count4++;
            } 
           else if(p2.getChoice().equals("rock")) 
           {
                count2++;
            }
           if(p3.getChoice().equals("paper")) 
            {
                count4++;
            } 
           else if(p3.getChoice().equals("rock")) 
           {
               count3++;
            }
          if(p1.getChoice().equals("paper")) 
            {
               count4++;  
            } 
           else if(p1.getChoice().equals("rock")) 
           {
                count1++;
            }
        }
n++;
}while(n<50);
System.out.println("The score for player 1 is = ",count1);
System.out.println("The score for player 2 is = ",count2);
System.out.println("The score for player 3 is = ",count3);
System.out.println("The score for player 4 is = ",count4);
}
}