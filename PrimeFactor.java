/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PrimeFactor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Whankung
 */
public class PrimeFactor {
    public static List<Integer> primeFactors(int number) {
    int n = number;
    List<Integer> factors = new ArrayList<Integer>();
    for (int i = 2; i <= n; i++) {
      while (n % i == 0) {
        factors.add(i);
        n /= i;
      }
    }
    return factors;
  }
}
  
