package ksyun.client.sqlserver.describecollations.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCollationsResponse
* @Description DescribeCollations 返回体
*/
@Data
@ToString
public class DescribeCollationsResponse extends BaseResponseModel {

    /**返回字符集列表

```json
注意：返回较多，此处返回示例为部分
```*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Collations")
        private List<String> Collations;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
