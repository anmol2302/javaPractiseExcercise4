import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternFinder {

    public String findMatches(Object sentence){

       boolean found=false;
        try {

            if(sentence instanceof  String){
            Pattern pattern = Pattern.compile("Harry");
            Matcher matcher=pattern.matcher(((String) sentence).toString());
            while(matcher.find()){found=true;}

            return prepareOutput(found);

            }

        else{
            throw new Exception("invalid input");
            }
        }
        catch(Exception e){return "invalid input";}

    }
    public String prepareOutput(boolean found){

        return "is Harry here? "+found;

    }



}