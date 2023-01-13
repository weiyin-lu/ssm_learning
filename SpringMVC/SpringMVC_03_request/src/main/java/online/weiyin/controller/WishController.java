package online.weiyin.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/wish")
public class WishController {

    @RequestMapping("/date")
    @ResponseBody
    public String date(Date date,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
                       @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date2) {
        System.out.println("日期型数据传递（标准）" + date);
        System.out.println("日期型数据传递（格式化）" + date1);
        System.out.println("日期型数据传递（格式化带时间）" + date2);

        return "{'ret' : 'date'}";
    }
}
