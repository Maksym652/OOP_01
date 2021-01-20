package com.company;

import java.util.Arrays;

public class Main {

    //task 11
    public int sumOfDigits(int x){
        int sum = 0;
        while (x>=10)
        {
            sum+=x%10;
            x/=10;
        }
        sum+=x;
        return sum;
    }
    //task 30
    public int[] uniqueElements(int[]... arrays) {
        int length=0;
        for (var array : arrays) {
            length+=array.length;
        }
        int[] all = new int[length];
        int i=0;
        for (var array : arrays) {
            for (var elem : array) {
                all[i] = elem;
                i++;
            }
        }
        int[] result = new int[length];
        int k=0;
        boolean b;
        for(i=0; i<length; i++) {
            b = true;
            for (int j = 0; j < length; j++) {
                if (j != i && all[j] == all[i])
                {
                    b = false;
                    break;
                }
            }
            if (b) {
                result[k] = all[i];
                k++;
            }
        }
        result = Arrays.copyOf(result, k);
        return result;
    }

    //task 3
    public int[] insert(int[] arr, int pos, int num)
    {
        int[] result = new int[arr.length+1];
        for(int i=0; i<pos; i++)
        {
            result[i]=arr[i];
        }
        result[pos] = num;
        for(int i=pos; i<arr.length; i++){
            result[i+1]=arr[i];
        }
        return result;
    }

    //task 2
    public void commonElements(int[][] arr1, int[][] arr2){
        for(int i=0; i<arr1.length; i++){
            for (int j=0; j<arr1[i].length; j++){
                for (int k = 0; k<arr2.length; k++){
                    for(int l=0; l<arr2[k].length; l++){
                        if(arr1[i][j]==arr2[k][l]){
                            System.out.print(arr1[i][j]+" ");
                        }
                    }
                }
            }
        }
    }

    //task 13
    public void selectionSort(int[] arr)
    {
        int p=0;
        int min;
        int tmp;
        for(p=0; p<arr.length; p++)
        {
            min = p;
            for(int i=p; i<arr.length; i++){
                if(arr[i]<arr[min]){
                    min = i;
                }
            }
            if(min!=p){
                tmp=arr[min];
                arr[min]=arr[p];
                arr[p]=tmp;
            }
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println("sum of digits 123456789: "+m.sumOfDigits(123456789));
        System.out.println("\ntask 30: ");
        int[] arr = m.uniqueElements(new int[]{1,2,6,3,1,8},new int[]{2,3,4,4,5,1}, new int[]{3,5,1,7,8,9,0});
        for (var item:
                arr) {
            System.out.print(item+" ");
        }
        System.out.println("\ntask 3: ");
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = m.insert(arr2,3,9);
        for (var item:
                arr3) {
            System.out.print(item+" ");
        }
        System.out.print("\ntask2: ");
        m.commonElements(new int[][] {{3,2,1},{8,7}}, new int[][]{{2,6},{3,7,9,8,12}});
        System.out.print("\ntask13: ");
        arr3 = new int[]{5,9,3,1,7,6,8,2,0,4,6,8,2,3,7,5,3,1,9,7};
        m.selectionSort(arr3);
        for (var item:
                arr3) {
            System.out.print(item+" ");
        }
    }
}