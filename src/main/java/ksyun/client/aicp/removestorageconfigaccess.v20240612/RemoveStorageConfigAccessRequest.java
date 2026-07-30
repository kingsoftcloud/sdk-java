package ksyun.client.aicp.removestorageconfigaccess.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RemoveStorageConfigAccessRequest
* @Description 请求参数
*/
@Data
public class RemoveStorageConfigAccessRequest{
    /**存储配置ID*/
    @KsYunField(name="StorageConfigId")
    private String StorageConfigId;

    /**子用户ID（要被移除的子用户ID）*/
    @KsYunField(name="UserId")
    private String UserId;

    /**权限组ID（要被移除权限的权限组ID）*/
    @KsYunField(name="SharedGroupId")
    private String SharedGroupId;

}
