package game.lib.util.text;

import org.junit.Test;

import com.game.util.text.NumberFormatter;


public class NumberFormatterUnitTest {

  @Test
  public void test(){
    System.out.println(NumberFormatter.byteFormatAsHumanReadable(new Long("27091989")));
    System.out.println(NumberFormatter.milliTimeAsHumanReadable(new Long("27091989")));
    System.out.println(NumberFormatter.nanoTimeAsHumanReadable(new Long("27091989")));
  }
}
