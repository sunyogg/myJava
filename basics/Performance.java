package java.basics;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i=0; i<26; i++) {
            char alpha = (char)('a' + i);
            series += alpha;
        }
        System.out.println(series);
    }
}

// "" + 'a' = "a" // new object "a" is created and previous("") becomes redundant.
// "a" + 'b' = "ab" // new object "ab" is created and previous("a") becomes redundant.
// "ab" + 'c' = "abc" // new object "abc" is created and previous("ab") becomes redundant.
// "abc" + 'd' = "abcd" // new object "abcd" is created and previous("abc") becomes redundant.
// so a lot of memory is wasted on created new objects and old objects don't do
// anything just sit in the memory until garabage collection come and collect
// those redundant variable.
// It would have been better if there was a type of object which can help us to
//  modify strings intead of creating a new object.

// open class UsingStringBuilder to check solution.