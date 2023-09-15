package ksyun.client.krds.stopaudit.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StopAuditRequest
* @Description 请求参数
*/
@Data
public class StopAuditRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;


}