package Binary_Search;

public class FindSmallestLetterGreaterThanTarget
{
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'z';// here array is wrapped around so the answer will be 'c'
        char result = nextGreatestLetter(letters, target);
        System.out.println("The smallest letter greater than " + target + " is: " + result);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
