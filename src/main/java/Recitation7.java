public class Recitation7 {
    /*
     * You may add any private helper method you see necessary,
     * but you may NOT change the signatures of the methods below.
     */
    public static boolean lastItemReachable(int[] hopList){
       int currentIndex = 0;
       int targetIndex = hopList.length -1;

        for (int i = 0; i <= currentIndex; i++) {
            if (currentIndex >= targetIndex) {
                return true;
            }
            if (hopList[currentIndex] == 0) {
                return false;
            }
            currentIndex += hopList[currentIndex];
        }

        return false;

    }

    public static int[] slidingWindowMin(int[] numberList, int windowSize){
        if (windowSize <= 0 || windowSize > numberList.length) {
            return new int[0];
        }

        int[] result = new int[numberList.length - windowSize + 1];

        for (int i = 0; i <= numberList.length - windowSize; i++) {
            int min = numberList[i];
            for (int j = i + 1; j < i + windowSize; j++) {
                if (numberList[j] < min) {
                    min = numberList[j];
                }
            }
            result[i] = min;
        }

        return result;
    }
}
