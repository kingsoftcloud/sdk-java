package ksyun.client.kmr.startjobrun.v20240814;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StartJobRunRequest
* @Description 请求参数
*/
@Data
public class StartJobRunRequest{
    /**工作空间ID*/
    @KsYunField(name="WorkspaceId")
    private String WorkspaceId;

    /**AK
用于API请求认证*/
    @KsYunField(name="AccessKeyId")
    private String AccessKeyId;

    /**SK
用于API请求认证
*/
    @KsYunField(name="AccessKeySecret")
    private String AccessKeySecret;

    /**Spark版本*/
    @KsYunField(name="ReleaseVersion")
    private String ReleaseVersion;

    /***/
    @KsYunField(name="SparkSubmitData")


}