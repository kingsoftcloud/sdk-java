package ksyun.client.kpfs.enablefiledeletepolicy.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname EnableFileDeletePolicyRequest
* @Description 请求参数
*/
@Data
public class EnableFileDeletePolicyRequest{
    /**文件系统的实例ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**文件删除策略ID*/
    @KsYunField(name="FileDeletePolicyId")
    private String FileDeletePolicyId;

}
