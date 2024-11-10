class DynamicArray {

    public String arrayToString(int[] array) {
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            if (i != array.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    public int[] bubbleSort(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            return array;
        }    

    public int[] getDistinct(int[] array) {
        int[] distinctArray = new int[array.length];
        int totalDistincts = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < totalDistincts; j++) {
                if (array[i] == distinctArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                distinctArray[totalDistincts++] = array[i];
            }
        }

        int[] result = new int[totalDistincts];
        for (int i = 0; i < totalDistincts; i++) {
            result[i] = distinctArray[i];
        }

        return result;
    }

    public int[] getDuplicates(int[] array) {
        int[] duplicatesItem = new int[array.length];
        int duplicatesItems = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                boolean alreadyAdded = false;
                for (int k = 0; k < duplicatesItems; k++) {
                    if (duplicatesItem[k] == array[i]) {
                        alreadyAdded = true;
                        break;
                    }
                }

                if (!alreadyAdded) {
                    duplicatesItem[duplicatesItems++] = array[i];
                }
            }
        }

        int[] result = new int[duplicatesItems];
        for (int i = 0; i < duplicatesItems; i++) {
            result[i] = duplicatesItem[i];
        }

        return result;
    }
    public float getMedian(int[] array) {
        int[] paramArray = array;
        int[] sortedArray = this.bubbleSort(paramArray);
        
        if (sortedArray.length % 2 == 0) {
            return (sortedArray[sortedArray.length / 2 - 1] + sortedArray[sortedArray.length / 2]) / 2.0f;
        } else {
            return sortedArray[sortedArray.length / 2];
        }
    }
    
    public int maxSumOfTwo(int[] array) {
        if (array == null || array.length < 2) {
            System.out.println("Array must have at least two elements.");
        }

        int max1 = array[0];
        int max2 = array[1];

        for (int i = 2; i < array.length; i++) {
            int current = array[i];
            
            if (current > max1) {
                max2 = max1;
                max1 = current;
            } else if (current > max2) {
                max2 = current;
            }
        }
        return max1 + max2;
    }

    public int[] swapLastTwo(int[] array) {
        int[] returnableArray = array;
        if (returnableArray.length >= 2) {
            returnableArray[returnableArray.length - 1] = returnableArray[returnableArray.length - 1] + returnableArray[returnableArray.length - 2];
            returnableArray[returnableArray.length - 2] = returnableArray[returnableArray.length - 1] - returnableArray[returnableArray.length - 2];
            returnableArray[returnableArray.length - 1] = returnableArray[returnableArray.length - 1] - returnableArray[returnableArray.length - 2];
        }

        return returnableArray;
    }

    public int[] replaceWithSquare(int[] array) {
        int[] returnableArray = array;
        for(int i = 0; i < returnableArray.length; i++) {
            returnableArray[i] = returnableArray[i]*returnableArray[i];
        }

        return returnableArray;
    }

    public boolean isPalindrome(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
}
