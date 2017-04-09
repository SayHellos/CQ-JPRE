package com.him188.jpre.event.message;

import com.him188.jpre.RobotQQ;
import com.him188.jpre.event.Event;

/**
 * 消息事件
 *
 * @author Him188
 */
abstract public class MessageEvent extends Event {
	abstract public RobotQQ getRobot();

	abstract public long getQQ();

	abstract public String getMessage();

	//abstract public void setMessage(String message);

	abstract public String getRepeat();

	abstract public void setRepeat(String repeat);

}
