package ksyun.client.aicp.deleteaccessgroup.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteAccessGroupResponse
* @Description DeleteAccessGroup 返回体
*/
@Data
@ToString
public class DeleteAccessGroupResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**权限组ID*/
    @JsonProperty("AccessGroupId")
    private String AccessGroupId;

}
