public class SelectionSort {

    static double []list ={1,9,5.5,6.6,4.6,-1,3};

    public static void selectionSort(double[]list){

        for (int i = 0; i<list.length;i++){
            double currentMax = list[i];
             int currentMaxIndex = i;

             for (int j =i+1;j<list.length;j++){
                 if (currentMax<list[j]){
                     currentMax =list[j];
                     currentMaxIndex =j;
                 }
             }

             if (currentMaxIndex !=i){
                 list[currentMaxIndex] =list[i];
                 list[i] =currentMax;
             }
        }
    }

    public static void selectionSortMin(double[]list){

        for (int i= 0;i<list.length;i++){
            double currentMin =list[i];
            int currentMinIndex = i;

            for (int j=i+1;j<list.length;j++){
                if (currentMin>list[j]){
                    currentMin =list[j];
                    currentMinIndex =j;
                }
            }

            if (currentMinIndex != i){
                list[currentMinIndex]= list[i];
                list[i] =currentMin;
            }
        }
    }

    public static void main(String[] args) {

        selectionSort(list);
        for (int i =0;i<list.length;i++){
            System.out.print(list[i]+"\t");
        }

        System.out.println("\n++++++++++++++++++++++++++++++++++");

        selectionSortMin(list);
        for (int  i=0;i<list.length;i++){
            System.out.print(list[i]+"\t");
        }
    }
}
