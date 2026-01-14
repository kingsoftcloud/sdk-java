package ksyun.client.kfw.describecfwacl.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCfwAclResponse
* @Description DescribeCfwAcl 返回体
*/
@Data
@ToString
public class DescribeCfwAclResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("CfwAcls")
    private List<CfwAclsDto> CfwAcls;

    @Data
    @ToString
    public static class CfwAclsDto {
        /***/
        @JsonProperty("CfwInstanceId")
        private String CfwInstanceId;

        /***/
        @JsonProperty("AclId")
        private String AclId;

        /***/
        @JsonProperty("AclName")
        private String AclName;

        /***/
        @JsonProperty("Direction")
        private String Direction;

        /***/
        @JsonProperty("SrcType")
        private String SrcType;

        /***/
        @JsonProperty("SrcIps")
        private String SrcIps;

        /***/
        @JsonProperty("SrcAddrbooks")
        private String SrcAddrbooks;

        /***/
        @JsonProperty("SrcZones")
        private List<CfwAclsSrcZonesDto> SrcZones;

        @Data
        @ToString
        public static class CfwAclsSrcZonesDto {
            /***/
            @JsonProperty("AreaCode")
            private String AreaCode;

            /***/
            @JsonProperty("AreaName")
            private String AreaName;

            /***/
            @JsonProperty("SubAreas")
            private String SubAreas;

        }

        /***/
        @JsonProperty("DestType")
        private String DestType;

        /***/
        @JsonProperty("DestIps")
        private String DestIps;

        /***/
        @JsonProperty("DestAddrbooks")
        private List<String> DestAddrbooks;

        /***/
        @JsonProperty("ServiceType")
        private String ServiceType;

        /***/
        @JsonProperty("ServiceInfo")
        private String ServiceInfo;

        /***/
        @JsonProperty("ServiceGroups")
        private List<String> ServiceGroups;

        /***/
        @JsonProperty("appType")
        private String AppType;

        /***/
        @JsonProperty("AppValue")
        private List<String> AppValue;

        /***/
        @JsonProperty("Policy")
        private String Policy;

        /***/
        @JsonProperty("Status")
        private String Status;

        /***/
        @JsonProperty("Priority")
        private Integer Priority;

        /***/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("HitCount")
        private Integer HitCount;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

    }

    /***/
    @JsonProperty("NextToken")
    private String NextToken;

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

}
