package hello;

import org.springframework.context.ApplicationEvent;

/**
 * Created by lichen@daojia.com on 2017-10-24.
 */
public class TradeEvent extends ApplicationEvent{

    public TradeEvent(String tradeEvent) {
        super(tradeEvent);
    }
}
