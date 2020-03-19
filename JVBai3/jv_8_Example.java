package com.JVBai3;

public class jv_8_Example {
    public static void main(String[] args) {
      int upperbound = 100;
      int sum = 0;
      for(int number = 1; number <= upperbound;++number) {
          if(number % 11 ==0)
              sum += number;
      }
      for(int number = 1; number <= upperbound; ++number) {
          if(number % 11 != 0)
              sum +=number;
      }
    }
}
