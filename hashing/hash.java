// package hashing;

// import java.util.*;

// class myhash {
// static int bucket;
// LinkedList<Integer>[] table;

// myhash(int b) {
// bucket = b;
// table = new LinkedList<Integer>[bucket];
// }

// public static void main(String[] args) {
// myhash key = null;
// insert(new myhash(10));
// search(key);
// delete(key);

// }

// static void search(int key) {
// int load = hashload(key);
// // for(traverse the array of link list)
// if (load == key)
// return true;
// return false;
// }

// static void insert(int key) {

// int load = hashload(key);
// table(load).add(key);
// }

// static void delete(int key) {
// int load = hashload(key);
// table(load).remove(key);
// }

// static int hashload(int key) {
// int load = key / bucket;
// return load;
// }

// }