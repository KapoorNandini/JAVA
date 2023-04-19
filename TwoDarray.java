//SEARCH IN 2D MATRIX 
//Linear Search 
//APPROACH 1

// class searchIn2DMatrix {
//     static boolean search(int[][] arr,int target)
//     {
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=0;j<arr.length;j++)
//             {
//                 if(target==arr[i][j])
//                 return true;
//             }
//         }

//         return false;
//     }

//     public static void main(String[] args) {
//         int [][]arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};

//         boolean ans=search(arr,100);


//         if(ans==true)
//         System.out.println("Element found");
//         else
//         System.out.println("Element not found");


//     }
// }

// SEARCHING AN ELEMENT IN 2-D ARRAY

// *****2nd Approach 
// Apply binary search in the matrix
// public class TwoDarray{
//     class searchIn2DMatrix2 {
    
//         static boolean search(int[][] arr,int target)
//         {
//             int n=arr.length;
//             int m=arr[0].length;
    
//             for(int i=0;i<n;i++)
//             {
//                 if(target>=arr[i][0] && target<=arr[i][m-1])
//                 {
//                     // may be element is in this row
    
//                     int s=0,e=m-1,mid;
    
//                     while (s<=e) {
//                         mid=(s+e)/2;
    
//                         if(target==arr[i][mid])
//                         return true;
    
//                         else if(target>arr[i][mid])
//                         s=mid+1;
    
//                         else 
//                         e=mid-1;
//                     }
    
//                 }
    
//             }
    
//             return false;
//         }
    
//         public static void main(String[] args) {
//             int [][] arr={
//                 {1,3,5,7},
//                 {10,11,16,20},
//                 {23,30,34,60}
    
//             };
    
//             int target=300;
//             boolean ans=search(arr, target);
    
//             if(ans==true)
//             System.out.println("element found");
//             else
//             System.out.println("not found");
    
    
    
    
//         }
//     }
// }

// SEARCHING AN ELEMENT IN 2-D ARRAY

// *****3rd APPROACH

// find midrow
// check if target is eq to mid row ka last element 
// if(target == arr[midrow][m-1])
// return true
// else if (target>arr[mid][m-1])
// strow = midrow + 1
// else if element is less than mid row ka last
// element to it can be present either in currrow or in prev
// Apply binary search in currrow if found return true
// else enrow = midrow -1
// TIME COMPLEXITY = nlogm

// class TwoDarray
// {


//     static boolean search(int[][]arr,int target)
//     {
        
//         int n=arr.length;
//         int m=arr[0].length;

//         int stRow=0,enRow=n-1,midRow;

//         while (stRow<=enRow) {

//             midRow=(stRow+enRow)/2;

//             if(target==arr[midRow][m-1])
//             return true;

//             else if(target>arr[midRow][m-1])
//             stRow=midRow+1;
//             else
//             {
//                 int stCol=0,enCol=m-1,midCol;

//                 while (stCol<=enCol) {
//                     midCol=(stCol+enCol)/2;

//                     if(target==arr[midRow][midCol])
//                     return true;

//                     else if(target>arr[midRow][midCol])
//                     stCol=midCol+1;

//                     else
//                     enCol=midCol-1;
                    
//                 }

//                 enRow=midRow-1;
//             }
            
//         }


//         return false;
//     }
//     public static void main(String[] args) {
//         int [][]arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//         int target=50;
//         boolean ans=search(arr, target);

//         if(ans==true)
//         System.out.println("element found");
//         else 
//         System.out.println("not found");
//     }
// }


// ******4th APPROACH
// Treat array as linear array as it is sorted and every element of last row
// is less than next row element
// find mid
// Now find row and col no of mid 
// rowno = mid/colno
// colno = mid%colno
// Now apply binary search
// TIME COMPLEXITY = O(Logn*m)

class TwoDarray
{

    static boolean searchMatrix(int[][] arr, int target) 
    {
        int n=arr.length;
        int m=arr[0].length;

        int s=0,e=n*m-1,mid;

        while (s<=e) 
        {
            mid=(s+e)/2;
            int rowNo=mid/m;
            int colNo=mid%m;

            if(target==arr[rowNo][colNo])
            return true;

            if(target>arr[rowNo][colNo])
            s=mid+1;

            else
            e=mid-1;
            
              }

              return false;
    }
    public static void main(String[] args) 
    {

        int [][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};

       boolean ans= searchMatrix(arr, 16);

       if(ans==true)
       System.out.println("Element found");
       else
       System.out.println("not found");


    }
}


//Chocolate Problem











