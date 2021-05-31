package swing.Listener.listener_principle;

import swing.Listener.listener_principle.IEvent;

/*
 * 事件监听器，调用事件处理器
 */
public interface IEventListener {

    void doEvent(IEvent arg);
}