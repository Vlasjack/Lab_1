package com.company;

public class Primes {
    //print prime numbers from 2 to 100
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if(isPrime(i)){
                System.out.println(i);}
        }
    }
    //check if int is prime
    public static boolean isPrime(int n){
        for (int j = 2; j < n; j++) {
            if(n % j == 0){
                return false;
        }
        }return true;
    }
}