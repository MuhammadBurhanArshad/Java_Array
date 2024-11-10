public class Main {
    public static void main(String[] args) {
        int[] myRegID = {2, 3, 1, 2, 3, 9, 5};
        
        DynamicArray dynamicArray = new DynamicArray();

        System.out.println("Our Original Array is: " + dynamicArray.arrayToString(myRegID));
        
        int[] distinctArray = dynamicArray.getDistinct(myRegID);

        System.out.println("Distinct Array is: " + dynamicArray.arrayToString(distinctArray));

        int[] duplicatesArray = dynamicArray.getDuplicates(myRegID);

        
        System.out.println("Duplicate Array is: " + dynamicArray.arrayToString(duplicatesArray));
         
        int maxSumOfTwo = dynamicArray.maxSumOfTwo(myRegID);
        
        System.out.println("Max sum of two elements is: " + maxSumOfTwo);

        int[] swappedLastTwo = dynamicArray.swapLastTwo(myRegID);

        System.out.println("Array with last two swapped is: " + dynamicArray.arrayToString(swappedLastTwo));
    
        float medianArray = dynamicArray.getMedian(myRegID);
        
        System.out.println("Median is: " + medianArray);
       
    }
}