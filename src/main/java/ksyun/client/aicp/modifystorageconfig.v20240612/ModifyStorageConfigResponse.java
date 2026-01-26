package ksyun.client.aicp.modifystorageconfig.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname ModifyStorageConfigResponse
 * @Description ModifyStorageConfig 返回体
 */
@Data
@ToString
public class ModifyStorageConfigResponse extends BaseResponseModel {

    /**
     * 存储配置ID
     */
    @JsonProperty("StorageConfigId")
    private String StorageConfigId;

    /**
     * 请求ID
     */
    @JsonProperty("RequestId")
    private String RequestId;

}
