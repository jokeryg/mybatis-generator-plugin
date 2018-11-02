package com.jokeryg.mybatis.generator.util;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.xml.XmlElement;

/**
 * JokerYG
 * Date: 2018-11-02
 * Time: 12:37
 */
public class NameUtil {

    /**
     * 组装方法和主键的名称

     */
    public static String concatMethodAndPrimaryKeyName(XmlElement answer, IntrospectedTable introspectedTable){
       return answer.getName().concat("By")
               .concat(StringUtil.upperCase(
                       introspectedTable.getPrimaryKeyColumns().get(0).getActualColumnName()
               ));
    }
}
