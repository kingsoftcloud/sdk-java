package ksyun.client.epc.describeroceevent.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeRoceEventRequest
 * @Description 请求参数
 */
@Data
public class DescribeRoceEventRequest {
    /**
     * 每页大小
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;

    /**
     * 第几条
     */
    @KsYunField(name="NextToken")
    private String NextToken;

    /***/
    @KsYunField(name="Filter.N")

    private FilterNDto FilterNList;

    @Data
    @ToString
    public static class FilterNDto {
        /**
         * event-id:事件ID
         * roce-ip:roceip
         * sn:实例序列号
         * event-start-time:事件发生时间-开始
         * event-end-time:事件发生事件-截止
         */
        @KsYunField(name="Name")
        private String Name;
        /**
         * 参数值
         */
        @KsYunField(name ="Value.M")
        private String ValueM;
    }
    /**实例ID*/
    @KsYunField(name="HostId.N")
    private String HostIdN;

}