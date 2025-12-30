package ksyun.client.kcrs.describenamespaceexist.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeNamespaceExistResponse
* @Description DescribeNamespaceExist 返回体
*/
@Data
@ToString
public class DescribeNamespaceExistResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**是否存在*/
    @JsonProperty("Exist")
    private Boolean Exist;

}
