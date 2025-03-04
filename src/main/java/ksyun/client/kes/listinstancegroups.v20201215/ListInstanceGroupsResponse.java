package ksyun.client.kes.listinstancegroups.v20201215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ListInstanceGroupsResponse
 * @Description ListInstanceGroups 返回体
 */
@Data
@ToString
public class ListInstanceGroupsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
