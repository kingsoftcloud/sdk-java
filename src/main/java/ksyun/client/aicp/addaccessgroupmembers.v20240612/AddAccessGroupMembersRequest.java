package ksyun.client.aicp.addaccessgroupmembers.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AddAccessGroupMembersRequest
* @Description 请求参数
*/
@Data
public class AddAccessGroupMembersRequest{
    /**权限组ID，36位*/
    @KsYunField(name="AccessGroupId")
    private String AccessGroupId;

    /**待添加成员列表，至少1项*/
    @KsYunField(name="Users",type=2)
    private List<UsersDto> UsersList;

    @Data
    @ToString
    public static class UsersDto {
        /**子账号ID*/
        @KsYunField(name="UserId")
        private String UserId;

        /**成员角色，枚举值：
- writer，管理员
- reader，普通成员*/
        @KsYunField(name="Permission")
        private String Permission;

    }

}
