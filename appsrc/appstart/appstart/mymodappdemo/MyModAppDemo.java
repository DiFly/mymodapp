package appstart.mymodappdemo;

import appfuncs.simplefuncs.SimpleMathFuncs;

public class MyModAppDemo{
    public static void main(String[] args) {
        if (SimpleMathFuncs.isFuctor(2, 10))
            System.out.println("2 is a multiplier 10");

        System.out.println("The smallest common factor for 35 and 105 will be " + SimpleMathFuncs.lcf(35, 105));
        System.out.println("The biggest common factor for 35 and 105 will be " + SimpleMathFuncs.gcf(35, 105));
    }
}