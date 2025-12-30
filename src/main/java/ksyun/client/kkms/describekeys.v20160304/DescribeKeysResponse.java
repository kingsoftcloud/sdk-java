package ksyun.client.kkms.describekeys.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeKeysResponse
* @Description DescribeKeys 返回体
*/
@Data
@ToString
public class DescribeKeysResponse extends BaseResponseModel {

    /**
- 请求ID
- 类型: String

#### */
    @JsonProperty("RequestId")
    private String RequestId;

}
