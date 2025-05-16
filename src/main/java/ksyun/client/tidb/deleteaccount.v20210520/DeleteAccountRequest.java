package ksyun.client.tidb.deleteaccount.v20210520;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteAccountRequest
 * @Description 请求参数
 */
@Data
public class DeleteAccountRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 账户名称，支持批量删除，中间用  ',' 分隔
     */
    @KsYunField(name = "AccountName")
    private String AccountName;

}