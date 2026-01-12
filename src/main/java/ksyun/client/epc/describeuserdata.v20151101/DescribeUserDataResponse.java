package ksyun.client.epc.describeuserdata.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeUserDataResponse
* @Description DescribeUserData 返回体
*/
@Data
@ToString
public class DescribeUserDataResponse extends BaseResponseModel {

    /***/
    @JsonProperty("HostId")
    private String HostId;

    /***/
    @JsonProperty("UserDefinedData")
    private String UserDefinedData;

}
