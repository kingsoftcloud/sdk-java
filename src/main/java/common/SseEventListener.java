package common;

/** Receives one raw SSE event. Return false to close the connection. */
@FunctionalInterface
public interface SseEventListener {
    boolean onEvent(String event) throws Exception;
}
