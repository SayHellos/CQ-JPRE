package com.him188.jpre.event.friend;

import com.him188.jpre.RobotQQ;
import com.him188.jpre.event.Event;

abstract public class FriendEvent extends Event {
	abstract public RobotQQ getRobot();

	abstract public long getQQ();
}