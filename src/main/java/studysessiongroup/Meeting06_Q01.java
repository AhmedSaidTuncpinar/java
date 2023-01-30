package studysessiongroup;

import java.util.*;

public class Meeting06_Q01 {

    public static void main(String[] args) {
        //Q01. [0,2,3,0,12,,0] put the zeros to the end.

        //Step 1. We need to Create an ArrayList. Because we need to put several variables into a single data type.
        // Also, ArrayList give us opportunity to make changes for variables easily.

        int arr[]={0,2,3,0,12,0};

        //Step 2. We need to create a new ArrayList object same as the previous ArrayList's length to put our new variables.
        int brr[]= new int[arr.length];

        //Step 3. We need a container equals 0. Because it needs to start from index 0.

        int idx =0;


        //Step 4. We need for loop to check the every variable according to index of our Array.

        for (int i=0; i<arr.length; i++){

            //Step 5. We need if statement to check if the element not equals 0.

            if (arr[i]!=0){

                // Step 6. If a number is not equal to 0, we need to put it below container to change it.
                brr[idx]=arr[i];
                 // Step 7. We need to increment the value of idx.
                idx++;
            }
                // Step 8 Print it and see on the console.
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));


        //Q01. [0,2,3,0,12,,0] put the zeros to the end.

    int arr1[]= {0,1,0,2,0,3,0,4,0,5,0};
    int brr1[]= new int[arr1.length];
    int idx1=0;
    for (int i=0; i<arr1.length; i++){
        if (arr1[i]!=0){
            brr1[idx1]=arr1[i];
            idx1++;
        }
    }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(brr1));

        //put the zeros to the end.
        int x[]={0,1,0,2,0,3,0,4,0};
        int y[]= new int[x.length];
        int z=0;
        for (int i=0; i<x.length; i++){
            if (x[i]!=0){
                y[z]=x[i];
                z++;
            }
        }
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));

        //put the zeros to the end

        int a[]={0,1,0,2,0,3,0,4,0,5};
        int b[]= new int[a.length];
        int c=0;
        for (int i=0; i<a.length; i++){
            if (a[i]!=0){
                b[c]=a[i];
                c++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


        //put the zeros to the end

        int s []= {1,2,0,0,3,0,4,0,0};
        int t[]= new int[s.length];
        int v=0;
        for (int i=0; i<s.length; i++){
            if (s[i]!=0){
                t[v]=s[i];
                v++;
            }
        }
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(t));

        //put the zeros to the end

        int arra[]={0,0,0,0,1,2};
        int brra[]=new int[arra.length];
        int krr=0;
        for (int i=0; i<arra.length; i++){
            if (arra[i]!=0){
                brra[krr]=arra[i];

                krr++;
            }
        }
        System.out.println(Arrays.toString(arra));
        System.out.println(Arrays.toString(brra));

        //put the nulls to the end in a string Array container.
        String str[]={null, null, "Ahmet", null, "Hasan" };
        String btr[]= new String[str.length];
        int xtr= 0;
        for (int i=0; i<str.length; i++){
            if (str[i]!=null){
                btr[xtr]=str[i];
                xtr++;

            }
        }
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(btr));






































    }


}
