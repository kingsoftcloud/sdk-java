package ksyun.client.dts.describesourceuser.v20180108;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeSourceUserRequest
* @Description 请求参数
*/
@Data
public class DescribeSourceUserRequest{
    /**源端mysql实例id*/
    @KsYunField(name="SourceInstanceId")
    private String SourceInstanceId;

    /**源库类型*/
    @KsYunField(name="SourceType")
    private String SourceType;

    /**源端mysql连接用户名*/
    @KsYunField(name="SourceUsername")
    private String SourceUsername;

    /**源端mysql连接密码*/
    @KsYunField(name="SourcePassword")
    private String SourcePassword;

    /**源端可用区*/
    @KsYunField(name="SourceRegion")
    private String SourceRegion;

    /**目标端实例类型*/
    @KsYunField(name="TargetType")
    private String TargetType;

    /**目标端实例id*/
    @KsYunField(name="TargetInstanceId")
    private String TargetInstanceId;

    /**目标端可用区*/
    @KsYunField(name="TargetRegion")
    private String TargetRegion;

}
