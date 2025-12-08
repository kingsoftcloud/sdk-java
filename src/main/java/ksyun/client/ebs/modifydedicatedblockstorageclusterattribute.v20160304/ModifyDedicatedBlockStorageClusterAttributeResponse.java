package ksyun.client.ebs.modifydedicatedblockstorageclusterattribute.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyDedicatedBlockStorageClusterAttributeResponse
* @Description ModifyDedicatedBlockStorageClusterAttribute 返回体
*/
@Data
@ToString
public class ModifyDedicatedBlockStorageClusterAttributeResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("DbscId")
    private String DbscId;

}
