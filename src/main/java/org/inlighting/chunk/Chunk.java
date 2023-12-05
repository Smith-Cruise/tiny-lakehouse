package org.inlighting.chunk;

import org.inlighting.chunk.column.Column;

import java.util.ArrayList;
import java.util.List;

public class Chunk {
    private List<Column<?>> columns = new ArrayList<>();

    void addColumn(Column<?> column) {
        columns.add(column);
    }
}
