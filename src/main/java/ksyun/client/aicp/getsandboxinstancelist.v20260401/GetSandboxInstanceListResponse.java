package ksyun.client.aicp.getsandboxinstancelist.v20260401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetSandboxInstanceListResponse
* @Description GetSandboxInstanceList 返回体
*/
@Data
@ToString
public class GetSandboxInstanceListResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("InstanceSet")
        private List<DataInstanceSetDto> InstanceSet;

        @Data
        @ToString
        public static class DataInstanceSetDto {
            /***/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /***/
            @JsonProperty("TemplateId")
            private String TemplateId;

            /***/
            @JsonProperty("AccessUrl")
            private DataInstanceSetAccessUrlDto AccessUrl;

            @Data
            @ToString
            public static class DataInstanceSetAccessUrlDto {
                /***/
                @JsonProperty("CdpUrl")
                private String CdpUrl;

                /***/
                @JsonProperty("NoVncUrl")
                private String NoVncUrl;

                /***/
                @JsonProperty("CodeUrl")
                private String CodeUrl;

                /***/
                @JsonProperty("AppUrl")
                private String AppUrl;

            }

            /***/
            @JsonProperty("TemplateType")
            private String TemplateType;

            /***/
            @JsonProperty("Status")
            private String Status;

            /***/
            @JsonProperty("EndTime")
            private String EndTime;

            /***/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /***/
            @JsonProperty("ContainerId")
            private String ContainerId;

            /***/
            @JsonProperty("Ks3MountConfig")
            private DataInstanceSetKs3MountConfigDto Ks3MountConfig;

            @Data
            @ToString
            public static class DataInstanceSetKs3MountConfigDto {
                /***/
                @JsonProperty("Ks3Enable")
                private Boolean Ks3Enable;

                /***/
                @JsonProperty("Ks3MountPoints")
                private List<DataInstanceSetKs3MountConfigKs3MountPointsDto> Ks3MountPoints;

                @Data
                @ToString
                public static class DataInstanceSetKs3MountConfigKs3MountPointsDto {
                    /***/
                    @JsonProperty("BucketName")
                    private String BucketName;

                    /***/
                    @JsonProperty("RemotePath")
                    private String RemotePath;

                    /***/
                    @JsonProperty("LocalMountPath")
                    private String LocalMountPath;

                    /***/
                    @JsonProperty("ReadOnly")
                    private Boolean ReadOnly;

                }

            }

            /***/
            @JsonProperty("KpfsMountConfig")
            private DataInstanceSetKpfsMountConfigDto KpfsMountConfig;

            @Data
            @ToString
            public static class DataInstanceSetKpfsMountConfigDto {
                /***/
                @JsonProperty("KpfsEnable")
                private Boolean KpfsEnable;

                /***/
                @JsonProperty("KpfsMountPoints")
                private List<DataInstanceSetKpfsMountConfigKpfsMountPointsDto> KpfsMountPoints;

                @Data
                @ToString
                public static class DataInstanceSetKpfsMountConfigKpfsMountPointsDto {
                    /***/
                    @JsonProperty("FileSystemName")
                    private String FileSystemName;

                    /***/
                    @JsonProperty("RemotePath")
                    private String RemotePath;

                    /***/
                    @JsonProperty("LocalMountPath")
                    private String LocalMountPath;

                    /***/
                    @JsonProperty("ReadOnly")
                    private Boolean ReadOnly;

                }

            }

        }

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("NextToken")
        private String NextToken;

        /***/
        @JsonProperty("MaxResults")
        private Integer MaxResults;

        /***/
        @JsonProperty("PageNum")
        private Integer PageNum;

        /***/
        @JsonProperty("PageSize")
        private Integer PageSize;

    }

}
