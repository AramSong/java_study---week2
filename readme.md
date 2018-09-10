## 2주차

* 생성자 : new를 했을 때 , 인자값을 넣어서 초기값을 세팅할 수 있음. 플레이어의 이름을 정할 수 있음.

  ex) Player com = new Player("컴퓨터");

* 생성자 (constructor)?

   초기화를 위해서. 객체를 생성할 때 호출.

  <생성자의 특징> 

  1.  **값을 반환하지 않는다.**

     생성자는 인스턴스를 생성해주는 역할을 하는 특수한 메소드라고 할 수 있다. 그런데 반환값이 있다면 엉뚱한 객체가 생성될 것이다. 따라서 반환값을 필요로하는 작업에서는 생성자를 사용하지 않는다. 반환 값이 없기 때문에 return도 사용하지 않고, 반환값을 메소드 정의에 포함시키지도 않는다.

  2. **생성자의 이름은 클래스의 이름과 동일하다.**

     자바에서 클래스의 이름과 동일한 메소드는 생성자로 사용하기로 약속되어 있다.

------

1. **상속**

   어떤 객체가 있을 때 그 객체의 필드(변수)와 메소드를 다를 객체가 물려받을 수 있는 기능을 상속. 

   > 부모클래스와 자식클래스의 관계를 상위(super)클래스와 하위(sub)클래스라고 표현하기도 한다. 또한 기초 클래스(base class), 유도 클래스(derived class)라고도 부른다.

   상속을 통해서 코드의 중복을 제거할 수 잇고, 또 부모 클래스를 개선할 경우 자식 클래스들도 자동으로 개선이 된다.  다시 말해 유지보수가 편리해진다.

2. **오버로딩(Overloading)**  :  재정의.이름은 같지만 시그니처(메소드 이름, 매개변수 숫자,데이터타입, 순서, 메소드의 리턴타입)는 다른 메소드를 중복으로 선언할 수 있는 방법. 

3. **오버라이딩(Overriding)** : 하위클래스가 부모클래스의 기본적인 동작방법을 변경할 수 있다. 하위 클래스에서 상위 클래스와 동일한 메소드를 정의하면 부모 클래스에서 물려받은 기본 동작 방법을 변경하는 효과를 갖게 된다. 기본동작은 폭넓게 적용되고, 예외적인 동작은 더 높은 우선순위를 갖는다.

    < 오버라이딩 조건>

    * 메소드의 이름

    * 메소드 매개변수의 숫자와 데이터 타입,순서

    * 메소드의 리턴타입

      이 같아야 한다.

4. **abstract 추상클래스**: 무조건 재정의(override)가 필요한 클래스. 부모클래스가 아닌 자식 클래스에서 메소드를  정의할 수 있음.  구체적 사물들의 공통된 특징을 파악하여 인식의 대상으로 삼는다. 즉, 공통된 특징을 뽑아내어 하나의 집합으로 만들어 내는 것.

    추상클래스는 반드시 하나 이상의 추상메소드를 가지며, 객체를 생성할 수 없다.

    ​	-  공통된 기능을 찾는다.(학생, 학부, 조교(일반조교,학부생조교)...etc)

    ​	-  캡슐화 

5. **super**

   상위 클래스를 가리키는 키워드. 부모클래스를 의미한다.  super()는 부모클래스의 생성자를 의미.  하위클래스의 생성자에서 super를 사용할 때는 super가 가장 먼저 나타나야한다. 즉, 부모가 초기화되기 전에 자식이 초기화 되는 일을 방지하기 위해 꼭 필요.

6. **자바의 리스트형(List)**

    - add() : 값 추가
    - get() : 값 불러오기
    - remove() : 값 삭제
       - remove(Object element) : 동일한 오브젝트를 인수로 넘기면 검색해서 삭제. 리턴값은 삭제결과가 성공인지 실패인지( list.remove("홍길동"))
       - remove(int index) : 인덱스를 이용해서 삭제, 어떤 데이터를 삭제했는지 리턴값으로 알려줌(list.remove("0"))
   - contains() : 리스트안에 있는 데이터 중 찾고자 하는 값이 존재하는지 확인할 수 있는 함수.

   [출처 : https://opentutorials.org/module/516/5519]

**[문제]** 

**부모클래스 : Chat(추상클래스로 . abstract class)**

**자식클래스 : ChatText/ChatEmot/ChatColorText**

**메인 : Main**

```java
public abstract class Chat{
    protected String message;
    public Chat(String message){
        this.message = message;
    }
	public abstract void showMessage();
}
```



```java
public class Main{
	public static void main(String[] args){
		List<Chat> chatList = new ArrayList<Chat>();
        chatList.add(new ChatColorText("채팅 텍스트입니다.",1));
        //컬러텍스트는 생성자에서 인자값을 하나 더받아서
        //1 = 빨강, 2 = 파랑 , 3 = 초록
        //출력값 : [빨강] 채팅텍스트입니다.
        chatList.add(new ChatText("일반 채팅입니다."));
        chatList.add(new ChatEmot(1));
        chatList.add(new ChatEmot("이모티콘 채팅입니다."),1);
        //1 = :D , 2 = XD , 3 = :p
        /*
        	null일 경우, 출력값 = [:D]
        	null이 아닐 경우, 출력값 = [:D]이모티콘 채팅입니다. 
        */
        
        chatList.add(new ChatColorText("채팅 텍스트입니다."));
        for(int i = 0; i < chatList.size; i++){
             chatList.get(i).showMessage();
        }
       
    }
}
```

```java
public ChatEmot(int type){
    
}
public ChatEmot(String message, int type){
    
}ㄴ
```