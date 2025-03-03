package ksyun.client.pdns.modifyzonerecord.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyZoneRecordRequest
 * @Description 请求参数
 */
@Data
public class ModifyZoneRecordRequest {
    /**
     * Zone的ID
     */
    @KsYunField(name = "ZoneId")
    private String ZoneId;

    /**
     * 记录ID
     */
    @KsYunField(name = "RecordId")
    private String RecordId;

    /**
     * 记录值
     */
    @KsYunField(name = "RecordValue")
    private String RecordValue;

    /**
     * 记录ttl
     */
    @KsYunField(name = "RecordTtl")
    private Integer RecordTtl;


}