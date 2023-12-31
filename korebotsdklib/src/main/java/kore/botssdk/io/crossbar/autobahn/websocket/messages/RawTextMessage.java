package kore.botssdk.io.crossbar.autobahn.websocket.messages;

/// WebSockets raw (UTF-8) text message to send or received.
public class RawTextMessage extends Message {

    public final byte[] mPayload;

    public RawTextMessage(byte[] payload) {
        mPayload = payload;
    }
}
