package library;

public class Box {
	/**
	 * 2. Используя за основу Expressive Coding, по названию переменной можно
	 * сказать, что она будет содержать в себе объекты чего-либо (пока непонятно
	 * чего, может быть что угодно: игра, машина, школа)
	 */
	private ThingInteface content;

	public Box() {
	}

	public Box(ThingInteface content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Box [content=" + content + "]";
	}

	public void setContent(ThingInteface content) {
		this.content = content;
	}

	public ThingInteface getContent() {
		return content;
	}

}