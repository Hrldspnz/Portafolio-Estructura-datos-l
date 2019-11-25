
package quicksort;


    public class Quicksort  {
        private static String[] names;
        private static int number;
        
        public static void main(String[] args){
            String arr[] = {"Marco","Fernando","Carlos","Jose","Ana","Miguel"};
            sort(arr);
            printArray(names, 0,0);
        }
        
        public static void sort(String[] values) {
            // check for empty or null array
            if (values ==null || values.length==0){
                return;
            }
            names = values;
            number = values.length;
            quicksort(0, number - 1);
        }
        private static void quicksort(int low, int high) {
            int i = low, j = high;
            String pivot = names[low + (high-low)/2];
            //System.out.println("pivote: " + pivot);
            //System.out.println("valores iniciales de i, j "+i +" "+ j);
            while (i <= j) {
                while (names[i].compareToIgnoreCase(pivot) < 0) {
                    i++;
                }
                while (names[j].compareToIgnoreCase(pivot) > 0) {
                    j--;
                }
                if (i <= j) {
                    //System.out.println("valores despues del bucle "+i +" "+ j);
                    exchange(i, j);
                    i++;
                    j--;
                }
            }
            if (low < j)
                quicksort(low, j);
            if (i < high)
                quicksort(i, high);
        }

        private static void exchange(int i, int j) {
            String temp = names[i];
            names[i] = names[j];
            names[j] = temp;
            //System.out.println("intercambiados: "+names[i] +" "+ names[j]);
            
        }

        static void printArray(String arr[], int i1, int i2){
            int n = arr.length;
            for (int i=0; i<n; ++i)
                //if(i == i1)
                //    System.out.print(arr[i] + " " + i1 + " " + i2 + " ");
                System.out.print(arr[i] + " ");
        System.out.println();
        }
}