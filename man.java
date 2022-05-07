
public class man {

    public String isEvenOrOdd(int x){
        if (x%2==0){
            return "EVEN";
        }
        else return "ODD";
    }

    public int min(int Array[]){
        int min=Array[0],i=0;

        while (i< Array.length) {
            if (Array[i] < min) {
                min = Array[i];
            }
            i++;
        }
        return min;
    }
    public int max(int Array[]){
        int max=Array[0], j=0;
        while (j< Array.length){
            if (Array[j]>max){
                max = Array[j];
            }
            j++;
        }
        return max;
    }
    public static void main( String[] args){

        int A[]= {1,5,2,5,6,1,7,34,1};
        int x=9, y=18;


    }
}
