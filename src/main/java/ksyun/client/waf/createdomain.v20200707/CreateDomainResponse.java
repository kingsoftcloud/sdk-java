package ksyun.client.waf.createdomain.v20200707;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateDomainResponse
* @Description CreateDomain 返回体
*/
@Data
@ToString
public class CreateDomainResponse extends BaseResponseModel {

    /**

- 描述：请求ID
- 类型：String

#### */
    @JsonProperty("RequestId")
    private String RequestId;

}
