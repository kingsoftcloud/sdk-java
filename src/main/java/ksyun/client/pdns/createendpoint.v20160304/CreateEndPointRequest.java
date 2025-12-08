package ksyun.client.pdns.createendpoint.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateEndPointRequest
* @Description 请求参数
*/
@Data
public class CreateEndPointRequest{
    /**名称*/
    @KsYunField(name="EndPointName")
    private String EndPointName;

    /**机房code 例如cn-beijing-6*/
    @KsYunField(name="Region")
    private String Region;

    /**VpcId*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**描述信息*/
    @KsYunField(name="Description")
    private String Description;

    /**筛选Filter*/
    @KsYunField(name="IpConfig",type=2)
    private List<IpConfigDto1> IpConfigList;

    @Data
    @ToString
    public static class IpConfigDto1 {
        /**可用区Code,例如cn-beijing-6a*/
        @KsYunField(name="AvailabilityZone")
        private String AvailabilityZone;

        /**子网ID*/
        @KsYunField(name="SubnetId")
        private String SubnetId;

        /**要求子网下的可用IP*/
        @KsYunField(name="IP")
        private String IP;

    }

}
