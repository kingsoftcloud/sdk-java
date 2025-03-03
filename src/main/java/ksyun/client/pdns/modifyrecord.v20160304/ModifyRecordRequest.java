package ksyun.client.pdns.modifyrecord.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyRecordRequest
 * @Description 请求参数
 */
@Data
public class ModifyRecordRequest {
    /**
     * 记录值
     */
    @KsYunField(name = "RecordValue")
    private String RecordValue;


}