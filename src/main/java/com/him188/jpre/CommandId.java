package com.him188.jpre;

/**
 * @author Him188
 */
public enum CommandId {
	GET_GTK_BIN(1),
	GET_BKN32(2),
	GET_LDW(3),
	GET_RUN_PATH(4),
	GET_ONLINE_QQ_LIST(5),
	GET_QQ_LIST(6),
	GET_SESSION_KEY(7),
	GET_CLIENT_KEY(8),
	GET_LONG_CLIENT_KEY(9),
	GET_COOKIES(10),
	GET_PREFIX(11),
	CACHE_NAME_CARD(12),
	D_BAN(13),
	BAN(14),
	SHUT_UP(15),
	SET_NOTICE(16),
	GET_NOTICE(17),
	GET_NAME_CARD(18),
	SET_NAME_CARD(19),
	QUIT_DG(20),
	DEL_FRIEND(21),
	KICK(22),
	JOIN_GROUP(23),
	QUIT_GROUP(24),
	UPLOAD(25),
	GUID_GET_PIC_LINK(26),
	REPLY(27),
	SEND_MSG(28),
	SEND(29),
	OUTPUT(30),
	IS_ENABLE(31),
	LOGIN(32),
	LOGOUT(33),
	TEA_ENCODE(34),
	TEA_DECODE(35),
	GET_NICK(36),
	GET_QQ_LEVEL(37),
	GN_GET_GID(38),
	GID_GET_GN(39),
	GET_VERSION(40),
	GET_VERSION_NAME(41),
	GET_TIME_STAMP(42),
	GET_LOG(43),
	IF_BLOCK(44),
	GET_ADMIN_LIST(45),
	ADD_TAOTAO(46),
	GET_SIGN(47),
	SET_SIGN(48),
	GET_GROUP_LIST_A(49),
	GET_GROUP_LIST_B(50),
	GET_GROUP_MEMBER_A(51),
	GET_GROUP_MEMBER_B(52),
	GET_FRIEND_LIST(53),
	GET_QQ_AGE(54),
	GET_AGE(55),
	GET_EMAIL(56),
	GET_GENDER(57),
	SEND_TYPING(58),
	SEND_SHAKE(59),
	CRACK_IOS_QQ(60),
	GET_RANDOM_ONLINE_QQ(61),
	ADD_QQ(62),
	SET_OL_STATUS(63),
	GET_MC(64),//MACHINE CODE
	GROUP_INVITATION(65),
	CREATE_DG(66), //DISCUSS GROUP
	KICK_DG(67),
	DG_INVITATION(68),
	GET_DG_LIST(69),
	UPLOAD_VOICE(70),
	GUID_GET_VOICE_LINK(71),
	LIKE(72), //PAY ATTENTION TO SPEED
	;

	private final byte id;

	CommandId(int id) {
		this.id = (byte) id;
	}

	public byte getId() {
		return id;
	}
}
