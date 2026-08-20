package ksyun.client.pdns.batchcreatezonerecord.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname BatchCreateZoneRecordRequest
* @Description 请求参数
*/
@Data
public class BatchCreateZoneRecordRequest{
    /**zone的id*/
    @KsYunField(name="ZoneId")
    private String ZoneId;

    /**zone的解析记录Record*/
    @KsYunField(name="RecordSet",type=2)
    private List<RecordSetDto> RecordSetList;

    @Data
    @ToString
    public static class RecordSetDto {
        /**记录名称*/
        @KsYunField(name="RecordName")
        private String RecordName;

        /**有效值：

A 大小写字母、数字以及中划线 IPv4地址
AAAA 大小写字母、数字以及中划线 IPv6地址
MX 大小写字母、数字以及中划线 由优先级和域名组成，用一个空格隔开。优先级1-100
CNAME 大小写字母、数字以及中划线 域名
TXT 大小写字母、数字以及中划线 长度不超过255个字符
SRV 大小写字母、数字以及中划线和下划线 由优先级、权重、端口和域名组成，用一个空格隔开。优先级0-65535，权重0-65535，端口0-65535
PTR 0-255之间的数字 域名*/
        @KsYunField(name="Type")
        private String Type;

        /**记录ttl*/
        @KsYunField(name="RecordTtl")
        private Integer RecordTtl;

        /**记录值*/
        @KsYunField(name="RecordValue",type=2)
        private List<String> RecordValueList;

        /**优先级，Type = MX，SRV，必传*/
        @KsYunField(name="Priority")
        private Integer Priority;

        /**权重，Type = SRV，必传*/
        @KsYunField(name="Weight")
        private Integer Weight;

        /**权重，Type = SRV，必传
*/
        @KsYunField(name="Port")
        private Integer Port;

    }

}
