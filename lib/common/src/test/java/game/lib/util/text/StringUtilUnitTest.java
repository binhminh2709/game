package game.lib.util.text;

import junit.framework.Assert;

import org.junit.Test;

import com.game.util.text.StringUtil;


public class StringUtilUnitTest {

  @Test
  public void testString(){
    // so sanh giá trị chuỗi s1 so với s2, lấy giá s1 < s2 return -1, s1 = s2 return 0, s1 > s2 return 1 
    Assert.assertEquals(1, StringUtil.compare("12", "11"));
  }
}
