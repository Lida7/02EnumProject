
public class Test {
	public static void main(String[] args) {
		// 第一种获取枚举值的方法
		Season[] seasions = Season.values();
		for (Season season : seasions) {
			System.out.println(season);
		}

		System.out.println("=========================");

		// 第二种获取枚举值方法
		System.out.println(Enum.valueOf(Season.class, "Summer"));

		System.out.println("=========================");

		System.out.println(Season2.Spring.i + " = " + Season2.Spring.name);
		System.out.println(Season2.Autumn.getMessage());
	}

	// 枚举类
	public enum Season {
		Spring, Summer, Autumn, Winter;
	}

	// 枚举类2
	public enum Season2 {
		Spring(1, "春天"), Summer(2, "夏天"), Autumn(3, "秋天"), Winter(4, "冬天");
		int i;
		String name;

		Season2(int i, String name) {
			this.i = i;
			this.name = name;
		}

		String getMessage() {
			return name;
		}
	}

}
