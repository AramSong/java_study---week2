package Chat;

public class ChatEmot extends Chat{
	protected String type;
	
	public ChatEmot(String message) {
		super(message);
		this.type = " ";
	}
	public ChatEmot(int type) {
		super.message = "";
		//1 = :D , 2 = XD , 3 = :P
		switch(type) {
			case 1: this.type = ":D";
					break;
			case 2: this.type = "XD";
					break;
			case 3: this.type = ":P";
					break;
			default:this.type = " ";
					break;
		
		}
	}
	public ChatEmot(String message,int type) {
		super(message);
		//1 = :D , 2 = XD , 3 = :P
		switch(type) {
		case 1: this.type = ":D";
				break;
		case 2: this.type = "XD";
				break;
		case 3: this.type = ":P";
				break;
		default:this.type = " ";
				break;
	
	}
	
	}

	@Override
	public boolean showMessage() {
		// TODO Auto-generated method stub
		System.out.println("[" + this.type+ "]" + super.message);
		return true;
	}

}
