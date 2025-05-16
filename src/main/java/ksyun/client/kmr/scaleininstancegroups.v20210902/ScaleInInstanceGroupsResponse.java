package ksyun.client.kmr.scaleininstancegroups.v20210902;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname ScaleInInstanceGroupsResponse
 * @Description ScaleInInstanceGroups 返回体
 */
@Data
@ToString
public class ScaleInInstanceGroupsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
