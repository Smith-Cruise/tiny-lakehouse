package org.inlighting.chunk;

import org.inlighting.chunk.column.Column;
import org.inlighting.chunk.column.NumericColumn;

import java.util.Optional;

public class TableGenerator {
    private final int columnSize;
    private final int totalRowSize;

    private int cursor = 0;

    public TableGenerator(int columnSize, int totalRowSize) {
        this.columnSize = columnSize;
        this.totalRowSize = totalRowSize;
    }

    public Optional<Chunk> getChunk(int maxChunkSize) {
        if (cursor >= totalRowSize) {
            return Optional.empty();
        }

        int rowSize = Math.min(totalRowSize - cursor, maxChunkSize);

        Chunk chunk = new Chunk();
        for(int i = 0; i < columnSize; i++) {
            Column<Integer> column = new NumericColumn<>(maxChunkSize);
            for (int k = 0; k < rowSize; k++) {
                column.add(k+i);
            }
        }
        cursor += rowSize;
        return Optional.of(chunk);
    }

    public boolean isFinished() {
        return cursor >= totalRowSize;
    }
}
