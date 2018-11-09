package numbers;

public class IntegerReverser {
    public int reverse(int num) {
        StringBuilder sb = new StringBuilder();
        if(num < 0) {
            sb.append("-");
            num = Math.abs(num);
        }
        while(num > 0) {
            sb.append(num%10);
            num = num/10;
        }
        Integer res = 0;
        try {
            res = Integer.valueOf(sb.toString());
        } catch (Exception e){}
        return res;
    }
}
