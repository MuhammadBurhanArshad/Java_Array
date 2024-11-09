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
}
