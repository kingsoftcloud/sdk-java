package ksyun.client.aicp.modifyaccessgroup.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyAccessGroupRequest
* @Description 请求参数
*/
@Data
public class ModifyAccessGroupRequest{
    /**权限组ID，36位，字母/数字/-*/
    @KsYunField(name="AccessGroupId")
    private String AccessGroupId;

    /**权限组名称，1-64位，支持中文、字母、数字和_-./()。不传表示不修改*/
    @KsYunField(name="AccessGroupName")
    private String AccessGroupName;

    /**权限组描述，最长200字符。不传表示不修改；*/
    @KsYunField(name="AccessGroupDescription")
    private String AccessGroupDescription;

    /**成员列表（全量替换）。不传(null)表示不修改；传空列表表示清空；传非空列表表示全量替换*/
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
