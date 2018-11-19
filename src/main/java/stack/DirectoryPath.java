package stack;

import java.util.Stack;

public class DirectoryPath {
    public String simplify(String path) {
        String[] tokens = path.split("/");
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.trim().length() == 0 || token.equals("."))
                continue;
            else if (token.equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else stack.push(token);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb = new StringBuilder("/").append(stack.pop()).append(sb);
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
