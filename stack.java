class Stack
{
    Stack(int size)
    {
        arrStack = new int[size];
        pos = -1;
    }

    void push(int item)
    {
        if (pos == arrStack.length - 1)
            System.out.println("Stack is full!");
        else
            arrStack[++pos] = item;
    }

    int pop()
    {
        if (pos < 0)
        {
            System.out.println("Stack is empty!");
            return 0;
        }
        else
            return arrStack[pos--];
    }

    private int arrStack[];
    private int pos;
}

/* Example
 * int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
 * Stack st = new Stack(arr.length);

 * for (int x : arr)
 * {
 *		st.push(x);
 * }

 * for (int x : arr)
 *		System.out.println(st.pop());
 *
*/
