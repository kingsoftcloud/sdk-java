package ksyun.client.clickhouse.modifyinstanceaccountinfo.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifyInstanceAccountInfoRequest
 * @Description 请求参数
 */
@Data
public class ModifyInstanceAccountInfoRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 账号名称
     */
    @KsYunField(name = "InstanceAccountName")
    private String InstanceAccountName;

    /**
     * 账号密码
     * <p>
     * ```json
     * 账号密码或者描述必须填写一项
     * ```
     */
    @KsYunField(name = "InstanceAccountPassword")
    private String InstanceAccountPassword;

    /**
     * 账号描述
     * <p>
     * ```json
     * 账号密码或者描述必须填写一项
     * ```
     */
    @KsYunField(name = "InstanceAccountDescription")
    private String InstanceAccountDescription;

}