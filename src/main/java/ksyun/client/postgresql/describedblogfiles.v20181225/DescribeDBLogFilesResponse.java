package ksyun.client.postgresql.describedblogfiles.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeDBLogFilesResponse
 * @Description DescribeDBLogFiles 返回体
 */
@Data
@ToString
public class DescribeDBLogFilesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
