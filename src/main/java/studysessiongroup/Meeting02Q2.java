package studysessiongroup;

public class Meeting02Q2 {

    public static void main(String[] args) {

        //Type code to find sum of the number of characters of array elements

        String[] arr1 = {"Tom", "Kate", "Mary", "Pet", "Cat"};
        Integer sum = 0;
        for(String w : arr1){
            sum = sum + w.length(); }
        System.out.println(sum);

        //What is the result of the following code?

        StringBuilder sb= new StringBuilder();

        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);

        //abbaccca
        //Find the difference in hours for two different dates
    }

}


