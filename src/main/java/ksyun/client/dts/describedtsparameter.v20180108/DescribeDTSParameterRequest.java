package ksyun.client.dts.describedtsparameter.v20180108;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeDTSParameterRequest
 * @Description 请求参数
 */
@Data
public class DescribeDTSParameterRequest {
    /**
     * 源端实例类型。如：Public|SpecialLine|Krds|SubscriptionKrds（仅支持mysql）等。
     */
    @KsYunField(name = "SourceType")
    private String SourceType;

    /**
     * 目标端实例类型。
     */
    @KsYunField(name = "TargetType")
    private String TargetType;

    /**
     * 目标端数据库实例ID。
     */
    @KsYunField(name = "TargetInstanceId")
    private String TargetInstanceId;

    /**
     * 目标端实例机房。
     */
    @KsYunField(name = "TargetRegion")
    private String TargetRegion;

    /**
     * 源端数据库实例ID。
     */
    @KsYunField(name = "SourceInstanceId")
    private String SourceInstanceId;

    /**
     * 源端实例IP。
     */
    @KsYunField(name = "SourceHost")
    private String SourceHost;

    /**
     * 源端实例端口。
     */
    @KsYunField(name = "SourcePort")
    private String SourcePort;

    /**
     * 源端数据库用户名。
     */
    @KsYunField(name = "SourceUsername")
    private String SourceUsername;

    /**
     * 源端数据库账号密码。
     */
    @KsYunField(name = "SourcePassword")
    private String SourcePassword;

    /**
     * 源端实例机房。
     */
    @KsYunField(name = "SourceRegion")
    private String SourceRegion;

}