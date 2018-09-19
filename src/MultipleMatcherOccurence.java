import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleMatcherOccurence {

        public  String findSubstring(Object text,Object patternString) {
            try{
            if(text instanceof String && patternString instanceof String){
            Pattern pattern = Pattern.compile(patternString.toString());
            Matcher matcher = pattern.matcher(text.toString());
            int count = 0;
                StringJoiner str=new StringJoiner("\n");
            while(matcher.find()) {
                count++;
                str.add("Found at: "
                        + matcher.start() + " - " + matcher.end());
            }
            return str.toString();
        }
            else{
             throw new Exception("invalid input");
            }
            }
        catch(Exception e){return e.getLocalizedMessage();}



        }}


