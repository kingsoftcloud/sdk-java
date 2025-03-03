package ksyun.client.ked.usersinstancebind.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

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