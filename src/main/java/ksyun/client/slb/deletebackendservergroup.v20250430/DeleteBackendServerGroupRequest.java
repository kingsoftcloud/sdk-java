package ksyun.client.slb.deletebackendservergroup.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteBackendServerGroupRequest
* @Description 请求参数
*/
@Data
public class DeleteBackendServerGroupRequest{
    /**服务器组id*/
    @KsYunField(name="BackendServerGroupId")
    private String BackendServerGroupId;

}
