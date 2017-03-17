package cn.trusteye.base.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Rayman on 2017/3/9.
 */
public class ResourcesUtilTest {
    @Test
    public void testGetValue() {
        String value = ResourcesUtil.getValue("messages", "907", new Object[]{200, 100});
        Assert.assertEquals("操作成功200条，失败100条", value);
        //根据操作系统环境获取语言环境
/*
        Locale locale = Locale.getDefault();
        System.out.println(locale.getCountry());//输出国家代码
		System.out.println(locale.getLanguage());//输出语言代码s

		//加载国际化资源（classpath下resources目录下的messages.properties，如果是中文环境会优先找messages_zh_CN.properties）
		ResourceBundle rb = ResourceBundle.getBundle("resources.messages", locale);
		String retValue = rb.getString("101");//101是messages.properties文件中的key
		System.out.println(retValue);

		//信息格式化，如果资源中有{}的参数则需要使用MessageFormat格式化，Object[]为传递的参数，数量根据资源文件中的{}个数决定
		String value = MessageFormat.format(retValue, new Object[]{100,200});
		System.out.println(value);
*/

    }
}
