package ksyun.client.dts.describeconsistencycheck.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeConsistencyCheckResponse
* @Description DescribeConsistencyCheck 返回体
*/
@Data
@ToString
public class DescribeConsistencyCheckResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("TaskId")
        private String TaskId;

        /**一致性检查周期*/
        @JsonProperty("ConsistencyCheckCycle")
        private Integer ConsistencyCheckCycle;

        /**一致性检查固定时间*/
        @JsonProperty("ConsistencyCheckFixedTime")
        private String ConsistencyCheckFixedTime;

        /**一致性检查自动与否

```json
True表示开启，False表示关闭
```*/
        @JsonProperty("ConsistencyCheckAuto")
        private String ConsistencyCheckAuto;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
