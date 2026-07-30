package ksyun.client.aicp.addstorageconfigaccess.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AddStorageConfigAccessRequest
* @Description 请求参数
*/
@Data
public class AddStorageConfigAccessRequest{
    /**存储配置ID*/
    @KsYunField(name="StorageConfigId")
    private String StorageConfigId;

    /**要添加的子用户ID*/
    @KsYunField(name="UserId")
    private String UserId;

    /**要添加的权限组ID*/
    @KsYunField(name="SharedGroupId")
    private String SharedGroupId;

    /**权限类型, kpfs用户权限：[admin 创建者or主账号, writer 管理员（只读）, writer_mnt_w 管理员（读写）, reader 普通成员（只读）, reader_mnt_w 普通成员（读写）] ks3用户权限：[admin 创建者or主账号, writer 管理员（只读）, reader 普通成员（只读）]*/
    @KsYunField(name="Permission")
    private String Permission;

}
