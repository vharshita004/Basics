//max and min element
class A{

     static void maxElement(int[] arr){
        int max = arr[0];

    for(int i = 0; i<arr.length; i++){

        if(arr[i] > max){

            max = arr[i];
        }
     } 

       System.out.println("Maximum element in : " + max);

  }
     static void minElement(int[] arr){
        int min = arr[0];

     for(int i = 0; i<arr.length; i++){

        if(arr[i] < min){

            min = arr[i];
        }
     }

       System.out.println("Minimum element is : " + min);

  }     
    public static void main(String[] args){
      int[] arr = {10,5,15,12,2};

      maxElement(arr);
      
      minElement(arr);
       
  }
}