
public class Stacks {



    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("ToyotaRAV4", 20691);
        Vehicle vehicle2 = new Vehicle("Toyota4Runner", 81883);
        Vehicle vehicle3 = new Vehicle("ToyotaCamry", 32667);

        Stack stack = new Stack();
        stack.push(vehicle1);
        stack.push(vehicle2);
        stack.push(vehicle3);

        Vehicle a = stack.pop();
        System.out.println(a + "is popped out from stack.");
        Vehicle b = stack.pop();
        System.out.println(b + "is popped out from stack.");
        Vehicle c = stack.pop();
        System.out.println(c + "is popped out from stack.");

    }


    static class Vehicle {
        String model;
        int miles;

        Vehicle(String model, int miles) {
            this.model = model;
            this.miles = miles;
        }


        public String toString() {
            return this.model + "-" + this.miles;
        }

    }

    static class Stack {
        StackNode root;

        boolean isEmpty() {
            return root == null;
        }
        static class StackNode {
            Vehicle data;
            StackNode next;

            StackNode(Vehicle data) {
                this.data = data;
            }

        }

        void push(Vehicle data) {
            StackNode newNode = new StackNode(data);
            if (root == null) {
                root = newNode;
            } else {
                StackNode temp = root;
                root = newNode;
                newNode.next = temp;
            }
            System.out.println(data + " pushed to stack");

        }

        Vehicle pop() {
            Vehicle popped = null;
            if (root == null) {
                System.out.println("Stack IS EMPTY");
            } else {
                popped = root.data;
                root = root.next;
            }
            return popped;
        }

        Vehicle peek() {
            if (root == null) {
                System.out.println("Stack is emptyy");
                return null;
            } else {
                return root.data;
            }
        }
    }


}

