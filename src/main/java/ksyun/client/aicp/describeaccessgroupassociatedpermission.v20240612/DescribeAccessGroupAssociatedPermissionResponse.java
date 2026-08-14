package ksyun.client.aicp.describeaccessgroupassociatedpermission.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAccessGroupAssociatedPermissionResponse
* @Description DescribeAccessGroupAssociatedPermission 返回体
*/
@Data
@ToString
public class DescribeAccessGroupAssociatedPermissionResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**关联权限列表*/
    @JsonProperty("AssociatedPermissionSet")
    private List<AssociatedPermissionSetDto> AssociatedPermissionSet;

    @Data
    @ToString
    public static class AssociatedPermissionSetDto {
        /**关联权限ID*/
        @JsonProperty("AssociatedPermissionId")
        private String AssociatedPermissionId;

        /**资源类型，枚举值：
- Queue，队列
- Dataset，存储配置
- Image，镜像
- Model，模型
- ImageRegistry，第三方镜像配置*/
        @JsonProperty("ResourceType")
        private String ResourceType;

        /**资源信息*/
        @JsonProperty("ResourceInfo")
        private AssociatedPermissionSetResourceInfoDto ResourceInfo;

        @Data
        @ToString
        public static class AssociatedPermissionSetResourceInfoDto {
            /**资源名称*/
            @JsonProperty("ResourceName")
            private String ResourceName;

            /**资源ID*/
            @JsonProperty("ResourceId")
            private String ResourceId;

        }

    }

}
