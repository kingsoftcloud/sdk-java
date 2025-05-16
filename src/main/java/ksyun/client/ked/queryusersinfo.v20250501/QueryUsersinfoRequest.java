package ksyun.client.ked.queryusersinfo.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname QueryUsersinfoRequest
 * @Description 请求参数
 */
@Data
public class QueryUsersinfoRequest {
    /**
     * 用户名
     */
    @KsYunField(name = "username")
    private String Username;

    /**
     * 手机号
     */
    @KsYunField(name = "phone")
    private String Phone;

    /**
     * 邮箱
     */
    @KsYunField(name = "email")
    private String Email;

}