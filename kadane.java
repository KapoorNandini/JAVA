//KADANE ALGORITHM
// class kadane {
//     public 
//     static int maxSubArray(int[] arr) {

//         int n = arr.length;
//         int maxSum = Integer.MIN_VALUE;
//         int currSum = 0;
//         int allNegative = 1;
//         for (int i = 0; i < n; i++) {
//             if (currSum + arr[i] > 0)
//                 currSum += arr[i];

//             else
//                 currSum = 0;

//             if (arr[i] > 0)
//                 allNegative = 0;

//             maxSum = maxSum > currSum ? maxSum : currSum;
//         }

//         if (allNegative == 1) {
//             int maxNo = Integer.MIN_VALUE;
//             for (int i = 0; i < n; i++)
//                 maxNo = arr[i] > maxNo ? arr[i] : maxNo;

//             return maxNo;

//         }
//         return maxSum;
//     }

// public static void main(String[] args) {
//     int arr[] = {1,3,5,-2,9};
//     System.out.println("The sum of max subarray is "+maxSubArray(arr));
// }
// }


// CHOCOLATE PROBLEM
import java.util.Arrays;

class chocolateSale
{

    static int minCost(int[]arr,int k)
    {
        int n=arr.length;
        Arrays.sort(arr,0,n);

        int cost=0,varities=0;

        for(int currentPrice:arr)
        {
            cost+=currentPrice;
            varities+=k+1;

            if(varities>=n)
            break;
        }

        return cost;
    }
    public static void main(String[] args) {
        int []arr={3,2,1,4};
        int k=2;

        System.out.println("min cost= "+minCost(arr, k));
    }
}





