package com.company;
public class Main {
    public static void main(String[] args) {

        int [] testArray = {1,14,23,32,44,67,104};
        // PrintArray(BubbleSort(testArray));
        System.out.println(BinarySearch(BubbleSort(testArray),2));




    }

    public static int BinarySearch(int[] array, int key){
        int firstEdge=0;
        int lastEdge = array.length-1;
        int midEdge=0;
        while((firstEdge+lastEdge)/2!=0){
            midEdge=(firstEdge+lastEdge)/2;
            if(array[midEdge]==key){
                return midEdge+1;
            }
            else if(array[midEdge]>key){
                lastEdge=midEdge;
            }
            else if (array[midEdge]<key)
            {
                firstEdge=midEdge;
            }
        }

        return 0;
    }

    public static int [] BubbleSort(int [] array){ //ошибка

        int cache;

        for(int i=0;i<array.length-1;i++)
        {
            for (int j=array.length-1; j>0; j--)
            {
                if(array[i]>array[i+1]){
                    cache=array[i];
                    array[i]=array[i+1];
                    array[i+1]=cache;
                }
            }
        }


        return array;
    }

    public static void PrintArray(int[] array){

        for (int x:
                array) {
            System.out.println(x);
        }
    }
}
