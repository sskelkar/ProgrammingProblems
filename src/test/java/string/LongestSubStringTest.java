package string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubStringTest {

  @Test
  public void longestSubStringWithoutRepetition() {
    assertEquals(3, new LongestSubString().withoutRepeat("abcabcbb"));
    assertEquals(1, new LongestSubString().withoutRepeat("bbbb"));
    assertEquals(3, new LongestSubString().withoutRepeat("pwwkew"));
    assertEquals(7, new LongestSubString().withoutRepeat("aujekfo"));
    assertEquals(0, new LongestSubString().withoutRepeat(""));
    assertEquals(2, new LongestSubString().withoutRepeat("abba"));
  }
}