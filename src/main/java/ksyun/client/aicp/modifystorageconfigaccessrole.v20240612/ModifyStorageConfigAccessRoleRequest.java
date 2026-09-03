package ksyun.client.aicp.modifystorageconfigaccessrole.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyStorageConfigAccessRoleRequest
* @Description 请求参数
*/
@Data
public class ModifyStorageConfigAccessRoleRequest{
    /**存储配置ID*/
    @KsYunField(name="StorageConfigId")
    private String StorageConfigId;

    /**要移除权限组的子账号ID*/
    @KsYunField(name="UserId")
    private String UserId;

    /**要移除权限的权限组ID*/
    @KsYunField(name="SharedGroupId")
    private String SharedGroupId;

    /**权限类型
KPFS存储配置权限枚举值：
- writer_mnt_w 管理员（读写）
- writer 管理员（只读）
- reader_mnt_w 普通成员（读写）
- reader普通成员（只读）

KS3存储配置权限枚举值：
- writer 管理员
- reader普通成员*/
    @KsYunField(name="Permission")
    private String Permission;

}
