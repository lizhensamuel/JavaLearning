package swing.Listener.listener_principle;

/*
 * 事件
 */
public interface IEvent {

    void setEventListener(swing.Listener.listener_principle.IEventListener arg);

    boolean ClickButton();

    boolean MoveMouse();

}
