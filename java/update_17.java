class StackUsingArray
{
    int []StackArray;
    int top;
    int peek;
    private Boolean isEmty()
    {
        return top==-1; 
    }
    private Boolean isFull()
    {
        return top==maxSize-1;
    }
    
    public StackUsingArray(int Size)
    {
        StackArray=new int [Size]
        top=-1;
        maxSize=Size
    }
    public void push(int data)
    {
        if(isFull())
        {
            System.out.println("it is full");
        }
        else {
            StackArray[++top]=data;
            System.out.println("pushed");
        }
    }
    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("it is empty");
        }
        else
        {
            return StackArray[top--];
        }
    }
    public int peek()
    {
     return StackArray[top];   
    }
    public void display(){
        if (is Empty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            for(int i=0; i<=top;i++)
            {
                System.out.println(StackArray[i]," ");
            }
        }
    }
}
