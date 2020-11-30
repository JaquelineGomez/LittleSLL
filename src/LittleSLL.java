public class LittleSLL
{
    //variables
    private Node head;

    //constructor
    public LittleSLL()
    {
        head=null;
    }

    //to populate list
    public void addNodeToStart(int addData)
    {
        head =new Node(addData,head);
    }

    public void deleteNodeFromStart()
    {
        if(head!=null)
        {
            head=head.getLink();
        }
        else
        {
            System.out.println("Delete from an empty list?");
            System.exit(0);
        }
    }

    public boolean hasNext()
    {
        Node position=head;
        if(position.getLink()!=null)
        {
            return true;
        }
        return  false;
    }//end method hasNext

    public int length()
    {
        int count=0;
        Node position=head;
        while(position!=null)
        {
            count++;
            position = position.getLink();
        }
        return count;

    }
    //to display list
    public void showList()
    {
        Node position=head;
        while(position !=null)
        {
            System.out.println(position.getData());
            position= position.getLink();
        }
    }
    private class Node
    {
        //instance variable
        private int data;
        private Node link;//instance of a self-refrencing class
        //constructors
        public Node(int data, Node link)
        {
            this.data=data;
            this.link=link;
        }//end of constructor

        //getters & setters

        public int getData() {
            return data;
        }

        public Node getLink() {
            return link;
        }

        //toString
        @Override
        public String toString() {
            return "data: " + data + " link to:  "+ link ;
        }
    }
}
