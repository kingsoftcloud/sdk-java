package ksyun.client.ked.usersinstancebind.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname UsersinstancebindRequest
 * @Description 请求参数
 */
@Data
public class UsersinstancebindRequest {
    /**
     * 用户 id
     */
    @KsYunField(name = "id")
    private Integer Id;

    /**
     * 云电脑 id
     */
    @KsYunField(name = "instanceId")
    private String InstanceId;

}