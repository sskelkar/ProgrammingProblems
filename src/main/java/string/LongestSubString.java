package string;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.valueOf;

public class LongestSubString {
  public int withoutRepeat(String str) {
    Map<String, Integer> charToIndex = new HashMap<>();
    int maxLength = 0;
    int start = 0;
    int i = 0;
    for (; i < str.length(); i++) {
      Integer prevIndex = charToIndex.get(valueOf(str.charAt(i)));
      if (prevIndex != null && prevIndex >= start) {
        if ((i - start) > maxLength)
          maxLength = i - start;
        start = prevIndex + 1;
      }
      charToIndex.put(valueOf(str.charAt(i)), i);
    }
    if ((i - start) > maxLength)
      maxLength = i - start;
    return maxLength;
  }
}
