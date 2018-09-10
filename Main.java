package Chat;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Chat> chatList = new ArrayList<Chat>();
		
		/* ChatColorText
		 * 1 : 빨강, 2 : 파랑, 3 : 초록
		 */
		chatList.add(new ChatColorText("채팅 텍스트입니다.",1));
		chatList.add(new ChatColorText("채팅 텍스트입니다.",2));
		 
		/*ChatText
		 *일반 채팅 
		 */
		chatList.add(new ChatText("일반 채팅입니다."));
	
		/* ChatEmot
		 * 1 = :D , 2 = XD , 3 = :P
		 */
		chatList.add(new ChatEmot(1));
		chatList.add(new ChatEmot("이모티콘 채팅입니다",1));
		chatList.add(new ChatEmot("이모티콘 채팅입니다",2));
		chatList.add(new ChatEmot("이모티콘 채팅입니다",3));
		chatList.add(new ChatEmot("이모티콘 채팅입니다"));
		
		//chatList 출력
		for(int i = 0; i < chatList.size(); i++) {
			chatList.get(i).showMessage();
		}
		
		
	}
}
