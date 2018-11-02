package com.jokeryg.mybatis.generator.util;

/**
 * JokerYG
 * Date: 2018-11-02
 * Time: 12:32
 */
public class StringUtil {

    /**
     * 首字母转大写
     * @param str
     * @return
     */
    public static String upperCase(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }
        return new String(ch);
    }
}
