package game.lib.util.text;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.game.util.text.CharacterSet;


public class CharacterSetUnitTest {

  @Test
  public void testCharacter(){
    assertEquals(true, CharacterSet.isDigit('9'));
    assertEquals(false, CharacterSet.isDigit('a'));
    
    assertEquals(true, CharacterSet.isBlank(' '));
    
    assertEquals(true, CharacterSet.isNewLine('\n'));
  }
}
