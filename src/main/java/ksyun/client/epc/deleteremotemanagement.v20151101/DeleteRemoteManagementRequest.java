package ksyun.client.epc.deleteremotemanagement.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteRemoteManagementRequest
 * @Description 请求参数
 */
@Data
public class DeleteRemoteManagementRequest {
    /**
     * 带外管理的ID
     */
    @KsYunField(name = "RemoteManagementId")
    private String RemoteManagementId;


}