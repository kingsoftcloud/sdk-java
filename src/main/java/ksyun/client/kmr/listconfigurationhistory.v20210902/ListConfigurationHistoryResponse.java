package ksyun.client.kmr.listconfigurationhistory.v20210902;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListConfigurationHistoryResponse
* @Description ListConfigurationHistory 返回体
*/
@Data
@ToString
public class ListConfigurationHistoryResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**集群ID*/
    @JsonProperty("ClusterId")
    private String ClusterId;

    /**服务名称*/
    @JsonProperty("ServiceName")
    private String ServiceName;

    /**总数*/
    @JsonProperty("Total")
    private Integer Total;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**配置项*/
        @JsonProperty("Key")
        private String Key;

        /**节点组类型*/
        @JsonProperty("InstanceGroupType")
        private String InstanceGroupType;

        /**节点组序号*/
        @JsonProperty("InstanceGroupIndex")
        private Integer InstanceGroupIndex;

        /**可用区序号*/
        @JsonProperty("AvailabilityZoneIndex")
        private Integer AvailabilityZoneIndex;

        /**更新时间*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /**原配置项*/
        @JsonProperty("SourceValue")
        private String SourceValue;

        /**目标配置项*/
        @JsonProperty("TargetValue")
        private String TargetValue;

        /**是否生效*/
        @JsonProperty("Activated")
        private Boolean Activated;

    }

    /**状态码*/
    @JsonProperty("StatusCode")
    private Integer StatusCode;

}
