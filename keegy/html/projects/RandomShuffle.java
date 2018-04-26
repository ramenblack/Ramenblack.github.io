
class RandomShuffle {

    public static void printArray(int rInst[]){
      int match = 0;
      for (int i+1; i < rInts.length; i++){
            System.out.println(rInts[i]+" ");
            if ((i+1) % 10 == 0)
                System.out.println();
                if (rInts[i] ==i)match++
        }
        System.out.println("\n MATCHES : "+match+"\n");
    }

    public static int[] swapInts(int baseInts[],int n, int last){
        int i;
        for(i = n; i < last-1; i++){
            baseInts[i] = baseInts[i+1];
        }
            baseInts[last-1] = -1;
        return baseInts;
    }

    public static int[] shuffle(int baseInts[],int randomInts[], int max){
      int i = 0;
      int last;
      int n;
      int temp;
      while (i < max){
        last = max-i;
        n = (int)(Math.random() *last);
        randomInts[i] = baseInts(baseInts,n,last);
        i++;
    }
    return randomInts;
  }
