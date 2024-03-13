package JavaAssighnmentRoohiMam;

public class AllOfByOne {
    public static void main(String[] args) {
        int[] arr1 = {4,15,40,98};
        int[] arr2 = {5,16,41,100};
        System.out.println(findAllByOne(arr1,arr2,0));
    }
    static boolean findAllByOne(int[] arr1,int []arr2,int index){
        if(arr1.length != arr2.length){
            return false;
        }
        if(arr1.length == index){
            return true;
        }

        if(arr1[index] + 1 == arr2[index]){
            return findAllByOne(arr1, arr2, index + 1);
        }else{
            return false;
        }
    }
}
