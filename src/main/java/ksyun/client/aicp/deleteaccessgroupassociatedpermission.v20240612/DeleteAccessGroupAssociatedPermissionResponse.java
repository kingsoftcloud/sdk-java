package ksyun.client.aicp.deleteaccessgroupassociatedpermission.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteAccessGroupAssociatedPermissionResponse
* @Description DeleteAccessGroupAssociatedPermission 返回体
*/
@Data
@ToString
public class DeleteAccessGroupAssociatedPermissionResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**权限组ID*/
    @JsonProperty("AccessGroupId")
    private String AccessGroupId;

}
