
public class Homework08 {
	public static void main(String[] args) {

		Music song = new Music("水星记", 200);
		song.play();
		System.out.println(song.getInfo());

	}
}


class Music {
	String name;
	int times;

	public Music(String name, int times) {
		this.name = name;
		this.times = times;
	}

	public void play() {
		System.out.println("播放音乐" + name);
	}

	public String getInfo() {
		return "播放音乐" + name + times + "秒";
	}
}