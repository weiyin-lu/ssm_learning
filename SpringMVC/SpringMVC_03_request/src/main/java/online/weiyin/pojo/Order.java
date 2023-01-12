package online.weiyin.pojo;

import lombok.Data;

@Data
public class Order {
    private String name;
    private Integer price;
    private User user;
}
