package ksyun.client.kec.describemounttargets.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMountTargetsResponse
* @Description DescribeMountTargets 返回体
*/
@Data
@ToString
public class DescribeMountTargetsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("DescribeMountTargetsResponse")
    private DescribeMountTargetsResponseDto DescribeMountTargetsResponse;

    @Data
    @ToString
    public static class DescribeMountTargetsResponseDto {
        /***/
        @JsonProperty("RequestId")
        private String RequestId;

        /***/
        @JsonProperty("Marker")
        private String Marker;

        /***/
        @JsonProperty("FileSystemCount")
        private String FileSystemCount;

        /***/
        @JsonProperty("MountTargets")
        private DescribeMountTargetsResponseMountTargetsDto MountTargets;

        @Data
        @ToString
        public static class DescribeMountTargetsResponseMountTargetsDto {
            /***/
            @JsonProperty("Item")
            private DescribeMountTargetsResponseMountTargetsItemDto Item;

            @Data
            @ToString
            public static class DescribeMountTargetsResponseMountTargetsItemDto {
                /***/
                @JsonProperty("MountTargetId")
                private String MountTargetId;

                /***/
                @JsonProperty("SubnetId")
                private String SubnetId;

                /***/
                @JsonProperty("IpAddress")
                private String IpAddress;

                /***/
                @JsonProperty("MountTargetState")
                private String MountTargetState;

                /***/
                @JsonProperty("CreationDate")
                private String CreationDate;

                /**权限组信息*/
                @JsonProperty("AccessGroup")
                private DescribeMountTargetsResponseMountTargetsItemAccessGroupDto AccessGroup;

                @Data
                @ToString
                public static class DescribeMountTargetsResponseMountTargetsItemAccessGroupDto {
                    /**权限组ID*/
                    @JsonProperty("AccessGroupId")
                    private String AccessGroupId;

                    /**权限组名称*/
                    @JsonProperty("AccessGroupName")
                    private String AccessGroupName;

                    /**标识是否默认权限组*/
                    @JsonProperty("DefaultGroup")
                    private Boolean DefaultGroup;

                }

            }

        }

    }

}
