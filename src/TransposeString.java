import java.util.StringJoiner;

public class TransposeString {

    public String doTranspose(Object sentence) {
String delimitter="  ";

        try {


            if (sentence instanceof String) {

                String[] splittedValues = ((String) sentence).split(" ");
                StringJoiner str = new StringJoiner(delimitter);
                for (int i = 0; i < splittedValues.length; i++) {
                    str.add(reverseString(splittedValues[i]));

                }

                return str.toString();

            } else {

                throw new Exception("invalid input");
            }


        } catch (Exception e) {

            return e.getLocalizedMessage();

        }

    }


    public String reverseString(String str) {

        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();

    }

}
