
public class ListIterator {
    Node node;
    public ListIterator(Node node){
        this.node = node;
    }
    public boolean HasNext(){
        return node != null;
    }
    public String Next(){
        String dato = node.GetDataNode();
        node = node.next;
        return dato;
    }
}
