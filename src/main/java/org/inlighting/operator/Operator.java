package org.inlighting.operator;

import org.inlighting.chunk.Chunk;
import org.inlighting.chunk.TableGenerator;

import java.util.Optional;

public interface Operator {

    default void pushChunk() {}

    default void addInput(TableGenerator tableGenerator) {
    }

    default Optional<Chunk> getChunk() {
        return Optional.empty();
    }

    default boolean isFinished() {
        return true;
    }

    // volcano
    default Optional<Chunk> getNext(int numRows) {
        return Optional.empty();
    }
}
