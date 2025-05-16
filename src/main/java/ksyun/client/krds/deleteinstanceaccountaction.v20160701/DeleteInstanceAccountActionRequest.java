package ksyun.client.krds.deleteinstanceaccountaction.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteInstanceAccountActionRequest
 * @Description 请求参数
 */
@Data
public class DeleteInstanceAccountActionRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 数据库账户名称，支持批量删除，使用“,”隔开
     */
    @KsYunField(name = "InstanceAccountName")
    private String InstanceAccountName;

}