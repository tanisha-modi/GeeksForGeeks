// link to the question --> https://practice.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1

class Hanoi {

    int count = 0;
    public long toh(int N, int from, int to, int aux) {
        
        // Recursion // tower of hanoi
        
        if(N==0){            // base condition
            return count;
        }
        toh(N-1, from, aux, to);  // sending n-1 disks to helper
        System.out.println("move disk " + N  + " from rod " + from + " to rod " + to);
        toh(N-1, aux, to, from);  // sending n-1 disk to dest using source(from) as helper
        count++;
        return count;
    }
}