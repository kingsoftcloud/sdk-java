package ksyun.client.pdns.modifyzonerecord.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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
     * 记录ttl
     */
    @KsYunField(name = "RecordTtl")
    private Integer RecordTtl;

}