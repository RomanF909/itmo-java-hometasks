package ru.itmo.hometasks8;

public class PairContainer<K, V> {
    private K key;
    private V value;

    public void setKey(K key) {
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }
}
