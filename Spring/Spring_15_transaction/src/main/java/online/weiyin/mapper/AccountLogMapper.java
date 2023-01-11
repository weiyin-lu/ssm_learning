package online.weiyin.mapper;

import java.util.List;
import online.weiyin.pojo.AccountLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_log
     *
     * @mbg.generated Wed Jan 11 16:15:16 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_log
     *
     * @mbg.generated Wed Jan 11 16:15:16 CST 2023
     */
    int insert(AccountLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_log
     *
     * @mbg.generated Wed Jan 11 16:15:16 CST 2023
     */
    AccountLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_log
     *
     * @mbg.generated Wed Jan 11 16:15:16 CST 2023
     */
    List<AccountLog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_account_log
     *
     * @mbg.generated Wed Jan 11 16:15:16 CST 2023
     */
    int updateByPrimaryKey(AccountLog record);
}