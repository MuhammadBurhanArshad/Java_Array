public class Main {
    public static void main(String[] args) {
        int[] myRegID = {2, 3, 1, 2, 3, 9, 5,2,3};
        
        DynamicArray dynamicArray = new DynamicArray();

        System.out.println("Our Original Array is: " + dynamicArray.arrayToString(myRegID));
        
        int[] distinctArray = dynamicArray.getDistinct(myRegID);

        System.out.println("Distinct Array is: " + dynamicArray.arrayToString(distinctArray));

        int[] duplicatesArray = dynamicArray.getDuplicates(myRegID);

        System.out.println("Duplicate Array is: " + dynamicArray.arrayToString(duplicatesArray));

        int[] medianArray = dynamicArray.getDuplicates(myRegID);

        System.out.println("Duplicate Array is: " + dynamicArray.arrayToString(medianArray));
    }
}