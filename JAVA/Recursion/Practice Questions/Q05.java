/*
 * Question 5 : TOWER OF HANOI (Important!)
You have 3 towers and N disks of different sizes which can slide onto any tower. The puzzle
starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on
top of an even larger one).
You have the following constraints:
(1) Only one disk can be moved at a time.
(2) A disk is slid off the top of one tower onto another tower.
(3) A disk cannot be placed on top of a smaller disk. Write a program to move the disks from
the first tower to the
last using Stacks.
Let rod 1 = 'A', rod 2 = 'B', rod 3 = 'C'.
An example with 2 disks i.e. N=2:
Step 1 : Shift the first disk from 'A' to 'B'.
Step 2 : Shift the second disk from 'A' to 'C'.
Step 3 : Shift the first disk from 'B' to 'C'.
An example with 3 disks i.e. N=3 :
Step 1 : Shift the first disk from 'A' to 'C'.
Step 2 : Shift second disk from 'A' to 'B'.
Step 3 : Shift the first disk from 'C' to 'B'.
Step 4 : Shift the third disk from 'A' to 'C'.
Step 5 : Shift the first disk from 'B' to 'A'.
Step 6 : Shift second disk from 'B' to 'C'.
Step 7 : Shift the first disk from 'A' to 'C'.
The Approach here is :
- Shift 'n-1' disks from 'A' to 'B', using C.
- Shift the last disk from 'A' to 'C'.
- Shift 'n-1' disks from 'B' to 'C', using A
 */
public class Q05 {

    // Time Complexity : O(2^n)
    public static void towerOfHanoi(int n, char src, char helper, char dest) {
        // Base case: if there's only one disk, move it directly from source to
        // destination
        if (n == 1) {
            System.out.println("Shift disk 1 from '" + src + "' to '" + dest + "'.");
            return;
        }

        // Move n-1 disks from source to helper, using destination as a temporary helper
        towerOfHanoi(n - 1, src, dest, helper);

        // Move the nth disk from source to destination
        System.out.println("Shift disk " + n + " from '" + src + "' to '" + dest + "'.");

        // Move the n-1 disks from helper to destination, using source as a temporary
        // helper
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3; // You can change this value to test with different number of disks
        System.out.println("The steps to solve Tower of Hanoi with " + numberOfDisks + " disks are:");
        towerOfHanoi(numberOfDisks, 'A', 'B', 'C');
    }
}
