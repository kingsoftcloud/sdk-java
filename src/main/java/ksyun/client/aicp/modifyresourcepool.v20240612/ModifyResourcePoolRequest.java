package ksyun.client.aicp.modifyresourcepool.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyResourcePoolRequest
* @Description 请求参数
*/
@Data
public class ModifyResourcePoolRequest{
    /**资源组ID*/
    @KsYunField(name="ResourcePoolId")
    private String ResourcePoolId;

    /**资源组名称*/
    @KsYunField(name="ResourcePoolName")
    private String ResourcePoolName;

    /**配额超发*/
    @KsYunField(name="Overallocate")
    private Boolean Overallocate;

}
