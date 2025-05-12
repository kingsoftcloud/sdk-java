package ksyun.client.aicp.describedataset.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DescribeDatasetResponse
 * @Description DescribeDataset 返回体
 */
@Data
@ToString
public class DescribeDatasetResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
