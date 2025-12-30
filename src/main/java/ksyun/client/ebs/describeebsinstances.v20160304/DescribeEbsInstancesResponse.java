package ksyun.client.ebs.describeebsinstances.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeEbsInstancesResponse
* @Description DescribeEbsInstances 返回体
*/
@Data
@ToString
public class DescribeEbsInstancesResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**可挂载主机的相关信息*/
    @JsonProperty("Instances")
    private List<InstancesDto> Instances;

    @Data
    @ToString
    public static class InstancesDto {
        /**主机实例ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**主机名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**主机内网IP*/
        @JsonProperty("InstanceIp")
        private String InstanceIp;

        /**主机是否可用，true表示可用（可用：挂载未超过3块EBS数据盘）*/
        @JsonProperty("InstanceEnable")
        private String InstanceEnable;

    }

}
