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

        /**模型权限，有效值：writer(管理员可读写), reader(普通用户只读)*/
        @KsYunField(name="Permission")
        private String Permission;

    }

    /**模型权限，枚举值：
- Public，公开可见
- Private，仅自己可见
- Specified，指定范围*/
    @KsYunField(name="ModelPermission")
    private String ModelPermission;

    /**权限组共享列表（若传入，会进行全量覆盖式修改）*/
    @KsYunField(name="SharedGroupList",type=2)
    private List<SharedGroupListDto> SharedGroupListList;

    @Data
    @ToString
    public static class SharedGroupListDto {
        /**权限组ID，36位*/
        @KsYunField(name="AccessGroupId")
        private String AccessGroupId;

        /**权限组共享角色，枚举值：
- writer，管理员
- reader，只读成员*/
        @KsYunField(name="Permission")
        private String Permission;

    }

}
