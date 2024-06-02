package org.example;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.util.Arrays;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Problem.TwoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(Problem.TwoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(Problem.TwoSum(new int[]{3, 3}, 6)));
    }
}