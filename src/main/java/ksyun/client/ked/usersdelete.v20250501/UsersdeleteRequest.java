package ksyun.client.ked.usersdelete.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UsersdeleteRequest
 * @Description 请求参数
 */
@Data
public class UsersdeleteRequest {
    /**
     * 用户主键 id
     */
    @KsYunField(name = "id")
    private Integer Id;

}