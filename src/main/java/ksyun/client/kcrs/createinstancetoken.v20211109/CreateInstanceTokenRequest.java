package ksyun.client.kcrs.createinstancetoken.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateInstanceTokenRequest
 * @Description 请求参数
 */
@Data
public class CreateInstanceTokenRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 实例访问凭证过期时间类型，有效值：<br/>Hour：指定时长<br/>Day：指定天数<br/>NeverExpire：永不过期<br/>注：与参数TokenTime搭配使用，用于设置访问凭证到期时间
     */
    @KsYunField(name = "TokenType")
    private String TokenType;

    /**
     * 实例访问凭证过期时间<br/>注：当参数TokenType设置为NeverExpire时，该参数不生效
     */
    @KsYunField(name = "TokenTime")
    private String TokenTime;

    /**
     * 访问凭证描述信息,长度限制在256字节内
     */
    @KsYunField(name = "Desc")
    private String Desc;


}