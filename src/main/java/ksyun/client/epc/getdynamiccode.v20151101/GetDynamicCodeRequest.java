package ksyun.client.epc.getdynamiccode.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetDynamicCodeRequest
* @Description 请求参数
*/
@Data
public class GetDynamicCodeRequest{
    /**带外管理的ID*/
    @KsYunField(name="RemoteManagementId")
    private String RemoteManagementId;

}
