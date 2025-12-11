package ksyun.client.epc.describeusehotstandbyrecords.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeUseHotStandbyRecordsRequest
* @Description 请求参数
*/
@Data
public class DescribeUseHotStandbyRecordsRequest{
    /**有效值：

fault-host-id，故障机实例ID，仅支持精确查询
hot-standby-host-id，热备机实例ID
fault-sn，故障机SN
fault-private-ip，故障机内网ip
fault-host-type，故障机类型
hot-standby-sn，热备机sn
hot-standby-private-ip，热备机内网ip
hot-standby-host-type，热备机机型
replace-type，热备替换类型*/
    @KsYunField(name="Filter.N")
    private FilterNDto FilterN;

    @Data
    @ToString
    public static class FilterNDto {
        /**参数名称*/
        @KsYunField(name="Name")
        private String Name;

        /**fault-host-id，故障机实例ID，仅支持精确查询
hot-standby-host-id，热备机实例ID
fault-sn，故障机SN
fault-private-ip，故障机内网ip
fault-host-type，故障机类型
hot-standby-sn，热备机sn
hot-standby-private-ip，热备机内网ip
hot-standby-host-type，热备机机型
replace-type，热备替换类型*/
        @KsYunField(name="Value",type=2)
        private List<String> ValueList;

    }

    /**每页条数*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
