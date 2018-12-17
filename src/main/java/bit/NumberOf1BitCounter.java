package bit;

public class NumberOf1BitCounter {
  public int count(long num) {
    int count = 0;
    while (num > 0) {
      count += num & 1;
      num = num >> 1;
    }
    return count;
  }
}
