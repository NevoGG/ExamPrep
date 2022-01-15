package Algorithms;

public class FindDuplicate {
    public int findFuplicate(int[] numList){
        int cursor1 = numList[0];
        int cursor2 = numList[0];// init both cursors at beginning
        // first leap:
        cursor1 = numList[cursor1]; // makes one leap
        cursor2 = numList[numList[cursor2]]; // makes two leaps
        while (cursor1 != cursor2){
            cursor1 = numList[cursor1]; // makes one leap
            cursor2 = numList[numList[cursor2]]; // makes two leaps
        }
        cursor1 = numList[0]; // sets one cursor at beginning.
        while (cursor1 != cursor2){
            cursor1 = numList[cursor1];
            cursor2 = numList[cursor2];
        }
        return cursor1;
    }
}
