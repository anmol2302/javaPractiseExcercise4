public class ReplaceCharacter {

    public String replaceString(Object sentence){


        try{

            if(sentence instanceof String){

                char[] newarr=((String) sentence).toCharArray();

                for(int i=0;i<newarr.length;i++){


                    if(newarr[i]=='d'){

                        newarr[i]='f';

                    }
                    else if(newarr[i]=='l'){
                        newarr[i]='t';
                    }
                    else{

                        continue;
                    }

                }



                String newSentence=new String(newarr);

                return newSentence;


            }
            else{
                throw new Exception("input should be in format string");

            }


        }catch(Exception e){

            return "invalid input";
        }
    }

}
