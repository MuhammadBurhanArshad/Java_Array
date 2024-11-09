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
}
