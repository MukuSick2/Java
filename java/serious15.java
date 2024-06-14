// MAP INTERFACE //
//syntax -> interface Map<K,V>

//exceptions:
//1. ClassCastException: jab object incompatible ho
//2. PointerException: cant store null value
//3. UnsupportedOperationException: kisi class ki keys ko change karne ka try kiya buf allowed nhi hai.
//4. IllegalArgumentException: kuch galat format daal diya subset ko access karte time.

//basic operations:
//get()
//put()
//agar iterables use karne ho toh pehle map ko se mai convert karna padega.
// entryset():return a set that contains the elements in the map
// Keyset(): return set of key values./ collection view of keyset.
// values(): to obtain the collection view of values.

// collection view : all that means by which maps can be integrated in larger collection frameworks.

// sorted map interface:
//1. it ensures that the collectiond are maintained in ascending order.
//2. syntax: interface sortedMap<K,V>
//3. exceptions :
    // NoSuchElementException
    // ClassCastException
    // NullPointerException
    // IllegalArgumentException

// navigablemap interface:
// it extends the sortedmap interface and supports the retrieval of entries based on the closest match to a given key or keys.
// syntax: NavigableMap<K,V>
// exceptions:
// ClassCastException
// NullPointerException
// IllegalArgumentException

// hashmap class:
// extends the Abstract class and implements Map interface.
// use the hash tables to store hash maps.
// executes time for get() and put() remains const.
// Clas HashMap<K,V>

// constructors:
//1. HashMap()
//2. HashMap(Map<? extends K, ? extends V>)
//3. HashMap(int capacity)
//4. HashMap(int capacity , floatRatio)

