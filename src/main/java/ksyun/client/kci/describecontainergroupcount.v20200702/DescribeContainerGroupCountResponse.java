package ksyun.client.kci.describecontainergroupcount.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DescribeContainerGroupCountResponse
 * @Description DescribeContainerGroupCount 返回体
 */
@Data
@ToString
public class DescribeContainerGroupCountResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
