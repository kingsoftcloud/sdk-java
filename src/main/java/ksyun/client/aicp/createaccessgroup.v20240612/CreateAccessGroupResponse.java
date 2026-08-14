package ksyun.client.aicp.createaccessgroup.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateAccessGroupResponse
* @Description CreateAccessGroup 返回体
*/
@Data
@ToString
public class CreateAccessGroupResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**权限组ID*/
    @JsonProperty("AccessGroupId")
    private String AccessGroupId;

}
