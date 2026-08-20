package ksyun.client.pdns.batchdeletezonerecord.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname BatchDeleteZoneRecordRequest
* @Description 请求参数
*/
@Data
public class BatchDeleteZoneRecordRequest{
    /**zone的id*/
    @KsYunField(name="ZoneId")
    private String ZoneId;

    /**zone的解析记录RecordId,可以批量，最多50个*/
    @KsYunField(name="RecordIds",type=2)
    private List<String> RecordIdsList;

}
