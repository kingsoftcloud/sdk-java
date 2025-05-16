package ksyun.client.postgresql.deleteinstanceaccount.v20181225;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteInstanceAccountRequest
 * @Description 请求参数
 */
@Data
public class DeleteInstanceAccountRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 账号名称
     */
    @KsYunField(name = "AccountName")
    private String AccountName;

}