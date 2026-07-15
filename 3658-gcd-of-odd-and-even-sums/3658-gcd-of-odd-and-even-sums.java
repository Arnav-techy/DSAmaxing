class Solution {
    //This problem actually contains a massive mathematical shortcut that eliminates the need for loops or GCD calculations entirely.The sum of the first $n$ odd numbers is always exactly $n^2$.The sum of the first $n$ even numbers is always exactly $n(n + 1)$.If you look for the GCD of $n \cdot n$ and $n \cdot (n + 1)$, they both share a common factor of $n$. The remaining parts, $n$ and $n + 1$, are consecutive integers, meaning they are always coprime (their GCD is 1). Therefore, the overall GCD will always just be $n$.
    public int gcdOfOddEvenSums(int n) {
        return n;
    }
}