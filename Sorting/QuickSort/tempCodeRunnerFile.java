
        int T=sc.nextInt();
        while(T>0){
            int[] arr=inputArray();
            int[] newArr=quickSort(arr, 0, arr.length-1);
            print1DArray(newArr);
            T--;
        }