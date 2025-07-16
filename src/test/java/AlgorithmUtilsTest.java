import java.util.*;

public class AlgorithmUtilsTest {
    public static void main(String[] args) {
        reverse(new int[]{1,2,3});
        boolean one = isPalindrome("aba");
        System.out.println(one);
    }

    public static void reverse(int[] arr){
       int[] arr1= arr.clone();
       int count =0;
        for (int i = arr1.length-1; i >= 0; i--) {
            arr[count++] = arr1[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static boolean isPalindrome(String s){
        char[] array = s.toCharArray();
        char[] array2 = new char[array.length];
        int count = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            array2[count++] = array[i];
        }

        return Arrays.equals(array, array2);
    }

    public static Object[] removeDuplicates(int[] arr){
        Set<Integer> set = new HashSet<>();
        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        return set.toArray();
    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length -1; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static Map<Character, Integer> countCharacters(String s){
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = new char[s.length()];
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i],0)+1);
        }

        return map;
    }
}
