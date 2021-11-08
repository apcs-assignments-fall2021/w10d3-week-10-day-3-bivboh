import java.util.ArrayList;

public class MyMain {

    // Counts the number of words that starts with 'a' or 'A'
    public static int startsWithA(ArrayList<String> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).charAt(0) == 'a' || list.get(i).charAt(0) == 'A'){
                count++;
            }
        }
        return count;
    }

    // Adds a ! to each element in the ArrayList, returns an ArrayList
    public static ArrayList<String> makeExciting(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++){
            list.set(i, list.get(i) + "!");
        }
        return list;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list1.size(); i++){
            int x = list1.get(i);
            for (int j = 0; j < list2.size(); j++){
                int y = list2.get(j);
                if (y == x){
                    return true;
                }
            }
        }
        return false;
    }


    // METHODS FOR THE HOMEWORK:

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) {
        int c = 0;
        for (int i = 0; i  < list.size(); i++){
            if (list.get(i) % 2 != 0){
                c++;
            }
        }
        return c;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    // Unlike the other methods, the input is an array!
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            list.add(i, arr[i]);
        }
        return list;
    }

    // Takes two **sorted** ArrayLists and merges them together into one big sorted ArrayList
    // (Hint: you may find it useful to use a while loop, as well as the remove() method).
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
       for (int second_index = 0; second_index < list2.size(); second_index++){
           for (int first_index = 0;; first_index++){
               if (first_index == list1.size() || list1.get(first_index) > list2.get(second_index)){
                   list1.add(first_index, list2.get(second_index));
                   break;
               }
           }
       }
       return list1;
    }



    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
