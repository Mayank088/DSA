package Hashing;
//Linear probing is a collision-handling technique in hashing. Linear probing says that whenever a collision occurs, search for the immediate next position.
//
//Given an array of integers and a hash table size. Fill the array elements into a hash table using Linear Probing to handle collisions. Duplicate elements must be mapped to the same position in the hash table while colliding elements must be mapped to the [(value+1)%hashSize] position.
//
//Note :-  If there's no more space to insert a new element, just drop that element.
public class Linear_Probing
{
    public static int size;
    public static int[] linearProbing(int hash_size, int arr[], int sizeOfArray)
    {
        int hashTable[] = new int[hash_size];
        size=0;
        for(int i=0; i<hash_size; i++){
            hashTable[i]=-1;
        }
        for(int i=0; i<sizeOfArray; i++){
            insert(arr[i], hashTable, hash_size);
        }
        return hashTable;
    }

    public static void insert(int key , int hashTable[] , int hashSize)
    {
        if(size >= hashSize){
            return;
        }
        int index = key % hashSize;
        if(hashTable[index]==-1){
            hashTable[index]=key;
            size++;
            return;
        }

        while(hashTable[index]!=-1 && hashTable[index]!=key){
            index = (index+1)%hashSize;
        }

        if(hashTable[index]==key){
            return;
        }
        else{
            size++;
            hashTable[index]=key;
        }
    }
    
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(1)



    public static void main(String[] args) {
        int hashSize = 10;
        int sizeOfArray = 4;
        int arr[] = {4,14,24,44};

        int ans[] = linearProbing(hashSize , arr , sizeOfArray);

        for (int i=0 ; i<hashSize ; i++){
            System.out.print(ans[i] + " , ");
        }
    }
}
