package ksyun.client.aicp.enablekpfscomponent.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname EnableKpfsComponentRequest
* @Description 请求参数
*/
@Data
public class EnableKpfsComponentRequest{
    /**资源组id*/
    @KsYunField(name="ResourcePoolId")
    private String ResourcePoolId;

    /**文件系统id*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

}
