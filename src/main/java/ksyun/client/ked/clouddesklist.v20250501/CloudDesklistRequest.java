package ksyun.client.ked.clouddesklist.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CloudDesklistRequest
* @Description 请求参数
*/
@Data
public class CloudDesklistRequest{
    /***/
    @KsYunField(name="page")
    private Integer Page;

    /***/
    @KsYunField(name="size")
    private Integer Size;

    /**连接状态 on off*/
    @KsYunField(name="connected")
    private String Connected;

    /**云电脑已绑定的标签id,多个id使用英文逗号分隔*/
    @KsYunField(name="labelIds")
    private String LabelIds;

    /**云电脑名称或实例id*/
    @KsYunField(name="name")
    private String Name;

    /**云电脑已绑定的用户名*/
    @KsYunField(name="userName")
    private String UserName;

}
