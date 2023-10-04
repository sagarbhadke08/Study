class palidromeOrNot {

    public static void main(String[] args) {
        System.out.println("SDE at Microsoft");

        int[] arr;
        arr = new int[5];

        arr[0] = 10;
        arr[1] = 12;
        arr[2] = 15;
        arr[3] = 45;
        arr[4] = 23;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // int[] palindromeOrNotArr = { 1, 5, 3, 2, 1 };
        // int n = palindromeOrNotArr.length;
        // System.out.println(n);
        // for (int i = 0; i < n; i++) {
        //     if (palindromeOrNotArr[i] == palindromeOrNotArr[n - 1 - i]) {
        //         System.out.println("Array is Palidrome");
        //     }

        //     System.out.println("Its not an palindrome array");
        // }

        // System.out.println("out of loop");
        int[] palindromeOrNotArr = {1, 5, 3, 2, 1};
        int n = palindromeOrNotArr.length;
        System.out.println(n);
        int flag = 0;
        
        for (int i = 0; i < n / 2; i++) {
            if (palindromeOrNotArr[i] != palindromeOrNotArr[n - 1 - i]) {
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            System.out.print("It's not a palindrome array");
        } else {
            System.out.print("It's a palindrome array");
        }
       
    }
}