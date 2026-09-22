import java.util.HashSet;
import java.util.Set;

class FindFirstDuplicate {
    public static int findFirstDuplicate(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return num; // Return the first duplicate found
            }
            seen.add(num);
        }
        return -1; // Return -1 if no duplicates are found
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 4, 5};
        int firstDuplicate = findFirstDuplicate(arr);
        if (firstDuplicate != -1) {
            System.out.println("The first duplicate is: " + firstDuplicate);
        } else {
            System.out.println("No duplicates found.");
        }
    }
}
