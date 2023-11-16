package HardProblems;

public class Problems {
    public static void main(String[] args){
        // System.out.println(minMoves(new int[] {3, 1, 5}, new int[] {2, 7, 4}));
        // System.out.println(minMoves(new int[] {2, 2, 6, 6}, new int[] {1, 3, 2, 6}));

        System.out.println(countOdds(1, 9));
        System.out.println(countOdds(2, 9));
        System.out.println(countOdds(3, 9));
        System.out.println(countOdds(4, 9));


    }

    public static int minMoves(int[] arr1, int[] arr2){
        int moves = 0;

        sort(arr1);
        sort(arr2);

        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                moves = moves + Math.abs(arr2[i] - arr1[i]);
            } else{

            }
        }

        return moves;
    }

    public static void sort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			for(int j=i-1; j>=0; j--) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j+1];
		            arr[j+1] = arr[j];
		            arr[j] = tmp;
				}
			}
		}
	}

    public static int robEm(int[] arr){
        int tmp1 = arr[0];
        int tmp2 = arr[1];
        int max = 0;

        for(int i=0; i<arr.length; i++){

        }

        return max;
    }

    public static int countOdds(int low, int high){
        // int counter = 0;

        // for(int i=low; i<=high; i++){
        //     counter = i%2 == 1 ? counter + 1 : counter;
        // }

        // return counter;

        return  low % 2 == 1 ? (high - low) / 2 + 1 : (high - low + 1) / 2;
    }

    
}
