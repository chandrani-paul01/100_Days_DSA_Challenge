class Solution {
    public void rotate(int[] arr, int k) {

        int first = 0;
        int last = arr.length-1;
        k = k % arr.length;

        if(k>0){
            reverse(arr,0,(last-k));
            reverse(arr,((last-k)+1), last);
            reverse(arr,first,last);
        }
    }

    void reverse(int[] arr,int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
