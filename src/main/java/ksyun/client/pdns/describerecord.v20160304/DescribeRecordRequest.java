package ksyun.client.pdns.describerecord.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeRecordRequest
 * @Description 请求参数
 */
@Data
public class DescribeRecordRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}