package online.weiyin.pojo;

import java.math.BigDecimal;

public class Account {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.id
     *
     * @mbg.generated Wed Jan 11 15:10:36 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.name
     *
     * @mbg.generated Wed Jan 11 15:10:36 CST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.price
     *
     * @mbg.generated Wed Jan 11 15:10:36 CST 2023
     */
    private BigDecimal price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.id
     *
     * @return the value of t_account.id
     *
     * @mbg.generated Wed Jan 11 15:10:36 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.id
     *
     * @param id the value for t_account.id
     *
     * @mbg.generated Wed Jan 11 15:10:36 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.name
     *
     * @return the value of t_account.name
     *
     * @mbg.generated Wed Jan 11 15:10:36 CST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.name
     *
     * @param name the value for t_account.name
     *
     * @mbg.generated Wed Jan 11 15:10:36 CST 2023
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.price
     *
     * @return the value of t_account.price
     *
     * @mbg.generated Wed Jan 11 15:10:36 CST 2023
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.price
     *
     * @param price the value for t_account.price
     *
     * @mbg.generated Wed Jan 11 15:10:36 CST 2023
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}