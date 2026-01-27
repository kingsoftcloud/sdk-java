package ksyun.client.aicp.modifymodelaccess.v20251212;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyModelAccessRequest
* @Description 请求参数
*/
@Data
public class ModifyModelAccessRequest{
    /**模型ID*/
    @KsYunField(name="ModelId")
    private String ModelId;

    /**用户访问权限列表*/
    @KsYunField(name="Users",type=2)
    private List<UsersDto> UsersList;

    @Data
    @ToString
    public static class UsersDto {
        /**用户ID*/
        @KsYunField(name="UserId")
        private String UserId;

        /**模型权限，有效值：writer(可读写), reader(只读)*/
        @KsYunField(name="Permission")
        private String Permission;

    }

}
