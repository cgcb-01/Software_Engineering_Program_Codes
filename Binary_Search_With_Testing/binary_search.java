import java.lang.reflect.Array;
import java.util.*;
public class binary_search {
    public int binarySearch(ArrayList<Integer> ListOfItems,int leftIndex,int rightIndex,int SearchingValue)
    {
    int midIndex=(leftIndex+rightIndex)/2;
    while (leftIndex <= rightIndex) {
        if (ListOfItems.get(midIndex) == SearchingValue) {
            return midIndex;
        }
        if (ListOfItems.get(midIndex) < SearchingValue) {
            leftIndex = midIndex + 1;
        } else {
            rightIndex = midIndex - 1;
        }
        midIndex = (leftIndex + rightIndex) / 2;
    }
    return -1;
    }
    public int inputTaking(ArrayList<Integer> ListOfItems)
    {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("Enter the Elements and a blank input to discontinue:");
        while(true)
        {
            String currentInput=scannerObject.nextLine().trim();
            if(currentInput.isEmpty())
                break;
            ListOfItems.add(Integer.parseInt(currentInput));  
        }
        System.out.println("Enter the Searching Value:");
        int SearchingValue=scannerObject.nextInt();
        scannerObject.close();
        return SearchingValue;
    }
    public static void main(String[] args) {
        binary_search binarySearchObject=new binary_search();
        ArrayList<Integer> ListOfItems=new ArrayList<>();
        int SearchingValue=binarySearchObject.inputTaking(ListOfItems);
        Collections.sort(ListOfItems);
        System.out.println("Sorted List:"+ListOfItems);
        int resultIndex=binarySearchObject.binarySearch(ListOfItems,0,ListOfItems.size()-1,SearchingValue);
        if(resultIndex==-1)
            System.out.println("Element not found in the List");
        else
            System.out.println("Element found at index: "+resultIndex);
    }   
}
