package ksyun.client.ked.usersdelete.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UsersdeleteRequest
* @Description 请求参数
*/
@Data
public class UsersdeleteRequest{
    /**用户主键 id*/
    @KsYunField(name="id")
    private Integer Id;

}
