package vn.vnpay.rabbitmq.common;

public class CommonConstant {

    public static final String X_MATCH = "x-match";
    public static final String X_DEAD_LETTER_EXCHANGE = "x-dead-letter-exchange";
    public static final String X_DEAD_LETTER_ROUTING_KEY = "x-dead-letter-routing-key";
    public static final String X_MESSAGE_TTL = "x-message-ttl";

    private CommonConstant() {
    }
}
