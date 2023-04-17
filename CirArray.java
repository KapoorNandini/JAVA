//**************SUBARRAY OF SIZE 3 IN A CIRCULAR ARRAY
// public class CirArray {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4 };
//         int n = 4;
//         for (int i = 0; i < n; i++) {
//                 for(int j=0;j<3;j++){
//                     System.out.print(arr[(i+j)%n]);
//                 }
//                 System.out.println(" ");
//             }
//         }

//     }


//*************PRINTING ALL THE SUBARRAYS OF CIRCULAR ARRAY
// Here size is variable and it is written in loop as we hv to print the subarray of all the sizes i-e from
// 1 to n

// public class CirArray {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4 };
//         int n = 4;
//         for (int i = 0; i < n; i++) {
//             for (int size = 1; size <= n; size++) {
//                 for(int j=0;j<size;j++){
//                     System.out.print(arr[(i+j)%n]);
//                 }
//                 System.out.println(" ");
//             }
//         }

//     }
// }


//************PRINTING THE SUM OF MAX SUBARRAY

// public class CirArray {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4 };
//         int n = 4;
//         int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < n; i++) {
//             for (int size = 1; size <= n; size++) {
//                 int currSum = 0;
//                 for (int j = 0; j < size; j++) {
//                     currSum += arr[(i + j) % n];

//                     maxSum = maxSum > currSum ? maxSum : currSum;
//                 }
//             }
//         }
//         System.out.print(maxSum);

//     }
// }


// MAX SUM CAN RESIDE IN CIRCULAR OR LINEAR PART
// IF IT RESIDE IN LINEAR PART ---> KADANE ALGO
// IF IT RESIDE IN CIRC PART ---> TOTAL_SUM - MIN_SUBARRAYSUM
//for(ele:arr) ---> fancy way of traversing an array using for loop

//2nd approach for PRINTING THE MAX SUM MAX SUBARRAY
class CirArray {
    
    static int kadane(int[] arr)
    {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        boolean allNegative=true;

        int maxNo=Integer.MIN_VALUE;

        int n=arr.length;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            allNegative=false;

            if(currSum+arr[i]>0)
            currSum+=arr[i];

            else
            currSum=0;

            maxSum=Math.max(maxSum, currSum);

            maxNo=Math.max(maxNo,arr[i]);


        }

        if(allNegative)
        return maxNo;

        return maxSum;
    }



    static int minSubarraySum(int []arr)
    {

        int n=arr.length;
        int currentSum=0;
        int minSum=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(currentSum+arr[i]<0)
            currentSum+=arr[i];

            else 
            currentSum=0;

            if(currentSum<minSum)
            minSum=currentSum;

        }
        return minSum;
    }


    static int totalSum(int [] arr)
    {
        int sum=0;

        //for each loop
        for(int ele:arr)
        sum+=ele;

        return sum;
    }




    static int maxSubarraySumCircular(int[] arr) 
    {

        int n=arr.length;

        // Apply Kadane
        int normalSum=kadane(arr);

        // Circular Sum
        // circularSum=Total - minSubArraySum
        int circularSum=totalSum(arr)-minSubarraySum(arr);


        if(circularSum==0)
        return normalSum;

        if(normalSum>circularSum)
        return normalSum;

        return circularSum;
    }

    public static void main(String[] args) {
    
        int [] arr={1,-10,-20,3,4};

        System.out.println("MAX SUBARRAY SUM IS " +maxSubarraySumCircular(arr));
    }
}




