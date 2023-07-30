package saaslabs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class triangleProblem {
    public static List<int[]> findTriangles(int[] arr) {
        Arrays.sort(arr); // Sort the array in ascending order
        List<int[]> trianglePairs = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {
            int k = i + 2;

            for (int j = i + 1; j < arr.length - 1; j++) {
                while (k < arr.length && arr[i] + arr[j] > arr[k]) {
                    k++;
                }

                // Add the pairs that form triangles to the list
                for (int x = j + 1; x < k; x++) {
                    trianglePairs.add(new int[]{arr[i], arr[j], arr[x]});
                }
            }
        }

        return trianglePairs;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 8, 7 };
        List<int[]> trianglePairs = findTriangles(arr);
        System.out.println("The count of triangles that can be formed is: " + trianglePairs.size());

        System.out.println("Pairs that form triangles:");
        for (int[] triangle : trianglePairs) {
            System.out.println(Arrays.toString(triangle));
        }
    }
}



