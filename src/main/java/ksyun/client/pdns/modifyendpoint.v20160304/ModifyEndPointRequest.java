package ksyun.client.pdns.modifyendpoint.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyEndPointRequest
* @Description 请求参数
*/
@Data
public class ModifyEndPointRequest{
    /**出站节点的ID*/
    @KsYunField(name="EndPointId")
    private String EndPointId;

    /**名称*/
    @KsYunField(name="EndPointName")
    private String EndPointName;

    /**描述信息*/
    @KsYunField(name="Description")
    private String Description;

    /**筛选Filter*/
    @KsYunField(name="IpConfig",type=2)
    private List<IpConfigDto> IpConfigList;

    @Data
    @ToString
    public static class IpConfigDto {
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
