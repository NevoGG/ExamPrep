package utility_abilities;

/**
 * regex:
 * abc - just abc expression
 * [abc] - one of these
 * [^abc] - not abc
 * [a-z] range
 * abc+ one or more
 * ab [a-d]- ab folloed by a letter
 * ab{2} pattern repeating 2 times
 * abc|[dzr] or statement
 *
 * /d digit
 * /D non digit
 * /s space
 * /S non whitespace
 * /w word character (includes digits).
 * /W non word charater
 *
 * pattern and matcher!!!
 */


// how to use:
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class regex {

    public void test(){
        Pattern p = Pattern.compile("[abc]"); // create pattern, transform to regex object I guess
        Matcher m = p.matcher(("asdsdgjnsdkfjskdfaadAFKj!!")); // mathcer object, to use in pattern
        m.find(); // boolean, sees if there's a next pattern
        m.start(); //index of expression start
        m.end(); // index of expression end
    }
}
