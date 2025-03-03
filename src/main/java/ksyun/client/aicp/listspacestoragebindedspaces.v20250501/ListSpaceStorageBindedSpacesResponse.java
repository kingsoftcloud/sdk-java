package ksyun.client.aicp.listspacestoragebindedspaces.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ListSpaceStorageBindedSpacesResponse
 * @Description ListSpaceStorageBindedSpaces 返回体
 */
@Data
@ToString
public class ListSpaceStorageBindedSpacesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
