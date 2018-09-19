import java.util.Arrays;
import java.util.StringJoiner;

public class SortParagraph {

    public String sort(Object str){

        try {
            if (str instanceof String) {
                StringJoiner sb=new StringJoiner(" ");
                String[] splittedValues = ((String) str).split(" ");
                for (int i = 0; i < splittedValues.length; i++) {
                    sb.add(sortString(splittedValues[i]));
                }

                return sb.toString();

            } else {

                throw new Exception("invalid input");
            }
        }
        catch(Exception e){
            return e.getLocalizedMessage();

        }

    }


    public String sortString(String str){

        if(str.length()!=0){

char[] tempArray=str.toCharArray();
            Arrays.sort(tempArray);
            return new String(tempArray);
        }

        else{
            return "";
        }

    }



}
