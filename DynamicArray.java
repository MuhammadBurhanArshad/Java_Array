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
}
