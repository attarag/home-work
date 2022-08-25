package com.sbrf.reboot;

public class Calculator {

    public static int sum(int x, int y){
        int res = 0;
        try {
            res =  Math.addExact(x,y);
        } catch (Exception e ){
            e.printStackTrace();
        }
        return res;
    }

    public static int sub(int x, int y){
        int res = 0;
        try {
            res =  Math.subtractExact(x,y);
        } catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }

    public static int multiply(int x, int y){
        int res = 0;
        try {
            res =  Math.multiplyExact(x, y);
        } catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }

    public static double divide(double x, double y){
        double res = 0;
        try {
            res =  x/y;
        } catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }

    public static double sin(double x){
        double res = 0;
        try {
            res =  Math.sin(x);
        } catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }

    public static double cos(double x){
        double res = 0;
        try {
            res =  Math.cos(x);
        } catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }
}
