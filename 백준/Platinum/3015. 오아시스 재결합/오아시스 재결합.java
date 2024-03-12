import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        long answer = 0;
        Stack<Person> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {

            int unitLength = scanner.nextInt();
            int count = 1;
            while (!stack.empty() && stack.peek().height <= unitLength) {
                Person person = stack.pop();
                if (person.height < unitLength) {
                    answer += person.count;
                } else if (person.height == unitLength) {
                    answer += person.count;
                    count = person.count + 1;
                }
            }

            if (!stack.empty()) {
                answer++;
            }

            stack.push(new Person(unitLength, count));
        }

        System.out.println(answer);

        scanner.close();
    }
}

class Person {
    int height;
    int count;

    public Person(int heigth, int count) {
        this.height = heigth;
        this.count = count;
    }
}