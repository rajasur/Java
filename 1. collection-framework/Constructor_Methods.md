```java
interface Collection {
    boolean add(Object obj);
    boolean addAll(Collection c);

    boolean remove(Object obj);
    boolean removeAll(Collection c);

    void clear();
    boolean contains(Object obj);
    boolean containsAll(Collection c);

    boolean isEmpty();
    int size();

    Iterator iterator();
    // ... Other methods
}

interface List extends Collection
{
    //contains Collection interface methods
    void add(int index, Object obj);
    void addAll(int index, Collection c);
    
    Object get(int index);
    Object remove(int index);
    
    Object set(int index, Object newobj);
    
    int indexOf(Object obj);
    int lastIndexOf(Object obj);
    //...Othrts methods
}

class LinkedList implements List, Deque
{
    // contains Collection, List and Deque methods
    void addFirst(Object obj);
    void addLast(Object Obj);
    
    Object getFirst();
    Object getLast();
    
    Object removeFirst();
    Object removeLast();
    
   //...Others methods
}