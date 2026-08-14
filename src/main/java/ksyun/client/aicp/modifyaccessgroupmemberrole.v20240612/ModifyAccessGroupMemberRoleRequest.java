package ksyun.client.aicp.modifyaccessgroupmemberrole.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyAccessGroupMemberRoleRequest
* @Description 请求参数
*/
@Data
public class ModifyAccessGroupMemberRoleRequest{
    /**权限组ID，36位*/
    @KsYunField(name="AccessGroupId")
    private String AccessGroupId;

    /**目标子账号ID*/
    @KsYunField(name="UserId")
    private String UserId;

    /**新角色，枚举值：
- writer，管理员
- reader，普通成员*/
    @KsYunField(name="Permission")
    private String Permission;

}
