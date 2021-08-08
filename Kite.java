/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Kite
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,k,m,n2;
		
		int num = sc.nextInt();
		n2 = num;
		for( i = 0;i < num;i++)
		{
		   for( j = num-1;j>i;j--)
		   {
		      System.out.print("  ");               // to print the blank spaces  here I replaced spaces with . for better understanding
		   }
		   
		   for( k = 0;k<=j;k++)                                                                    //  *               *
		   {                                                                                    //    **              ***
		      System.out.print("* ");           // to print the left half stars like this -->         ***             ***** 
		   }                                                                                  //    ****            ******* 
		                                                                                      //   *****      ==>  *********
		   for(m = 1;m<=j;m++)                                                                     //   
		   {                                                                                      //    *
		      System.out.print("* ");               // to print the right half side like this -->        **
		   }                                                                                      //    ***
		   System.out.println();                                                                  //    ****
		}
		
		//-------------------------------------------------------------------------------------------
		
		for(i = 1; i < num;i++)
		{
		   for(j = 0;j<i;j++)
		   {
		      System.out.print("  ");     // to print the blank spaces 
		   }
		   
		   for(k = num;k>j;k--)                                        //    ****                             
		   {                                                           //     ***                            
		      System.out.print("* ");  //to print the stars left side           **                              
		   }                                                           //       *          ..                            
		                                                               //                                     
		   for(m = num-1;m>i;m--)                                      //        ***                        
		   {                                                           //        **                     
		      System.out.print("* ");                                   //        *                           
		   }                                                           //
		   
		   System.out.println();
		}
		
		//-------------------------------------------------------------------------------------------
// 		num = 3   i = 1   to get the answer as 1 = we need to subtract : num(3) - (i(1)+1) => 3 - 2  = 1
// 		num = 5   i = 2   to get the answer as 2 = we need to subtract : num(5) - (i(2)+1) => 5 - 3  = 2
// 		num = 7   i = 3   to get the answer as 3 = we need to subtract : num(7) - (i(3)+1) => 7 - 4  = 3
            
		for( i = 1;i <= num-(i+1);i++)
		{
		   for( j = num-1;j>i;j--)
		   {
		      System.out.print("  ");               // to print the blank spaces/ . 
		   }
		   
		   for( k = 0;k<=j;k++)     
                   {                        
                      System.out.print("* ");
                   }                    
         
                   for(m = 0;m<j;m++)      
                   {                        
                      System.out.print("* ");
                   }                        
         
		   System.out.println();
		}
	}
}
