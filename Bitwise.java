// Count no of bits
// SET BIT
// RESET BIT
// Check Odd even num
// Array Unique Element where every ele is occ twice except 1
// public class Bitwise {
//     static int getIthbit(int n,int i){
//         n = n>>(i-1);
//         int mask=1;
//         int lsb=mask&n;
//         return lsb;
//     }
//     static int getTotalBits(int n){
//         int totalBits=0;
//         while(n!=0){
//             n=n>>1;
//             totalBits++;
//         }
//         return totalBits;
//     }
//     static void printInBinary(int n){
//         int totalBits=getTotalBits(n);
//         for(int i=totalBits;i>0;i--){
//             System.out.print(getIthbit(n,3));
//         }
//     }
//     static int setithBit(int n,int i){
//         int mask = 1<<(i-1);
//         return n | mask;
//     }
//     static int unSetIthBit(int n,int i)
//     {
//         int mask= ~(1<<(i-1));

//         return n & mask;
//     }
//     static void oddEven(int n)
//     {
//         if( (n&1)==1)
//         System.out.println("No is odd");
//         else
//         System.out.println("no is even");
//     }

//     static int Unique(int arr[],int n){
//         int ans=0;
//         for(int i=0;i<n;i++){
//             ans = ans^arr[i];
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         System.out.println(getTotalBits(12));
//         System.out.println(setithBit(12, 2));
//         int arr[] = {1,2,1,2,3,4,3};
//         int n=7;
//         System.out.println(Unique(arr, n));
//     }
// }

// Find unique element where every ele is occ thrice except 1

// We will check all the bits 1 by 1 from lsb to msb
// There will be 0 & 1s in triplets
// So the count of 0 and 1 is a multiple of 3 , if it is not then it is bcz of the unique num
// ATmost Num can have 32 as it is in the range -2^31 to 2^31-1
// int ans =0
/* for (i=0 to 31)
   int cnt =0
   for(int ele:arr)
   ele = ele>>i;
   if(ele&1==1)
   cnt++;
   if(cnt%3!=0)
   ans = ans ! (1<<i)
   return ans

 */
public class Bitwise {

    static int uniqueNo(int arr[]) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int cnt = 0;
            for (int no : arr) {
                no = no >> i;
                if ((no & 1) == 1) {
                    cnt++;
                }
                if (cnt % 3 != 0) {
                    ans = ans | (1 << i);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 3, 2, 2 };
        System.out.println("Unique No= "+uniqueNo(arr));

    }
}

// IN EVEN NOS Directly take XOR to find single unique element 
// IN ODD NOS apply Above method 
// If there are 5 or 7 duplicate elements and 1 single take modulo with 5 or 7 resp as we hv taken 3 above
