package jianzhioffer;

/**
 * Created by vino on 2017/8/10.
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */
public class 翻转单词顺序列 {
    public static void main(String[] args) {
        System.out.println(new 翻转单词顺序列().ReverseSentence(" "));
    }

    public String ReverseSentence(String str) {
        if (str == null)
            return null;
        if (str.equals(" "))
            return " ";
        String[] strs = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            stringBuilder.append(strs[i]);
            if (i != 0) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
