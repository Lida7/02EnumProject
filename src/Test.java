
public class Test {
	public static void main(String[] args) {
		// ��һ�ֻ�ȡö��ֵ�ķ���
		Season[] seasions = Season.values();
		for (Season season : seasions) {
			System.out.println(season);
		}

		System.out.println("=========================");

		// �ڶ��ֻ�ȡö��ֵ����
		System.out.println(Enum.valueOf(Season.class, "Summer"));

		System.out.println("=========================");

		System.out.println(Season2.Spring.i + " = " + Season2.Spring.name);
		System.out.println(Season2.Autumn.getMessage());
	}

	// ö����
	public enum Season {
		Spring, Summer, Autumn, Winter;
	}

	// ö����2
	public enum Season2 {
		Spring(1, "����"), Summer(2, "����"), Autumn(3, "����"), Winter(4, "����");
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
