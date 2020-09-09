package com.example.java.stream;

import java.util.Arrays;

public class StreamSample {
    public static void main(String[] args) {
        StreamSample ss = new StreamSample();
        System.out.println("sample1");
        ss.sample1();

        System.out.println("\nsample2");
        ss.sample2();

        System.out.println("\nsample3");
        ss.sample3();

        System.out.println("\nsample4");
        ss.sample4();

        System.out.println("\nsample5");
        ss.sample5();
    }

    public void sample5(){
        System.out.println("int[] to Integer[]!! Integer[] to int[]");
        int[] arr = {1,2,3,4,5};
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        Integer[] arr3 = {1,2,3,4,5};
        int[] arr4 = Arrays.stream(arr3).mapToInt(i->i).toArray();

        Arrays.stream(arr4).forEach(System.out::println);
    }

    public void sample4(){
        System.out.println("stream map!!");
        String[] arr = {"abc", "abb", "cca", "bbd", "eee"};
        Arrays.stream(arr).map(x->"[" + x + "]").forEach(x->System.out.println(x));
    }

    public void sample3(){
        System.out.println("stream filter foreach!!");
        String[] arr = {"abc", "abb", "cca", "bbd","eee"};
        Arrays.stream(arr).filter(x->x.contains("a")).forEach(x->System.out.println(x));
    }

    public void sample2(){
        String[] arr = {"abc", "abb", "cca", "bbd","eee"};
        System.out.println("stream foreach!!");
        Arrays.stream(arr).forEach(x->System.out.println(x));
    }

    public void sample1(){
        System.out.println("stream fileter!!");
        String[] arr = {"abc", "abb", "cca", "bbd","eee"};
        System.out.println("'a' count in array : " + Arrays.stream(arr).filter(i->i.contains("a")).count());
    }
}
