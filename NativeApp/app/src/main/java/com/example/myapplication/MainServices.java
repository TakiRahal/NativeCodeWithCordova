package com.example.myapplication;

public class MainServices {

    public String getPrimesNumber(Integer min, Integer max){

        String resultAllNumber = "";

        //find all prime numbers in the given range
        for(int n=min;n<=max;n++) {
            //check if this number is prime
            if(isPrime(n)) {
                System.out.println("Prime number = "+n);
                resultAllNumber = resultAllNumber +", "+n;
            }
        }
        return resultAllNumber;
    }

    private boolean isPrime(int num) {
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
