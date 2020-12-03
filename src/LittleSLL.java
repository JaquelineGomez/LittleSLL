public class LittleSLL
{
    //variables
    private Node head;

    //constructors
    public LittleSLL()
    {
        head = null;
    }//end head constructor

    public void addNodeToStart(int addData)
    {
        head = new Node(addData, head);
    }//end addNode

    public void deleteNodeFromStart()
    {
        if (head != null)
        {
            head = head.getLink();
        }//end if head not null
        else
        {
            System.out.println("Deleting from an empty list");
            System.exit(0);
        }//end else
    }//end deleteNode

    public int length()
    {
        int count = 0;
        Node position = head;
        while (position  != null)
        {
            count++;
            position = position.getLink();

        }//end while

        return count;
    }//end length method

    //hasNext
    public boolean hasNext()
    {
        Node position = head;
        if(position.getLink() != null)
        {
            return true;
        }
        return false;
    }//end method hasNext

    //setData
    public void setData(int oldData, int updateData)
    {
        Node position = head;
        while ( position != null)
        {
            if (position.getData() == oldData)
            {
                position.setData(updateData);
            }//end if
            position = position.getLink();
        }//end while loop
    }//end setData

    public void showList()
    {
        Node position =  head;
        while (position != null)
        {
            System.out.println(position.getData());
            position = position.getLink();
        }//end while loop

    }//end method to output list


    private class Node
    {
        //instance variables
        private int data;
        private Node link;

        //constructor
        public Node(int data, Node link)
        {
            this.data = data;
            this.link = link;
        }//end Node constructor


        /*----------getters and setters----------*/
        public int getData()
        {
            return data;
        }//end get data

        public Node getLink()
        {
            return link;
        }//end getLink

        public void setData(int data)
        {
            this.data = data;
        }//end setData

        //toString
        public String toString()
        {
            return "data: " + data + " links to: " + link;
        }//end toString

    }// end class Node

}//end public class