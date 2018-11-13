
public class Leetcode402 {
	public static String removeKdigits(String num, int k) {
		// �����������ճ��� = ԭ�������� - k
		int newLength = num.length() - k;
		// ����һ��ջ�����ڽ������е�����
		char[] stack = new char[num.length()];
		int top = 0;
		for (int i = 0; i < num.length(); ++i)
		{
           // ������ǰ����
			char c = num.charAt(i);
           // ��ջ�����ִ��ڱ������ĵ�ǰ���֣�ջ�����ֳ�ջ���൱��ɾ�����֣�
			while (top > 0 && stack[top - 1] > c && k > 0) {
				top -= 1;
				k -= 1;
			}
            // �������ĵ�ǰ������ջ
			stack[top++] = c;
		}
         // �ҵ�ջ�е�һ���������ֵ�λ�ã��Դ˹����µ������ַ���
		int offset = 0;
		while (offset < newLength && stack[offset] == '0')
			offset++;
		return offset == newLength ? "0" : new String(stack, offset, newLength - offset);
}

	public static void main(String[] args) {

		System.out.println(removeKdigits("5337", 2));

	}

}
