package Chat;

public class ChatText extends Chat{

	public ChatText(String message) {
		super(message);
	}

	@Override
	public boolean showMessage() {
		System.out.println(super.message);
		return false;
	}

}
