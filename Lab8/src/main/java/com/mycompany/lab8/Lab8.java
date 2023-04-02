/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

import java.util.LinkedList;

/**
 *
 * @author Ranveer Singh PC
 */
public class Lab8 {

    public static void main(String[] args) {
 
      LinkedList list01 = new LinkedList();

      LinkedList list02 = new LinkedList();

     primesTolist(100, list01); //all primes from 0 to 1
     System.out.println(list01);

primeswithThreeTolist(100, list02); //all primes from 0 to n
System.out.println(list02);


    }
       

public static boolean isPrime(int num){

//checks if prime
if(num <= 1){

return false;
}
else{
for(int i = 2; i < num;i++){
if(num % i==0){
return false;
}
}
return true;
}
}

//remainder is 0 with n factor

public static void primesToList(int n, LinkedList list){

///Add primes from 0 to n to LinkedList

for(int i= 0; i < n; i++){
if(isPrime(i)){
Node newNode=new Node(i);
}
}
}

public static boolean containsThree(int n){

//check for '3'

while(n > 0){
if (n % 10 == 3){
return true;
}
n /=10;
}
return false;
}
public static void primeswithThreeTolist(int n, LinkedList list){

//Add primes to Linkedlist with '3"

for(int i = 0; i < n; i++){

if(isPrime(i) && containsThree(i)){
Node newNode = new Node(i);
}
}         
    }

    private static void primesTolist(int i, LinkedList list01) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
