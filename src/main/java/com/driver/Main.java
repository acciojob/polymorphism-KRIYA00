package com.driver;

public class Main {
    public static void main(String args[])
    {
       Product ob=new Product();
      System.out.println(ob.product(5,6));
      System.out.println(ob.product(5.2,7));
       System.out.println(ob.product(5,6,7));

    }


    public static class Product
    {

            public int product(int x, int y)
            {
                return x*y;
            }
            public int product(int x, int y, int z)
            {
                return x*y*z;
            }
            public double product(double x, double y)
            {
                return x*y;
            }


    }
}