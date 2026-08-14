package ksyun.client.aicp.deleteaccessgroupassociatedpermission.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteAccessGroupAssociatedPermissionRequest
* @Description 请求参数
*/
@Data
public class DeleteAccessGroupAssociatedPermissionRequest{
    /**权限组ID*/
    @KsYunField(name="AccessGroupId")
    private String AccessGroupId;

    /**关联资源ID，与AssociatedPermissionId二选一；*/
    @KsYunField(name="AssociatedResourceId")
    private String AssociatedResourceId;

}
