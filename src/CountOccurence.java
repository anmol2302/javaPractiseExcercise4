public class CountOccurence {
    public int countOccurence(Object str, Object value) {
        try {
            if (str instanceof String && value instanceof String) {
                String sentence = (String) str;
                int counter = sentence.split(value.toString(), -1).length - 1;

                return counter;

            } else {


                throw new Exception("invalid input");
            }

        } catch (Exception e) {

            return -1;
        }


    }


}
