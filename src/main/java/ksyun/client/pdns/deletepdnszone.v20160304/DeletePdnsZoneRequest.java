package ksyun.client.pdns.deletepdnszone.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeletePdnsZoneRequest
 * @Description 请求参数
 */
@Data
public class DeletePdnsZoneRequest {
    /**
     * Zone的ID
     */
    @KsYunField(name = "ZoneId")
    private String ZoneId;

}