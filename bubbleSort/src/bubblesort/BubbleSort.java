package bubblesort;
public class BubbleSort 
{
    public static void main(String[] args) 
    {
        int a;
        int b;
        int temp;
        int[] someNums = {88, 33, 99, 22, 54};
        for(a = 0; a < someNums.length -1; ++a)
            for(b = 0; b < someNums.length - 1; ++b)
                if (someNums[b] > someNums[b +1])
                {
                    temp = someNums[b];
                    someNums[b] = someNums[b + 1];
                    someNums[b + 1] = temp;
                }
        int comparisonsToMake = someNums.length -1;
        for(a = 0; a < someNums.length -1; ++a)
        {
            for(b = 0; b < comparisonsToMake; ++b)
            {
                temp = someNums[b];
            }
        }
       
    }
    
}
