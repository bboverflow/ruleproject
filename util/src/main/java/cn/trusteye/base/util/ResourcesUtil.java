package cn.trusteye.base.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URL;
import java.net.URLConnection;
import java.text.MessageFormat;
import java.util.*;

/**
 * 资源文件读取工具类
 */
public class ResourcesUtil implements Serializable {

    private static final long serialVersionUID = -7657898714983901418L;

    /**
     * 系统语言环境，默认为中文zh
     */
    public static final String LANGUAGE = "zh";

    /**
     * 系统国家环境，默认为中国CN
     */
    public static final String COUNTRY = "CN";

    private static Locale getLocale() {
        Locale locale = new Locale(LANGUAGE, COUNTRY);
        return locale;
    }

    /**
     * 根据语言、国家、资源文件名和key名字获取资源文件值
     *
     * @param baseName 资源文件名
     * @param section  key名字
     * @return 值
     */
    private static String getProperties(String baseName, String section) {
        String retValue = "";
        try {
            Locale locale = getLocale();

/*
            ResourceBundle rb  = ResourceBundle.getBundle(baseName,locale,new UTF8Control());
            retValue = rb.getString(section);
*/
            ResourceBundle rb = ResourceBundle.getBundle(baseName);
            retValue = new String(rb.getString(section).getBytes("ISO-8859-1"),"utf-8");
        } catch (Exception e) {
            e.printStackTrace();
            // TODO 添加处理
        }
        return retValue;
    }

    /**
     * 通过key从资源文件读取内容
     *
     * @param fileName 资源文件名
     * @param key      索引
     * @return 索引对应的内容
     */
    public static String getValue(String fileName, String key) {
        String value = getProperties(fileName, key);
        return value;
    }

    public static List<String> gekeyList(String baseName) {
        Locale locale = getLocale();
        ResourceBundle rb = ResourceBundle.getBundle(baseName, locale);

        List<String> reslist = new ArrayList<String>();

        Set<String> keyset = rb.keySet();
        for (Iterator<String> it = keyset.iterator(); it.hasNext(); ) {
            String lkey = (String) it.next();
            reslist.add(lkey);
        }

        return reslist;

    }

    /**
     * 通过key从资源文件读取内容，并格式化
     *
     * @param fileName 资源文件名
     * @param key      索引
     * @param objs     格式化参数
     * @return 格式化后的内容
     */
    public static String getValue(String fileName, String key, Object[] objs) {
        String pattern = getValue(fileName, key);
        String value = MessageFormat.format(pattern, objs);
        return value;
    }

    public static class UTF8Control extends ResourceBundle.Control {
        public ResourceBundle newBundle
                (String baseName, Locale locale, String format, ClassLoader loader, boolean reload)
                throws IllegalAccessException, InstantiationException, IOException
        {
            // The below is a copy of the default implementation.
            String bundleName = toBundleName(baseName, locale);
            String resourceName = toResourceName(bundleName, "properties");
            ResourceBundle bundle = null;
            InputStream stream = null;
            if (reload) {
                URL url = loader.getResource(resourceName);
                if (url != null) {
                    URLConnection connection = url.openConnection();
                    if (connection != null) {
                        connection.setUseCaches(false);
                        stream = connection.getInputStream();
                    }
                }
            } else {
                stream = loader.getResourceAsStream(resourceName);
            }
            if (stream != null) {
                try {
                    // Only this line is changed to make it to read properties files as UTF-8.
                    bundle = new PropertyResourceBundle(new InputStreamReader(stream, "UTF-8"));
                } finally {
                    stream.close();
                }
            }
            return bundle;
        }
    }
}
