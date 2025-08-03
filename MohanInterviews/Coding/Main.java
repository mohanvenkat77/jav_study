package MohanInterviews.Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    /*
     * reverse a word
     * public static void main(String[] args) {
     * 
     * String word ="wwelcome to java programing";
     * String[] arr=word.split(" ");
     * for(int i=arr.length-1;i>=0;i--){
     * System.out.println("is " + arr[i]);
     * }
     * List<String> larr = Arrays.asList(arr);
     * Collections.reverse(larr);
     * for (String x : larr){
     * System.out.println(x);
     * }
     * }
     */

    // Java Program to find longest substring without repetition
    public void findLongestSubstring(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxlength = 0;
        int maxstart = 0;

        for (int end = 0; end < str.length(); end++) {
            char ch = str.charAt(end);
            if (map.containsKey(ch)) {
                start = Math.max(start, map.get(ch) + 1);
            }
            map.put(ch, end);
            System.out.println(map);
            if (end - start + 1 > maxlength) {
                maxlength = end - start + 1;
                maxstart = start;
            }

        }
        System.out.println("longest substring is : " + str.substring(maxstart, maxstart + maxlength));

    }

    // How to insert element in an array at specific position in java |
    public void insertElementinArray() {
        int[] arr = { 1, 2, 4, 5, };
        int position = 2;
        int value = 3;
        int[] narr = new int[arr.length + 1];
        for (int i = 0; i <= arr.length; i++)
            if (i < position) {
                narr[i] = arr[i];
            } else if (i == position) {
                narr[i] = value;
            } else {
                narr[i] = arr[i - 1];
            }
        for (int x : narr) {
            System.out.println(x);
        }

        // without using another array but it should have extar space
        for (int i = arr.length; i > position; i--) {
            arr[i] = arr[i - 1];
        }

    }

    // Write a java program to sort names in an array?
    public void sortNamesinArray() {
        String[] names = { "Zara", "Amit", "John", "Priya", "Bhavesh" };
        // Arrays.sort(names);

        // without sort method
        String tmp;
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) < 0) {
                    tmp = names[i];
                    names[i] = names[j];
                    names[j] = tmp;
                }
                if (names[i].compareTo(names[j]) > 0) {
                    tmp = names[j];
                    names[j] = names[i];
                    names[i] = tmp;
                }
            }
        }
        for (String x : names) {
            System.out.println(x);
        }
    }

    // How to Print Alternate Elements of an Array in Java 8
    public void AlternateElements() {
        // int[] arr={1,2,3,4,5,6,7};
        String[] arr = { "Zara", "Amit", "John", "Priya", "Bhavesh" };
        // IntStream.range(0, arr.length).filter(i ->
        // i%2==0).map(x->arr[x]).forEach(System.out::println);

        IntStream.range(0, arr.length).filter(i -> i % 2 == 0).mapToObj(x -> arr[x]).forEach(System.out::println);
    }

    // Java program to find majority element in an array?
    public void MajorityElement() {
        int min = Integer.MIN_VALUE;
        int key = 0;
        int[] arr = { 1, 3, 2, 3, 3, 7, 4, 2, 5, 1 };
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > min) {
                min = entry.getValue();
                key = entry.getKey();
            }
        }
        if (key > arr.length % 2) {

            System.out.println("Majority value is : " + key);
        } else {
            System.out.println("No Majority value found");
        }
    }

    // sum arraaay
    public void sumArray() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int sum2 = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum2);
    }

    // write a program in java to print even length words in a string
    public void evenLengthWord() {
        String str = "Java concurrency is powerful and elegant";
        for (String x : str.split(" ")) {
            if (x.length() % 2 == 0) {
                System.out.println(x);
            }
        }
    }

    // write a java program to sort characters in a string
    public void SortCharinString() {
        String str = "Java concurrency is powerful and elegant";
        char[] chr = str.toLowerCase().toCharArray();
        Arrays.sort(chr);
        String sorted = new String(chr);
        System.out.println(sorted);

    }

    // write a java program to remove duplicates from a string
    public void removeDuplicatesString() {
        String str = "DasiMohanVenkat";
        List<Character> lis = str.chars().mapToObj(x -> (char) x).distinct().collect(Collectors.toList());
        String deduped = lis.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(deduped);

        String deduped2 = str.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

    }

    // check if string is palindrome or not
    public void palindromeString() {
        String str = "mom";
        String str2 = str.chars().mapToObj(x -> (char) x).collect(Collectors.toList()).reversed().stream()
                .map(String::valueOf).collect(Collectors.joining());
        if (str.equals(str2)) {
            System.out.println(str + "is palindrome ");
        }
    }

    // vowel count
    public void vowelCount() {
        String str = "Dasi Mohan Venkat";
        long count = str.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }

    // write words in a string with its lenght
    public void WordLength() {
        String input = "Dasi Mohan Venkat is learning Java concurrency";
        String[] arr = input.trim().split("\\s+");

        for (String a : arr) {
            System.out.println(a + " - " + a.length());
        }

    }

    public void StringCompareManual() {
        String s1 = "Dasi Mohan Venkat";
        String s2 = "Dasi Mohan venkat";
        if (s1 == null || s2 == null) {
            System.out.println("Not Same");
        }
        if (s1.length() != s2.length()) {
            System.out.println("Not Same");
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                System.out.println("Not Same");
                return;
            }
        }
        System.out.println(" Strings are same");
    }

    public void MedianArray() {
        int[] a1 = { 1, 22, 13, 41, 56, 12 };
        Arrays.sort(a1);
        int n = a1.length;
        if (n % 2 != 0) {
            System.out.println("Median is : " + a1[n / 2]);
        } else {
            System.out.println("Median is : " + (a1[(n - 1) / 2] + a1[n / 2]) / 2);
        }
    }

    // print the fibanoci
    public void fibanoci() {
        int a = 0;
        int b = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    // count words in String using JAVA8
    public void countWordsString() {

        String input = "Dasi Mohan Venkat is learning Java concurrency";
        long count = Arrays.stream(input.split("\\s+")).count();
        System.out.println(count);

    }

    public void waysToPrintArray() {
        int[] arr = { 1, 2, 3, 4, 5, 5, 6, 6, 4, 3, 2, 2, 1, 1 };
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

        // 2
        Arrays.stream(arr).forEach(n -> System.out.println(n));

        // 3
        for (int a : arr) {
            System.out.println(a);
        }

        // 4
        System.out.println(Arrays.toString(arr));

        // 5
        IntStream.of(arr).forEach(System.out::println);

        // 6

        System.out.println(Arrays.asList(arr));  // it only  works with Wrapper classes
    }


    // check wthert a number is palindrome or not
    public  void intPalindrome(){
        int n1=124326;
        String s=String.valueOf(n1);
        boolean val=IntStream.range(0, s.length()/2).noneMatch(i->s.charAt(i)!=s.charAt(s.length()-i-1));
        System.out.println(n1 + " : is palindrome ? : " + val);
    }


    // anagram checker
    public void Anagram(){
         final int range = 256;
         String s1="Listen";
         String s2="Silent";
         if(s1 == null || s2 == null || s1.length() != s2.length()) {
            System.out.println("not a Anagram");
            return;
         };
         int[] count = new int[range];

         for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
         }
         for(int c: count){
            if(c!=0){
                System.out.println("not a Anagram");
                return;
            }
         }
         System.out.println("Anagram");
    }

    public void Anagramchecker2(){
        String s1="Listen";
        String s2="Silent";
        if(s1 == null || s2 == null || s1.length() != s2.length()){
            System.out.println( " not a anagram ");
            return;
        }

        String sorted1=s1.toLowerCase().chars().sorted().mapToObj(c->String.valueOf((char) c)).collect(Collectors.joining());
        String sorted2=s2.toLowerCase().chars().sorted().mapToObj(c->String.valueOf((char) c)).collect(Collectors.joining());
            if(!sorted1.equals(sorted2)){
                System.out.println( " not a Anagram ");
                return;
            }
            System.out.println("is a anagram ");
    }

    public void compareStrings(){
        //1
        String s1="Mohan";
        String s2="venkat";

        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1 == s2);
        System.out.println(Objects.equals(s1,s2));
    }

    public void differentWaysToPrintMap(){
        // entry set
        Map<Integer,Integer> map=new HashMap<>();
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        //keysey
        Iterator<Integer> itr=map.keySet().iterator();
        while(itr.hasNext()){
            Integer key=itr.next();
            System.out.println(key +" : "+ map.get(key));
        }

        // entryset with Iterator
        //for each loop
        map.forEach((key,value)-> System.out.println(key + " : " +value));

        // streams
        map.entrySet().stream().forEach(e->System.out.println(e.getKey() + " : " +e.getValue()));
    }

    public void generateRandom(){
        Random r=new Random();
        int rn=r.nextInt();
        double rd=r.nextDouble();

        double dm =Math.random();
        int rm=(int)(Math.random()*10);

        int rt=ThreadLocalRandom.current().nextInt();
        double dt=ThreadLocalRandom.current().nextDouble();
    }


    public void diffWaysToConvertArrayToList(){
        int[] arr={1,2,3,4,4,4,3,2,1,3,3,4,4,5,5,5,5,5};
        List<int[]> list=Arrays.asList(arr);

        List<int[]> list2=new ArrayList<>(Arrays.asList(arr));

        Collections.addAll(list, arr);

    }


    public void missingNumbersList(){

        List<Integer> list=Arrays.asList(1,2,3,4,6,7,9);
        int max=9;
        Set<Integer> set=new HashSet<>(list);
        List<Integer> mising=new ArrayList<>();
        for(int i=0;i<max;i++){
            if(!set.contains(i)){
                mising.add(i);
            }
        }
        mising.forEach(System.out::println);

    }

    public void intersectionOfList(){
        List<Integer> list1 = Arrays.asList(1, 2, 3, 5, 4);
        List<Integer> list2 = Arrays.asList(3, 5, 4, 6, 7);

        // list1.retainAll(list2); this will mutate the list1

        List<Integer> interlist=list1.stream().sorted().filter(list2::contains).distinct().collect(Collectors.toList());

System.out.println(interlist);
    }

    public void panagramCheck(){
         String input = "The quick brown fox jumps over the lazy dog";

         String str=input.toLowerCase();
         for(char ch='a';ch<='z';ch++){
                if(!str.contains(String.valueOf(ch)))
                {
                    System.out.println(" not a Panagram");
                    return;
                }
         }
         System.out.println(" is a panagram");
    }

    public void StringCompression(){
        String input = "aabcccccaaa";   
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=1;i<input.length();i++){
            if(input.charAt(i) == input.charAt(i-1) ){
                count++;
            }else{
                sb.append(input.charAt(i-1)).append(count);
                count=1;
            }
        }
        System.out.println("Comppression String : " + sb.toString());
    }

    public void Firstletters(){
        String input = "Java is powerful and elegant";
        String[] words=input.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String word:words){
            sb.append(word.charAt(0));
        }

        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        Main obj = new Main();
        // obj.findLongestSubstring("javaconceptofftheday");
        // obj.insertElementinArray();
        // obj.sortNamesinArray();
        // obj.AlternateElements();
        // obj.MajorityElement();
        // obj.sumArray();
        // obj.evenLengthWord();
        // obj.SortCharinString();
        // obj.removeDuplicatesString();
        // obj.vowelCount();
        // obj.WordLength();
        // obj.StringCompareManual();
        // obj.MedianArray();
        // obj.fibanoci();
        // obj.countWordsString();
        // obj.waysToPrintArray();
        // obj.intPalindrome();
        // obj.Anagram();
        // obj.Anagramchecker2();
        // obj.missingNumbersList();
        // obj.intersectionOfList();
        // obj.panagramCheck();
        // obj.StringCompression();
        obj.Firstletters();

    }

}
