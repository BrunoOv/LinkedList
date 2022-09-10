public class Main {
    public  static void main(String[] args){
        List list = new List();
        System.out.println("Add");
        list.AddAtTail("Cosa1");
        list.AddAtTail("Cosa2");
        list.AddAtTail("Cosa3");
        list.addAtFront("Cosa3");
        System.out.println(list.getSize());
        ListIterator Iterator = list.GetIterator();
        while(Iterator.HasNext()){
            System.out.println(Iterator.Next());
        }
        list.Remove(1);
        list.SetAt(1,"Remplazo");
        list.RemoveAllWithValue("Cosa3");
        Iterator = list.GetIterator();
        while(Iterator.HasNext()){
            System.out.println(Iterator.Next());
        }
        System.out.println(list.getSize());
        System.out.println("Add");
        list.AddAtTail("Cosa1");
        list.AddAtTail("Cosa2");
        list.AddAtTail("Cosa3");
        list.addAtFront("Cosa3");
        Iterator = list.GetIterator();
        while(Iterator.HasNext()){
            System.out.println(Iterator.Next());
        }
        System.out.println(list.getSize());
        list.RemoveAll();
        System.out.println(list.getSize());
        Iterator = list.GetIterator();
        while(Iterator.HasNext()){
            System.out.println(Iterator.Next());
        }
    }
}
