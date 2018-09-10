package Chat;

public class ChatColorText extends Chat{

	protected String type;
	
	public ChatColorText(String message) {
		super(message);
	}
	
	public ChatColorText(String message,int type) {
		super(message);
		//1 - »¡°­ ,2 - ÆÄ¶û , 3 - ÃÊ·Ï
		switch(type) {
			case 1: 
				this.type = "»¡°­";
				break;
			case 2:
				this.type = "ÆÄ¶û";
				break;
			case 3:
				this.type = "ÃÊ·Ï";
				break;
			default:
				this.type = "null";
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
