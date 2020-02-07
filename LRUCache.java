/*
 * Copyright 2019 Mobile Iron, Inc.
 * All rights reserved.
 */
package problems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 
 */
public class LRUCache<K, V> {

    int capacity;
    Map<K,LRUCacheElement<K, V>> map; 
    LRUCacheElement <K ,V> head, tail;
    
    public LRUCache(int lSize) {
        capacity = lSize;
        map = new HashMap<K, LRUCacheElement<K,V>>(capacity);
        
    }

    public V get(K key){
        LRUCacheElement<K,V> element = map.get(key);
        if(element != null){
            removeElement(element);
            addElement(element);
            return element.value;
        }
        else {
            return null;
        }
        
    }
    
    public void put(K key, V value){
        if(!map.containsKey(key)){
            //check if cache already its capacity
            if(map.size() >= capacity){
                map.remove(head.key);
                removeElement(head);
            }
            //add new elements from cache and queue
            LRUCacheElement<K, V> newElement = new LRUCacheElement<K, V>(key, value);
            addElement(newElement);
            map.put(key,newElement);
        }
        //map already had the element.
        else{
            //get and update value for the existing element
            LRUCacheElement<K, V> existingElement = map.get(key);
            existingElement.value = value;
            //remove from current position and add it to back of queue.
            removeElement(existingElement);
            addElement(existingElement);
        }
    }
    
    /**
     * 
     */
    private void addElement(LRUCache<K, V>.LRUCacheElement<K, V> element) {
        //add the new element to tail
        if(tail != null){
            tail.next = element;
        }
        element.previous = tail;
        element.next = null;
        tail = element;
        if(head == null){
            head = tail;
        }
    }

    /**
     * 
     */
    private void removeElement(LRUCache<K, V>.LRUCacheElement<K, V> existingElement) {
        //if the current element is head
        if(existingElement.previous == null){
            //set the new head.
            head = existingElement.next;
        }
        else{
            //link previous and next element.
            existingElement.previous.next = existingElement.next;
        }
        // means the current element is tail
        if(existingElement.next == null){
            tail = existingElement.previous;
        }
        else{
            //otherwise link its next and previous
            existingElement.next.previous = existingElement.previous;
        }
    }

    public void print(){
        System.out.println("Cache:"+map);
        System.out.println("Queue:");
        LRUCacheElement current = head;
        while(current != null){
            System.out.println("k:"+current.key+":v:"+current.value);
            current = current.next;
        }
    }
    class LRUCacheElement <T , U> {
        T key;
        U value;
        LRUCacheElement next;
        LRUCacheElement previous;
        
        LRUCacheElement(T k, U v){
            key = k;
            value = v;
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        cache.put(1, "One");
        cache.put(2, "two");
        cache.put(3, "three");
        cache.print();
        System.out.println(cache.get(2));
        cache.print();
        cache.put(4, "four");
        cache.print();
        cache.put(2, "two again");
        cache.print();
    }
}
