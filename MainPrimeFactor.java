package PrimeFactor;

import static PrimeFactor.PrimeFactor.primeFactors;
import static PrimeFactor.PrimeFactor.primeFactors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Whankung
 */
public class MainPrimeFactor {
  public static void main(String[] args) {
    System.out.println("PrimeFactor 100");
    for (Integer integer : primeFactors(100)) {
      System.out.println(integer);
    }
    System.out.println("PrimeFactor 35");
    for (Integer integer : primeFactors(35)) {
      System.out.println(integer);
    }
    System.out.println("PrimeFactor  15");
    for (Integer integer : primeFactors(15)) {
      System.out.println(integer);
    }
       System.out.println("PrimeFactor  105");
    for (Integer integer : primeFactors(105)) {
      System.out.println(integer);
    }
  }
} 
