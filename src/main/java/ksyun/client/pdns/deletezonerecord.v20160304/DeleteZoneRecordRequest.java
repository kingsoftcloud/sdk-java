package ksyun.client.pdns.deletezonerecord.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteZoneRecordRequest
 * @Description 请求参数
 */
@Data
public class DeleteZoneRecordRequest {
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
     * 优先级,记录的Type 为 MX、SRV 需要传入
     */
    @KsYunField(name = "Priority")
    private String Priority;

    /**
     * 权重,记录的Type 为 SRV 需要传入
     */
    @KsYunField(name = "Weight")
    private String Weight;

    /**
     * 端口,记录的Type 为 SRV 需要传入
     */
    @KsYunField(name = "Port")
    private String Port;

}