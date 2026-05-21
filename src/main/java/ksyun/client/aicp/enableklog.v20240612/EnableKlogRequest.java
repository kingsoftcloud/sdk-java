package ksyun.client.aicp.enableklog.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname EnableKlogRequest
* @Description 请求参数
*/
@Data
public class EnableKlogRequest{
    /**资源组ID*/
    @KsYunField(name="ResourcePoolId")
    private String ResourcePoolId;

    /**是否开启klog*/
    @KsYunField(name="EnableKlog")
    private Boolean EnableKlog;

    /**日志工程名*/
    @KsYunField(name="LogProjectName")
    private String LogProjectName;

}
