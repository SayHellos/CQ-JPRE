package com.him188.jpre.log.logger;

import com.him188.jpre.log.Log;
import com.him188.jpre.log.Priority;
import com.him188.jpre.network.ConnectedClient;
import com.him188.jpre.network.NetworkPacketHandler;
import com.him188.jpre.network.packet.LogPacket;

/**
 * 插件日志记录器. (记录到MPQ的插件自带日志中)
 */
public class PluginLogger implements Logger {
	public void log(int priority, String type, String message) {
		log(Priority.fromInteger(priority), type, message);
	}

	public void log(Priority priority, String type, String message) {
		log(new Log(priority, type, message));
	}

	public void log(Log log) {
		for (ConnectedClient connectedClient : NetworkPacketHandler.getClients()) {
			connectedClient.sendPacket(new LogPacket(log.toString()));
		}
	}

	@Override
	public void info(String type, String message) {
		log(Priority.INFO, type, message);
	}

	@Override
	public void error(String type, String message) {
		log(Priority.ERROR, type, message);
	}

	@Override
	public void debug(String type, String message) {
		log(Priority.DEBUG, type, message);
	}

	@Override
	public void notice(String type, String message) {
		log(Priority.NOTICE, type, message);
	}

	@Override
	public void warning(String type, String message) {
		log(Priority.WARNING, type, message);
	}

	@Override
	public void fatal(String type, String message) {
		log(Priority.FATAL, type, message);
	}

	public void exception(Throwable e) {
		e.printStackTrace();
		fatal("Exception", e.toString());
	}
}