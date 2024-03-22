import java.util.*;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        List<Block> blocks = new ArrayList<>();
        Stack<Block> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        for (int i = 0; i < length; i++) {
            Integer height = scanner.nextInt();
            blocks.add(new Block(0, 0, height));
        }

        for (int i = 0; i < blocks.size(); i++) {
            Block block = blocks.get(i);
            while(!stack.empty() && stack.peek().height >= block.height) {
                Block pop = stack.pop();
                block.leftCount = block.leftCount + pop.leftCount + 1;
            }
            stack.push(block);
        }

        stack = new Stack<>();

        for (int i = blocks.size() - 1; i >= 0; i--) {
            Block block = blocks.get(i);
            while(!stack.empty() && stack.peek().height >= block.height) {
                Block pop = stack.pop();
                block.rightCount = block.rightCount + pop.rightCount + 1;
            }
            stack.push(block);
        }

        for (int i = 0; i < blocks.size(); i++) {
            Block block = blocks.get(i);
            answer = Math.max(answer, (block.leftCount + 1 + block.rightCount) * block.height);
        }

        System.out.println(answer);

        scanner.close();
    }
}

class Block {
    Integer leftCount;
    Integer rightCount;
    Integer height;

    public Block(Integer leftCount, Integer rightCount, Integer height) {
        this.leftCount = leftCount;
        this.rightCount = rightCount;
        this.height = height;
    }
}