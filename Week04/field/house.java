package field;

public class house {
	String kind;
	int room;
	int toilet;
	boolean ground;
	house(String kind) {
		this(kind,3,2,false);
	}
	house(String kind, int room) {
		this(kind,room,2,false);
	}
	house(String kind, int room, int toilet) {
		this(kind,room,toilet,false);
	}
	house(String kind, int room, int toilet, boolean ground) {
		this.kind = kind;
		this.room = room;
		this.toilet = toilet;
		this.ground = ground;
	}

}
