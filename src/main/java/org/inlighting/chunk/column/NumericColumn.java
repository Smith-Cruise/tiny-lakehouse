package org.inlighting.chunk.column;

import java.util.ArrayList;

public class NumericColumn<T> implements Column<T> {
    private final ArrayList<T> data;

    public NumericColumn(int reserveSize) {
        data = new ArrayList<>(reserveSize);
    }

    public boolean add(T a) {
        return data.add(a);
    }

    public T get(int index) {
        return data.get(index);
    }

    public int size() {
        return data.size();
    }
}
