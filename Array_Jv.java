/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array_jv;

/**
 *
 * @author CENTER 4
 */
//class Student { // declaring function to put 2 dataypes
// public int roll_no; //Int
// public String name; // string
// Student (int roll_no , String name)
// {
//     this.roll_no = roll_no;
//     this.name = name;
// }
//}


public class Array_Jv {

   public static void main(String[] args) {
       makeDiamond(10);
 }
   
   private static void makeDiamond(int numberOfStars){
       int spaceCount = numberOfStars;
       
      
       for(int x = 0; x <= numberOfStars; x++){
           repeat(spaceCount, " ");
           repeat(x,"*");
           repeat(x - 1, "*");
           consoleLog("\n");
           spaceCount--;
   }
       

       spaceCount = 1;
       for(int x = numberOfStars - 1; x >= 0; x--){
           repeat(spaceCount, " ");
           repeat(x,"*");
           repeat(x - 1, "*");
           consoleLog("\n");
           spaceCount++;
            
     }
 }
   
   private static void consoleLog(String characterToRepeat){
       System.out.print(characterToRepeat);
 }
   
   private static void repeat(int numbersOfRepeat, String characterToRepeat){
       for(int x= 0; x <= numbersOfRepeat; x++){
           consoleLog(characterToRepeat);
    }
    }
}
 
   
//       int intArray [] = {1,2,3};
//       int cloneArray [] = intArray.clone();
//       
//       System.out.print(cloneArray == intArray);
//       
//       for(int i =0; i< cloneArray.length; i++)
//           System.out.print(cloneArray[i] + "");
//        System.out.println(cloneArray[0] == intArray[0]);
//         System.out.println(cloneArray[1] == intArray[1]);

//    int arr [] = {1,2,3,4,5};
//    sum(arr);
//    
//   }
//   public static void sum(int [] arr) {
//           int sum = 0;
//           for(int i = 0; i < arr.length; i++)
//           sum += arr[i];
//           System.out.print("The sum of the values :" + sum);
//   
//  }
//}
       
//       int arr [] [] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9} };    
//       
//       
//       for (int i = 0; i< 3; i++){
//           for(int j = 0; j <3; j++)
//           System.out.print(arr [i][j] + "");
//                   System.out.println();
//                   
//       }
//        
//    
//        Student arr [];//Declaring an array of integers
//        arr = new Student [6];
//        
//        arr[0] = new Student (1,  "J"); //Lagay value sa elements
//        arr[1] = new Student (1,  "A"); //Lagay ng value sa second element
//        arr[2] = new Student (1,  "S"); //so on..
//        arr[3] = new Student (1,  "P");                      
//        arr[4] = new Student (1,  "E");
//        arr[5] = new Student (1,  "R");
//        
//        for (int i = 0; i< arr.length; i++)
//        System.out.println("The elemnt at Index" + i + " : " + arr
//                [i].roll_no + "" + arr [i].name);
    
//        String arr []; //Declaring an array of integers
//        arr = new String [5]; //Declarig 5 elents an array
//        
//        arr[0] = "A"; //Lagay value sa elements
//        arr[1] = "B"; //Lagay ng value sa second element
//        arr[2] = "C"; //so on..
//        arr[3] = "D";
//        arr[4] = "E";
//        
//        for (int i = 0; i< arr.length; i++)
//        System.out.println("The elemnt at Index" + i + " : " + arr [i]);
        
//        int arr []; //Declaring an array of integers
//        arr = new int [5]; //Declarig 5 elents an array
//       
//        arr[0] = 10; //Lagay value sa elements
//        arr[1] = 20; //Lagay ng value sa second element
//        arr[2] = 30; //so on..
//        arr[3] = 40;
//        arr[4] = 50;
//        
//       // for (int i = 0; i< arr.length; i++)
//        System.out.println("The elemnt at Index" + i + " : " + arr [i]);
//    }
//}