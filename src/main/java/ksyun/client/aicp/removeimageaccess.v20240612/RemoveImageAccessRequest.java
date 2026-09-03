package ksyun.client.aicp.removeimageaccess.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RemoveImageAccessRequest
* @Description 请求参数
*/
@Data
public class RemoveImageAccessRequest{
    /**镜像ID*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**用户ID，与 SharedGroupId 二选一，不可同时为空或同时非空*/
    @KsYunField(name="UserId")
    private String UserId;

    /**权限组ID，与 UserId 二选一，不可同时为空或同时非空*/
    @KsYunField(name="SharedGroupId")
    private String SharedGroupId;

}
