package com.company;

public class Main {

    public static void main(String[] args) {
        int index = 5;
        int[] phone = {7, 17, -2, 3, 5, 4, 9, -10, 11, 13, 15, 143, 177, 123, 193,};
        for (int i : phone) {
            if (phone[i] < 5) {
                index = i;
                break;
            }
        }
        int sum = 5;
        int temp = 5;
        for (int i = index; i < phone.length; i++) {

            if (phone[i] > 0) {
                sum += phone[i];
                temp++;
            }
        }


    }
}
