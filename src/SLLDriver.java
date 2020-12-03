public class SLLDriver
{
    public static void main(String[] args)
    {
        LittleSLL mySLL= new LittleSLL();
        mySLL.addNodeToStart(25);
        mySLL.addNodeToStart(38);
        mySLL.addNodeToStart(-45);
        mySLL.addNodeToStart(5);
        mySLL.addNodeToStart(7);
        mySLL.addNodeToStart(8);
        mySLL.addNodeToStart(9);
        mySLL.addNodeToStart(10);
        
        mySLL.showList();
        System.out.println("The list length is: "+ mySLL.length());

        mySLL.deleteNodeFromStart();
        mySLL.showList();
        System.out.println("The list length is now: "+ mySLL.length());
        
        mySLL.setData(8,22);
        mySLL.showList();
    }//end main method
}//end SLLDriver
