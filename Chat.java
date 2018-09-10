package Chat;

public abstract class Chat {
	protected String message;
	public Chat(String message) {
		this.message = message;
	}
	
	public Chat() {
	}

	public abstract boolean showMessage();
}
