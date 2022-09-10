public class List {
    private Node head,tails;
    private int size;

    public List(){
        head = tails = null;
        size = 0;
    }

    public void AddAtTail(String data){
        Node node = new Node(data);
        if(tails == null) head = node;
        else
        {
            node.previous = tails;
            tails.next = node;
            tails = node;
        }
        tails = node;
        size++;
    }
    public void addAtFront(String data){
        Node node = new Node(data);
        if(head == null) tails = node;
        else {
            node.next = head;
            head = node;
        }
        head = node;
        size++;
    }
    public void Remove(int index) {
        int coun = 0;
        if (head != null) {
            Node aux;
            Node ant = null;
            aux = head;
            while (aux != null && coun != index) {
                ant = aux;
                aux = aux.next;
                coun++;
            }
            if (aux == null) {
                System.out.println("No encontrado");
            } else if (ant == null) {
                head = aux.next;
                size--;
            } else {
                ant.next = aux.next;
                size--;
            }
        }

    }


    public void RemoveAll()
    {
        while(head!=null){
            head=head.next;
        }
        size=0;
    }

    public void SetAt(int index,String data)
    {
        Node node=head;
        int coun=0;
        while (node != null && coun != index)
        {
            node= node.next;
            coun++;
        }
        if(node !=null) {
          node.setData(data);
        }
    }

    public String GetAt(int index){
    Node node=head;
    int coun=0;
        while (node != null && coun != index) {
            node= node.next;
            coun++;
        }
        if(node !=null){
            String s= node.GetDataNode();
            return String.valueOf(s);
        }
        return null;
    }

    public void RemoveAllWithValue(String data){
        Node node = head;
        while (node != null)
        {
           if(node.GetDataNode()==data)
           {
               size--;
               Node aux1,aux2;
               aux1=node.previous;
               aux2=node.next;
               if(aux1 != null)
               {
                    aux1.next=aux2;
               }
               else//elimina el primero
               {
                    head=aux2;
               }
               if(aux2 !=null)
               {
                   aux2.previous= aux1;
               }
               else
               {
                   tails= aux1;
               }

    }
           node=node.next;
    }
    }
    public int getSize() {
        return size;
    }
    public ListIterator GetIterator(){
        return new ListIterator(head);
    }
}
