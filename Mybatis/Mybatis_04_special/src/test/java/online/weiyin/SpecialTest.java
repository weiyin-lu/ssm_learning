package online.weiyin;

import online.weiyin.mapper.ClazzMapper;
import online.weiyin.pojo.Clazz;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SpecialTest {
    /**
     * 获得插入条目的自增主键值
     * @throws IOException
     */
    @Test
    public void getGenerate() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = build.openSession();
        ClazzMapper mapper = sqlSession.getMapper(ClazzMapper.class);

        Clazz cl = new Clazz();
        cl.setClassName("一年一班");

//        执行完之后，插入的主键值会存储在原对象里
        mapper.insertClass(cl);

        System.out.println(cl);
    }

    /**
     * 模糊查询
     * @throws IOException
     */
    @Test
    public void selectFuzzy() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = build.openSession();
        ClazzMapper mapper = sqlSession.getMapper(ClazzMapper.class);

        List<Clazz> res = mapper.selectByClassName("一");

        System.out.println(res);
    }

    /**
     * 批量删除
     * @throws IOException
     */
    @Test
    public void deleteBatch() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = build.openSession();
        ClazzMapper mapper = sqlSession.getMapper(ClazzMapper.class);

        mapper.deleteBatchById("1,2");
        sqlSession.commit();
    }
}
