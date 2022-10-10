public class Phraseomatic{
    public static void main(String[] args){
        int i = 0;
        while (i<50){
            String[] arr1 = {"sunyog", "john", "corey", "ansh"};
            String[] arr2 = {"loves", "hates", "likes", "dislikes"};
            String[] arr3 = {"mango", "apple", "berry", "coconut"};

            int len1 = arr1.length;
            int len2 = arr2.length;
            int len3 = arr3.length;

            double rand0 = Math.random();
            double rand1 = rand0 * len1;
            int rand4 = (int) rand1;

//            System.out.println(rand0);
//            System.out.println(rand1);
//            System.out.println(rand4);




            double rand2 = Math.random() * len2;
            int rand5 = (int) rand2;
            double rand3 = Math.random() * len3;
            int rand6 = (int) rand3;

            System.out.println(arr1[rand4]+" "+arr2[rand5]+" "+ arr3[rand6]);

            i++;
        }

    }
}