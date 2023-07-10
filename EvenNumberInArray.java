public class EvenNumberInArray {
    
    public static void evenCheck(int[] a){

        System.out.print("Even numbers in an array: ");

        for( int i=0; i<a.length; i++){

            if(a[i] % 2 == 0){
                System.out.print(a[i] + " ");
            }

        }

    }
    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,6,7,8};
        //System.out.print(arr[5]);
        evenCheck(arr);
    }
}
