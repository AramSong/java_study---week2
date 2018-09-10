package Chat;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Chat> chatList = new ArrayList<Chat>();
		
		/* ChatColorText
		 * 1 : ����, 2 : �Ķ�, 3 : �ʷ�
		 */
		chatList.add(new ChatColorText("ä�� �ؽ�Ʈ�Դϴ�.",1));
		chatList.add(new ChatColorText("ä�� �ؽ�Ʈ�Դϴ�.",2));
		 
		/*ChatText
		 *�Ϲ� ä�� 
		 */
		chatList.add(new ChatText("�Ϲ� ä���Դϴ�."));
	
		/* ChatEmot
		 * 1 = :D , 2 = XD , 3 = :P
		 */
		chatList.add(new ChatEmot(1));
		chatList.add(new ChatEmot("�̸�Ƽ�� ä���Դϴ�",1));
		chatList.add(new ChatEmot("�̸�Ƽ�� ä���Դϴ�",2));
		chatList.add(new ChatEmot("�̸�Ƽ�� ä���Դϴ�",3));
		chatList.add(new ChatEmot("�̸�Ƽ�� ä���Դϴ�"));
		
		//chatList ���
		for(int i = 0; i < chatList.size(); i++) {
			chatList.get(i).showMessage();
		}
		
		
	}
}
