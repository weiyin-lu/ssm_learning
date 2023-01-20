package online.weiyin.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

// mybatis工具类
public class SqlSessionUtil {

    private static InputStream stream;
    private static String configName = "mybatis-config.xml";
    private static SqlSessionFactory build;
    private static SqlSession session;

    static {
        try {
            stream = Resources.getResourceAsStream(configName);
        } catch (IOException e) {
            throw new RuntimeException("缺少核心配置文件 mybatis-config.xml");
        }
        build = new SqlSessionFactoryBuilder().build(stream);
    }

    public static SqlSession getSession() {
        return getSession(false);
    }

    public static SqlSession getSession(Boolean autoCommit) {
        session = build.openSession(autoCommit);
        return session;
    }

    public void commit() {
        session.commit();
    }

    public void close() {
        session.close();
    }

}
