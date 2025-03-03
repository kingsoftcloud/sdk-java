package ksyun.client.pdns.createrecord.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateRecordRequest
 * @Description 请求参数
 */
@Data
public class CreateRecordRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}