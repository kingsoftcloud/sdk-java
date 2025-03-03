package ksyun.client.dts.schemastruct.v20180108;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname SchemaStructRequest
 * @Description 请求参数
 */
@Data
public class SchemaStructRequest {
    /**
     * 源端实例ID。
     */
    @KsYunField(name = "SourceInstanceId")
    private String SourceInstanceId;

    /**
     * 表库类型。Public|SpecialLine|Krds|SubscriptionKrds（仅支持mysql）。
     */
    @KsYunField(name = "SourceType")
    private String SourceType;

    /**
     * 源端数据库账号。
     */
    @KsYunField(name = "SourceUsername")
    private String SourceUsername;

    /**
     * 源端数据库账号密码。
     */
    @KsYunField(name = "SourcePassword")
    private String SourcePassword;

    /**
     * 源端地域
     */
    @KsYunField(name = "SourceRegion")
    private String SourceRegion;

}