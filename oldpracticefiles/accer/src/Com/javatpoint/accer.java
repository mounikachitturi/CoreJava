package Com.javatpoint;

//   package Com.javatpoint;public class accer {
 //   private  String name;public String getName(){return name;}public void setName(String name){this.name=name;}}

//   class  accer{ public static void main(String args[]){int   arr [] = new int[5];arr[0]=33;arr[1]=58;
//      arr[2]=123;arr[3]=56;arr[4]=56;for (int i = 0; i < arr.length ; i++) {System.out.println(arr[i]);}}}

 //  class accer { public static void main(String args[]) {
  //      int a[] = {23, 1, 3, 5, 15};for (int i = 0; i < a.length; i++) {System.out.println(a[i]);}}}

//class accer{ public static void main(String args[]){int a[]={1,2,3,4,5,6,7,8,9};for(int i :a) System.out.println(i);}}


//     class accer{ static void min(int arr[]){
//        int min=arr[0];for (int i = 0; i < arr.length; i++) if(min>arr[i]) min=arr[i];System.out.println(min);}
//  public static void main(String args[]){int a[]={21,34,54,23};min(a);}}
//  public class accer { static void printarray(int arr[]){for (int i = 0; i <arr.length; i++) {
//  System.out.println(arr[i]);}}public static void main(String args[]){printarray(new  int[]{12,13,14,21,25});}}

//   public class accer {static int[] get(){
//    return new int[]{12,23,12,54,78};}public static void main(String args[]){int arr[] = get();
//    for (int i = 0; i <arr.length ; i++) {System.out.println(arr[i]);}}}

 //  public class accer {public static void main(String args[]) {
  //  int arr[] = {12, 23, 45, 76, 89};for (int i = 0; i < arr.length; i++) {System.out.println(arr[i]);}}}

//public class accer {public static void main(String args[]){int arr[][]={{1,2,3},{4,5,6},{7,8,9,}};
//    for (int i = 0; i <arr.length ; i++) {for (int j = 0; j < arr.length; j++) {System.out.print(arr[i][j]+" ");}System.out.println();}}}

//public class accer {public static void main(String args[]){int arr[][]=new int[3][];
//arr[0]=new int[3];arr[2]=new int[2];arr[1]=new int[3];int count=0;for (int i = 0; i <arr.length ; i++) {
  //      for (int j = 0; j < arr[i].length; j++) {arr[i][j] = count++;//  for (int i = 0; i < arr.length ; i++) {
          //      for (int j = 0; j <arr[i].length; j++) {System.out.print(arr[i][j]+" ");}System.out.println();}}}

//public class accer {public static void main(String args[]){int arr[] ={3,2,4};
//Class C =arr.getClass();String Name = C.getName();System.out.println(Name);}}

//  public class accer {public static void main(String args[]){
//    char[] copyForm={'a','d','r','r','j','t','q','o','p','k','v','g','w'};char[]copyTo=new char[7];
//    System.arraycopy(copyForm,2,copyTo,0,7);System.out.println(String.valueOf(copyTo));}}

import java.util.Arrays;

//  public class accer {public static void main(String args[]){
//    int arr[]={5,68,2,45,9};System.out.println("printing from original array");for (int i:arr)
 //       System.out.println(i);System.out.println("printing the clone of the array");int carr[] = arr.clone();
///    for (int i :carr) System.out.println(i);System.out.println("both are equal");System.out.println(arr == carr);}}

//  public class accer {public static void main(String args[]){int a[][]={{2,1,3},{4,5,8}};
 //   int b[][]={{2,1,3},{3,4,6}};int c[][]=new int[2][3];for (int i = 0; i < 2; i++) {
 //       for (int j = 0; j <3 ; j++) {c[i][j]=a[i][j]+b[i][j];System.out.print(c[i][j]+" ");}System.out.println();}}}

//  public class accer {public static void main(String args[]){
//    int a[][]={{1,1,1},{2,2,2},{3,3,3}};int b[][]={{1,1,1},{2,2,2},{3,3,3}};
//    int c[][]=new int[3][3];for (int i = 0; i <3 ; i++) {for (int j = 0; j <3 ; j++) {c[i][j] = 0;
// for (int k = 0; k < 3; k++) {c[i][j]+= a[i][k] * b[k][j];}System.out.print(c[i][j] + " ");}System.out.println();}}}

//initialize arraypublic class accer {public static void main(String args[]){
 // initialize arrayint arr1[] = new  int[]{1,2,3,4,5};
    //creating another array in array2with size arr1int arr2[] = new int[arr1.length];
   // copy all elements in another array//arr2=arr1for (int i = 0; i < arr1.length; i++) {arr2[i] =arr1[i];}
    // displayig array1System.out.println("elements of original array ");for (int i = 0; i <arr1.length ; i++) {System.out.print(arr1[i]+" ");}
    //displaying array2System.out.println();for (int i = 0; i <arr2.length ; i++) {System.out.println(arr2[i]+" ");}}}

public class accer {public static void main(String args[]){

}
}