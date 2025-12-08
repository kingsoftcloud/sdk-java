package ksyun.client.epc.describevpns.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeVpnsResponse
* @Description DescribeVpns 返回体
*/
@Data
@ToString
public class DescribeVpnsResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**连接带外的用户名称*/
    @JsonProperty("UserName")
    private String UserName;

    /**链接带外的密码，10分钟有效*/
    @JsonProperty("Password")
    private String Password;

}
