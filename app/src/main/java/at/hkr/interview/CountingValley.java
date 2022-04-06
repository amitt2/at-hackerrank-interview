package at.hkr.interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingValley {

    public int countingValleys(int steps, String path) {        
            if(path == null || path.length()<3){
                return 0;
            }
            int valleyCounter = 0;        
            Pattern pattern = Pattern.compile("D{2,}U+");
            Matcher matcher = pattern.matcher(path);
            while(matcher.find()){
                valleyCounter++;
            }
            return valleyCounter;
        }
}
