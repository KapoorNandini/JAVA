//Count no of bits
// SET BIT
public class Bitwise {
    static int getIthbit(int n,int i){
        n = n>>(i-1);
        int mask=1;
        int lsb=mask&n;
        return lsb;
    }
    static int getTotalBits(int n){
        int totalBits=0;
        while(n!=0){
            n=n>>1;
            totalBits++;
        }
        return totalBits;
    }
    static void printInBinary(int n){
        int totalBits=getTotalBits(n);
        for(int i=totalBits;i>0;i--){
            System.out.print(getIthbit(n,3));
        }
    }
    static int setithBit(int n,int i){
        int mask = 1<<(i-1);
        return n | mask;
    }
    public static void main(String[] args) {
        System.out.println(getTotalBits(12));
        System.out.println(setithBit(12, 2));
    }
}

