package ksyun.client.dts.describesubtask.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DescribeSubTaskResponse
 * @Description DescribeSubTask 返回体
 */
@Data
@ToString
public class DescribeSubTaskResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
