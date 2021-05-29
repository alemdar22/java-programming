package day_45_O_O_P;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java";// in string pool
        String word2 = "java";//it re-uses from string pool
        String word3 = new String("java");//created in Heap outside the pool
        String word4 = new String("java");//  "       "


        System.out.println(word1 == word2); // true  ,, point the same object in the pool
        System.out.println(word1 == word3);//false..different objects in pool and heap
        System.out.println(word3 == word4);//false..different objects in heap


        System.out.println(word1.equals(word2));//true  ,,this compares the values
        System.out.println(word1.equals(word3));//true
        System.out.println(word3.equals(word4));//true
    }
}