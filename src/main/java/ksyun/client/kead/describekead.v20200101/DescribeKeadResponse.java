package ksyun.client.kead.describekead.v20200101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeKeadResponse
* @Description DescribeKead 返回体
*/
@Data
@ToString
public class DescribeKeadResponse extends BaseResponseModel {
    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
