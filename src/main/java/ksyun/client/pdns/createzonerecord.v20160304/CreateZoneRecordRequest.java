package ksyun.client.pdns.createzonerecord.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateZoneRecordRequest
 * @Description 请求参数
 */
@Data
public class CreateZoneRecordRequest {
    /**
     * Zone的ID
     */
    @KsYunField(name = "ZoneId")
    private String ZoneId;

    /**
     * 记录名称
     */
    @KsYunField(name = "RecordName")
    private String RecordName;

    /**
     * 记录类型(A | AAAA | MX | CNAME | TXT | SRV | PTR)
     */
    @KsYunField(name = "Type")
    private String Type;

    /**
     * 记录ttl
     */
    @KsYunField(name = "RecordTtl")
    private Integer RecordTtl;

    /**
     * 记录值
     */
    @KsYunField(name = "RecordValue")
    private String RecordValue;


}