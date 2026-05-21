package ksyun.client.aicp.modifycomponents.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyComponentsRequest
* @Description 请求参数
*/
@Data
public class ModifyComponentsRequest{
    /**	
资源池ID*/
    @KsYunField(name="ResourcePoolId")
    private String ResourcePoolId;

    /**安装组件列表*/
    @KsYunField(name="Components",type=2)
    private List<String> ComponentsList;

}
