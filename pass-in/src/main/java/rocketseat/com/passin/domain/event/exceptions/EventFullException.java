package rocketseat.com.passin.domain.event.exceptions;

import rocketseat.com.passin.domain.event.Event;

public class EventFullException extends RuntimeException{
    public EventFullException(String message){
        super(message);
    }
}
