/**
 * AdvancedArrayList.java
 * @author  Nolan Platt
 * Advanced implementation of Java's ArrayList with improvements and stability fixes. 
 */

package challenge3.imports;

import java.util.Arrays;

public class AdvancedArrayList <E> {
   
    private transient Object[] elementData; // Temporary (transient) array of objects of element data
    int initialCapacity; // Initial capacity of the data structure. I.e. number of "spots"
    int size; // Initial spots taken in the data structure. I.e. data is stored there - not empty.
   
    public AdvancedArrayList(int initialCapacity, int initialSize) { // Constructor - takes in initialCapacity and initialSize
        if(initialCapacity < 0) { // initialCapacity must be > 0
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity + " is not a valid capacity for AdvancedArrayList");
        }
        if (initialSize < 0) { // initialSize must be > 0
            throw new IllegalArgumentException("Illegal Size: " + initialSize + " is not a valid size for AdvancedArrayList");
        }
        size = initialSize;
        this.initialCapacity = initialCapacity;
        elementData = new Object[initialCapacity];
    }
    private void allocateCapacity() { // Used whenever we are modifying (adding or deleting) to the AAL's length - need to ensure capacity is in check
		int newCapacity = elementData.length + (elementData.length >> 1);
		elementData = Arrays.copyOf(elementData, newCapacity);
	}

    public int size() {
        return size;
    }


    public String add (E object) {
        if(size == elementData.length)
            allocateCapacity();
        elementData[size++] = object;
        return "Successfully added object:  " + object + " with new size: " + size;
    } 

    public E get (int index) {
        if(index > size || index < 0)
            throw new IndexOutOfBoundsException("Size must be > 0 and less than the size of the AAL.");
        return (E) elementData[index];
    }

    public E remove (int index) {
        if(index > size || index < 0)
            throw new IndexOutOfBoundsException("Size must be > 0 and less than the size of the AAL.");
    
        E val = (E) elementData[index];

        for(int i = index; i < size; i ++) {
            elementData[i] = elementData[i + 1];
        }
        // -- >
            size--;
        return val;
    }

    public E peek () {
        E val = (E) elementData[0];
        return val;
    }
  
}
