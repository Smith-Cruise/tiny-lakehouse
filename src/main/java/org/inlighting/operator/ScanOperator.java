package org.inlighting.operator;

import org.inlighting.Constants;
import org.inlighting.chunk.Chunk;
import org.inlighting.chunk.TableGenerator;

import java.util.Optional;

public class ScanOperator implements Operator {

    private TableGenerator tableGenerator = null;

    public void addInput(TableGenerator tableGenerator) {
        this.tableGenerator = tableGenerator;
    }

    @Override
    public Optional<Chunk> getChunk() {
        return tableGenerator.getChunk(Constants.CHUNK_SIZE);
    }

    @Override
    public boolean isFinished() {
        return tableGenerator.isFinished();
    }

    // volcano
    @Override
    public Optional<Chunk> getNext(int numRows) {
        return tableGenerator.getChunk(numRows);
    }
}
