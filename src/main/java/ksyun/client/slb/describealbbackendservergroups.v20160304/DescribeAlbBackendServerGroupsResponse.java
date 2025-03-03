package ksyun.client.slb.describealbbackendservergroups.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeAlbBackendServerGroupsResponse
 * @Description DescribeAlbBackendServerGroups 返回体
 */
@Data
@ToString
public class DescribeAlbBackendServerGroupsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
