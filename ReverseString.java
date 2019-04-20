public class Main {
  public static void main(String[] args) {
  
  int[] array = {0,1,2,3,4,5,6,7};
  
  for(int i=0; i<array.length/2; i++) {
    int temp1 = array[array.length-(1+i)];
    int temp2 = array[i];
    array[i] = temp1;
    array[array.length-(1+i)] = temp2;
  }
  
  for(int i=0; i<array.length; i++) {
    System.out.println(array[i]);
  }
  
 }
}
