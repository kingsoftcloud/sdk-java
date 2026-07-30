package ksyun.client.aicp.modifystorageconfigaccessrole.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyStorageConfigAccessRoleResponse
* @Description ModifyStorageConfigAccessRole 返回体
*/
@Data
@ToString
public class ModifyStorageConfigAccessRoleResponse extends BaseResponseModel {

    /**存储配置ID*/
    @JsonProperty("StorageConfigId")
    private String StorageConfigId;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
